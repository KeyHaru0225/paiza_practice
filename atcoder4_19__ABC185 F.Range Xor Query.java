// ABC185 F.Range Xor Query

// 問題文、わかるようなわからんような…

// 誰 514ms/70,972KB
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	FastScanner scanner = new FastScanner();
	int n, q;
	long[] a;
	
	public Main() {
		n = scanner.nextInt();
		q = scanner.nextInt();
		a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong();
		}
	}
	
	void solve() {
		SegmentTree st = new SegmentTree(n);
		
		IntStream.range(0, n).forEach(i -> {
			st.set(i, a[i]);
		});
		st.build();
		
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < q; i++) {
			if (scanner.nextInt() == 1) {
				int x = scanner.nextInt()-1;
				long y = scanner.nextLong();
				
				st.update(x, st.get(x,x+1)^y);
			} else {
				int x = scanner.nextInt()-1;
				int y = scanner.nextInt();
				
				pw.println(st.get(x, y));
			}
		}
		pw.flush();
		pw.close();
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
}

class SegmentTree {
	private static final long IE = 0;
	
	//葉の長さ
	int len;
	//データと遅延評価
	long[] data;
	
	public SegmentTree(int n) {
		//葉の個数を決める
		int x = 1;
		while (n > x) x <<= 1;
		len = x;
		
		//全体のノード数は(葉のノード数)*2-1
		data = new long[2*x-1];
	}
	
	//葉の左からi番目にvを入れる．セグメント木構築用、buildと合わせて使う．
	void set(int i, long v) {
		data[i + len - 1] = v;
	}
	
	//セグメント木の構築:O(N)
	void build() {
		for (int i = len-2; i >= 0; i--) {
			data[i] = data[2*i+1]^data[2*i+2];
		}
	}
	
	long get(int left, int right) {
		return get(left, right, 0, 0, len);
	}
	
	private long get(int A, int B, int i, int l, int r) {
		if (r <= A || B <= l) {
			return IE;
		} else if (A <= l && r <= B) {
			return data[i];
		} else {
			long vl = get(A, B, i * 2 + 1, l, (l + r) / 2);
			long vr = get(A, B, i * 2 + 2, (l + r) / 2, r);
			
			//要変更
			return vl^vr;
		}
	}
	
	//iをvにする．
	void update(int i, long v) {
		i += len - 1;
		data[i] = v;
		while (i > 0) {
			i = (i - 1) / 2;
			data[i] = data[i*2+1]^data[i * 2 + 2];
		}
	}
	
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}
	
	private int readByte() {
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}
	
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
