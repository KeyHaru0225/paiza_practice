// ABC188 D.Snuke Prime

//　問題文はわかった

// 誰1  661ms/82,624KB
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Reader input = new Reader();
		int N = input.nextInt();
		int C = input.nextInt();
		TreeMap<Long,Long> t = new TreeMap<>();
		
		for(int i = 0; i < N; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long c = input.nextLong();
			t.put(a, t.getOrDefault(a, 0L) + c);
			t.put(b+1, t.getOrDefault(b+1, 0L) - c);
		}

		long ans = 0;
		long prevT = 0;
		long total = 0;
		
		for(Entry<Long, Long> p : t.entrySet()) {
			ans += Math.min(C, total) * (p.getKey() - prevT);
			prevT = p.getKey();
			total += p.getValue();
		}
		
		System.out.println(ans);
	}	
	
	static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
 
        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(
                new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                buf[cnt++] = (byte)c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (neg)
                return -ret;
            return ret;
        }
 
        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }
 
        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
 
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
 
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
 
            if (neg)
                return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0,
                                 BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }
 
        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }
}


// 誰2 13,72ms/81,152KB
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		TreeMap<Integer, Long> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt() + 1;
			int c = sc.nextInt();
			map.put(a, map.getOrDefault(a, 0L) + c);
			map.put(b, map.getOrDefault(b, 0L) - c);
		}
		sc.close();

		map.put(1001001001, 0L);
		long ans = 0;
		long x = 0;
		while (map.size() > 1) {
			Entry<Integer, Long> e = map.pollFirstEntry();
			x += e.getValue();
			int l = e.getKey();
			int r = map.firstKey();
			ans += Math.min(x, m) * (r - l);
		}
		System.out.println(ans);
	}
}


