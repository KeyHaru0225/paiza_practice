// ABC63 A.Restricted

// 78ms/32,464KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
          
            if(a + b >= 10){
            	System.out.println("error");
            } else {
            	System.out.println(a + b);
            }
          
        }
    }
}

// 誰　79ms/32,292KB
import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int A = in.i();
        int B = in.i();
        int sum = A + B;
        if (sum < 10) {
            System.out.println(sum);
        } else {
            System.out.println("error");
        }
    }
}

class MyReader {
    byte[] buf = new byte[1 << 16];
    int head = 0;
    int tail = 0;
    InputStream in = System.in;

    byte next() {
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
        int k = next() - '0';
        boolean minus = k == -3;
        int n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        int k = next() - '0';
        boolean minus = k == -3;
        long n = minus ? 0 : k;
        while (0 <= (k = next() - '0') && k <= 9) n = 10 * n + k;
        return minus ? -n : n;
    }

    char[] s(final int N) {
        char[] s = new char[N];
        for (int i = 0; i < N; i++) {
            s[i] = (char)next();
        }
        next();
        return s;
    }

    public int read(char[] buf) {
        int i;
        char c;
        for (i = 0; (c = (char)next()) != ' ' && c != '\n'; i++) buf[i] = c;
        return i;
    }
}
