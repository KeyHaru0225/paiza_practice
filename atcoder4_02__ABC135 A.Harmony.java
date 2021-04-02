// ABC135 A.Harmony

// CE
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
          
            int k = 0;
          
            for(int i=0; i++;){
            	k = i;
                  if(Math.abs(a-k) == Math.abs(b-k)){
                  	System.out.printnln(k);
                  } 
                break;
            }
          
            if(Math.abs(a-k) != Math.abs(b-k)){
                  	System.out.println("IMPOSSIBLE");  
            }
          
          
        }
    }
}


/*
./Main.java:19: error: cannot find symbol
                  	System.out.printnln(k);
                  	          ^
  symbol:   method printnln(int)
  location: variable out of type PrintStream
1 error
*/
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
          
            int k = 0;
          
            for(int i=0; i<=100_000_000_0; i++){
            	k = i;
                  if(Math.abs(a-k) == Math.abs(b-k)){
                  	System.out.printnln(k);
                  } 
                break;
            }
          
            if(Math.abs(a-k) != Math.abs(b-k)){
                  	System.out.println("IMPOSSIBLE");  
            }
          
          
        }
    }
}


// 正解(下の人の答え見た) 82ms/32,160KB
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
          
           if((a + b) % 2 == 0) {
			System.out.println((a + b) / 2);
            } else {
                System.out.println("IMPOSSIBLE");
            }

        }
    }
}


// 誰かの答え1 119ms/35,772KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if((a + b) % 2 == 0) {
			System.out.println((a + b) / 2);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}


// 誰かの答え2 74ms/32,968KB
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

        if ((a + b) % 2 == 0)
            out.println((a + b) / 2);
        else
            out.println("IMPOSSIBLE");

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