// ABC143 A.Curtain

// 正解 78ms/32,448KB
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
          
            if(a-b*2 <= 0){
            	System.out.println(0);
            } else {
            	System.out.println(a-b*2);
            }
          
        }
    }
}


// 誰かの答え 84ms/32,732KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
        int a = fs.nextInt(), b = fs.nextInt();
        if (b + b > a) {
            out.println(0);
        } else {
            out.println(a - b - b);
        }
 
        out.close();
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