// ABC105 A.AtCoder Crackers


// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int k = Integer.parseInt(chr[1]);
          
            int quo = n/k; 
            int rem = n%k;
          
            if(quo == 0){
            	System.out.println(0);
            } else if (rem != 0) {
            	System.out.println(rem);
            } else {
            	System.out.println("");
            }
          
        }
    }
}

// 下の人の真似た　81ms/32,508KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int k = Integer.parseInt(chr[1]);

            int ans = n%k;
          
            if(ans == 0){
            	System.out.println(0);
            } else {
            	System.out.println(1);
            }
          
        }
    }
}


// 誰かの答え1  119ms/35,664KB
import java.util.Scanner;

class Main{
 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   int k = scan.nextInt();
   int ans;
   
   if(n % k == 0){
   	ans = 0;
   } else {
    ans = 1;
   }
   
   System.out.print(ans);
 }
}


// 116ms/35,744KB
import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(a%b!=0 ? 1 : 0);
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}
}