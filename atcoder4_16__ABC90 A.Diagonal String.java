// ABC90 A.Diagonal String


// たぶん考えたら分かるけど頭痛酷いのとしんどいので頭回らん
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      
        String str = sc.next();
        String[] c1 = str.split("");  
        String[] c2 = str.split("");
        String[] c3 = str.split("");
      
        for(int i = 0; i<str.length(); i++){
        	if(s[i].equals("+")){
            	count += 1;
            } else {
            	count -= 1;
            }
        }
      
      System.out.println(count);
      
    }
}


//  誰1 116ms/35,504KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c1 = sc.next().toCharArray();
		char[] c2 = sc.next().toCharArray();
		char[] c3 = sc.next().toCharArray();
		
		StringBuilder sb = new StringBuilder();
		sb.append(c1[0]);
		sb.append(c2[1]);
		sb.append(c3[2]);
		
		System.out.println(sb.toString());
	}
}

// 誰2(CAPTAINGH) 98ms/34,172KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        String s1 = fs.next(), s2 = fs.next(), s3 = fs.next();
        out.printf("%c%c%c", s1.charAt(0), s2.charAt(1), s3.charAt(2));

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