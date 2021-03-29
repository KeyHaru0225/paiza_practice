// ABC145 A.Circle

// RE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            int r = Integer.parseInt(br.readLine());

            double ans = r*r*Math.PI / Math.PI;
          
            System.out.println((int)ans);
          
        }
    }
}


// 正解
// 問題文と例文をきちんと見ましょう
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int r = Integer.parseInt(chr[0]);

            System.out.println((int)Math.pow(r,2));
          
        }
    }
}


// 誰かの答え
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt(); 
		int ans = (int) Math.pow(a, 2);
 
			System.out.println(ans);
		}
		
		
}