// ABC188 E.Peddler

// 誰1 408ms/68,712KB
import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] A;
    static int[] X, Y;

    public static void main(String[] args) {
        var sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = sc.nextIntArray(N);
        X = new int[M];
        Y = new int[M];
        for (int i = 0; i < M; i++) {
            X[i] = sc.nextInt()-1;
            Y[i] = sc.nextInt()-1;
        }

        System.out.println(solve());
    }

    static int solve() {
        var G = adjD(N, X, Y);

        var B = new int[N];
        Arrays.fill(B, -1);
        var ans = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {

            if( B[i] != -1 ) {
                ans = Math.max(ans, A[i] - B[i]);

                B[i] = Math.min(A[i], B[i]);

            } else {
                B[i] = A[i];
            }

            for (int j : G[i]) {
                if( B[j] == -1 ) {
                    B[j] = B[i];

                } else {
                    B[j] = Math.min(B[j], B[i]);
                }
            }
        }
        return ans;
    }

    static int[][] adjD(int n, int[] from, int[] to) {
        int[][] adj = new int[n][];
        int[] cnt = new int[n];
        for (int f : from) {
            cnt[f]++;
        }
        for (int i = 0; i < n; i++) {
            adj[i] = new int[cnt[i]];
        }
        for (int i = 0; i < from.length; i++) {
            adj[from[i]][--cnt[from[i]]] = to[i];
        }
        return adj;
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            var a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            var a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            var a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        var pw = new PrintWriter(System.out);
        for (var a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        var pw = new PrintWriter(System.out);
        for (var a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        var pw = new PrintWriter(System.out);
        for (var i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static void debug(Object... args) {
        var j = new StringJoiner(" ");
        for (var arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}


// 誰2 228ms/66,884KB
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Reader input = new Reader();
		int N = input.nextInt();
		int M = input.nextInt();
		int[] dp = new int[N];
		int[] a = new int[N];
		int ans = Integer.MIN_VALUE;
		List<Integer>[] adjL = new List[N];
		
		for(int i = 0; i < N; i++) {
			adjL[i] = new ArrayList<>();
			dp[i] = Integer.MAX_VALUE;
			a[i] = input.nextInt();
		}
		
		for(int i = 0; i < M; i++) {
			int u = input.nextInt();
			int v = input.nextInt();
			adjL[u-1].add(v-1);
		}
		
		for(int i = 0; i < N; i++) {
			for(int nb : adjL[i]) {
				dp[nb] = Math.min(dp[nb], Math.min(dp[i],a[i]));
			}
		}
		
		for(int i = 0; i < N; i++) {
			ans = Math.max(ans, a[i] - dp[i]);
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
