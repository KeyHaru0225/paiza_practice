// ABC44 A.高橋君とホテルイージー

// RE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int k = Integer.parseInt(chr[1]);
			int x = Integer.parseInt(chr[2]);
            int y = Integer.parseInt(chr[3]);
          
            System.out.println(k * x + (n-k) * y);
        }
    }
}

// RE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int k = Integer.parseInt(chr[1]);
			int x = Integer.parseInt(chr[2]);
            int y = Integer.parseInt(chr[3]);
          
            if(n == k){
            	System.out.println(n * x);
            } else if(n > k) {
            	System.out.println(k * x + y * (n-k));
            } else {
            	System.out.println(n * x);
            }
        }
    }
}


// 1 121ms/35,788KB
import java.util.Scanner;
import java.io.PrintWriter;

public class Main{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
			int n = in.nextInt();
			int k = in.nextInt();
			int f = in.nextInt();
			int l = in.nextInt();
			if(n==k)
				out.println((n*f));
			else if(n>k)
			{
				int  r = n-k;
				int res = k*f + l * r;
				out.println(res);
			}
			else if(k>n)
			{
				//int r = k - n;
				out.println(n*f);
			}
		out.flush();
	}
}