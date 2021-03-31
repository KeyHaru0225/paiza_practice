// ABC139 A.Tenki

// CE　わかんね
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            String[] s = in.readString(chr[0]);
            String[] t = in.readString(chr[1]);
          
            int count = 0;
		
            for (int i = 0; i < 3; i++) {
				if (s[i].equals(t[i])){
				count++;
			    }
		    }
		    System.out.println(count);
	
        }
    }
}


// 誰かの答え1
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] s = sc.next().split("");
		String [] t = sc.next().split("");
		int count = 0;
		for (int i = 0; i < 3; i++) {
			if (s[i].equals(t[i])){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}


// 誰かの答え2
import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int answer = 0;
        for(int i = 0; i < 3; i++){
            if(a.charAt(i) == b.charAt(i)){
                answer = answer+1;
            }
        }      
          System.out.println(answer);
    }
}


// 誰かの答え3
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        String s = fs.next(), t = fs.next();
        int ans = 0;

        if (s.charAt(0) == t.charAt(0))
            ans++;
        if (s.charAt(1) == t.charAt(1))
            ans++;
        if (s.charAt(2) == t.charAt(2))
            ans++;

        out.println(ans);

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