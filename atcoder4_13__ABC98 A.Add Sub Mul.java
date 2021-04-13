// ABC98 A.Add Sub Mul


// 84ms/32,648KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
          
            int max = Math.max(a + b, Math.max(a - b, a * b));
            System.out.println(max);
          
        }
    }
}


// 誰　84ms/32,732KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int a = fs.nextInt(), b = fs.nextInt();
        out.println(Math.max(a + b, Math.max(a - b, a * b)));

        out.close();
    }

    static boolean isPrime(long x) {
        if (x <= 1)
            return false;
        for (long i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void sort(int[] a) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i : a)
            l.add(i);
        Collections.sort(l);
        for (int i = 0; i < a.length; i++)
            a[i] = l.get(i);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(new FileReader("fileName.in"));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

}