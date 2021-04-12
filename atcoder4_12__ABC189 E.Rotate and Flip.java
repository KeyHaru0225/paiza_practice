// ABC189 E.Rotate and Flip

// 問題文はなんとなくわかった。


// 誰1　907ms/62,696KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			String[] sa = br.readLine().split(" ");
			x[i] = Integer.parseInt(sa[0]);
			y[i] = Integer.parseInt(sa[1]);
		}

		int m = Integer.parseInt(br.readLine());
		int[] xa = new int[m + 1];
		int[] ya = new int[m + 1];
		long[] xb = new long[m + 1];
		long[] yb = new long[m + 1];
		boolean[] z = new boolean[m + 1];
		xa[0] = 1;
		ya[0] = 1;
		for (int i = 0; i < m; i++) {
			String[] sa = br.readLine().split(" ");
			int t = Integer.parseInt(sa[0]);
			if (t == 1) {
				xa[i + 1] = ya[i];
				ya[i + 1] = -xa[i];
				xb[i + 1] = yb[i];
				yb[i + 1] = -xb[i];
				z[i + 1] = !z[i];

			} else if (t == 2) {
				xa[i + 1] = -ya[i];
				ya[i + 1] = xa[i];
				xb[i + 1] = -yb[i];
				yb[i + 1] = xb[i];
				z[i + 1] = !z[i];

			} else if (t == 3) {
				int p = Integer.parseInt(sa[1]);
				xa[i + 1] = -xa[i];
				ya[i + 1] = ya[i];
				xb[i + 1] = 2 * p - xb[i];
				yb[i + 1] = yb[i];
				z[i + 1] = z[i];

			} else {
				int p = Integer.parseInt(sa[1]);
				xa[i + 1] = xa[i];
				ya[i + 1] = -ya[i];
				xb[i + 1] = xb[i];
				yb[i + 1] = 2 * p - yb[i];
				z[i + 1] = z[i];
			}
		}

		PrintWriter pw = new PrintWriter(System.out);
		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]);
			int b = Integer.parseInt(sa[1]) - 1;
			long vx = xa[a] * (z[a] ? y[b] : x[b]) + xb[a];
			long vy = ya[a] * (z[a] ? x[b] : y[b]) + yb[a];
			pw.println(vx + " " + vy);
		}
		pw.flush();
		br.close();
	}
}


// 誰2 292ms/53,020KB
import java.io.*;
import java.util.*;

public class Main {
    static MyReader in = new MyReader();
    static MyWriter out = new MyWriter();

    public static void main(String[] args) {
        int N = in.i();
        int[] XY = in.ii(N << 1);

        int M = in.i();

        long[][] A = new long[M + 1][6];
        A[0][0] = A[0][4] = 1;

        long[] t = new long[3];
        for (int i = 1; i <= M; i++) {
            System.arraycopy(A[i - 1], 0, A[i], 0, 6);
            int n = in.i();
            rev(A[i], (n & 1) == 1 ? 0 : 3);
            if (n < 3) {
                swap(A[i], t);
            } else {
                int p = in.i();
                A[i][n == 3 ? 2 : 5] += p << 1;
            }
        }

        int Q = in.i();
        for (int i = 0; i < Q; i++) {
            int a = in.i();
            int b = in.i() - 1;
            long[] c = A[a];
            long x = c[0] * XY[b << 1] + c[1] * XY[b << 1 | 1] + c[2];
            long y = c[3] * XY[b << 1] + c[4] * XY[b << 1 | 1] + c[5];
            out.printsp(x);
            out.println(y);
        }

        out.flush();
    }

    static void swap(long[] a, long[] t) {
        System.arraycopy(a, 0, t, 0, 3);
        System.arraycopy(a, 3, a, 0, 3);
        System.arraycopy(t, 0, a, 3, 3);
    }

    static void rev(long[] a, int k) {
        a[k] = -a[k];
        a[k + 1] = -a[k + 1];
        a[k + 2] = -a[k + 2];
    }
}

class MyReader {
    byte[] buf = new byte[1 << 16];
    int head = 0;
    int tail = 0;
    InputStream in = System.in;

    byte read() {
        if (head == tail) {
            try {
                tail = in.read(buf);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return buf[head++];
    }

    int i() {
        int i = read() - '0';
        boolean negative = i == -3;
        int n = negative ? 0 : i;
        while (0 <= (i = read() - '0') && i <= 9) {
            n = 10 * n + i;
        }
        return negative ? -n : n;
    }

    int[] ii(int length, int from, int to) {
        int[] a = new int[length];
        for (int i = from; i < to; i++) {
            a[i] = i();
        }
        return a;
    }

    int[] ii(int length) {
        return ii(length, 0, length);
    }

    long l() {
        int i = read() - '0';
        boolean negative = i == -3;
        long n = negative ? 0 : i;
        while (0 <= (i = read() - '0') && i <= 9) {
            n = 10 * n + i;
        }
        return negative ? -n : n;
    }

    long[] ll(int from, int to) {
        long[] a = new long[to];
        for (int i = from; i < to; i++) {
            a[i] = l();
        }
        return a;
    }

    long[] ll(int length) {
        return ll(0, length);
    }

    char[] s(int length) {
        char[] s = new char[length];
        for (int i = 0; i < length; i++) {
            s[i] = (char)read();
        }
        read();
        return s;
    }

    int read(char[] buf, int off) {
        int i;
        char c;
        for (i = off; (c = (char)read()) != ' ' && c != '\n'; i++) {
            buf[i] = c;
        }
        return i;
    }

    int read(char[] buf) {
        return read(buf, 0);
    }
}

class MyWriter {
    OutputStream out = System.out;

    byte[] buf = new byte[1 << 16];
    byte[] ibuf = new byte[20];

    int tail = 0;

    void flush() {
        try {
            out.write(buf, 0, tail);
            tail = 0;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void write(byte b) {
        buf[tail++] = b;
        if (tail == buf.length) {
            flush();
        }
    }

    void write(byte[] b, int off, int len) {
        for (int i = off; i < off + len; i++) {
            write(b[i]);
        }
    }

    void space() {
        write((byte)' ');
    }

    void println() {
        write((byte)'\n');
    }

    void print(char c) {
        write((byte)c);
    }

    void println(char c) {
        print(c);
        println();
    }

    void print(int n) {
        if (n < 0) {
            n = -n;
            write((byte)'-');
        }

        int i = ibuf.length;
        do {
            ibuf[--i] = (byte)(n % 10 + '0');
            n /= 10;
        } while (n > 0);

        write(ibuf, i, ibuf.length - i);
    }

    void println(int n) {
        print(n);
        println();
    }

    void print(long n) {
        if (n < 0) {
            n = -n;
            write((byte)'-');
        }

        int i = ibuf.length;
        do {
            ibuf[--i] = (byte)(n % 10 + '0');
            n /= 10;
        } while (n > 0);

        write(ibuf, i, ibuf.length - i);
    }

    void println(long n) {
        print(n);
        println();
    }

    void print(String s) {
        byte[] b = s.getBytes();
        write(b, 0, b.length);
    }

    void println(String s) {
        print(s);
        println();
    }

    void printsp(long n) {
        print(n);
        space();
    }
}
