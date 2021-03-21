// ABC169 A.Multiplication 1

//舐めてんのかってぐらい簡単
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        int a = sc.nextInt();
        int b = sc.nextInt();
      
        System.out.println(a * b);
    }
}


//誰かの答え
//高速だが、メモリ消費量はあまり私と変わらない
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
        out.print(a * b);
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