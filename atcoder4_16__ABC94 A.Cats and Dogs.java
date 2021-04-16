// ABC94 A.Cats and Dogs


//  WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
            int x = Integer.parseInt(chr[2]);
          
            if(b > x && x > a){
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
          
        }
    }
}

// 82ms/32,672KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
            int x = Integer.parseInt(chr[2]);
          
            if(a <= x && a+b >= x){
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
          
        }
    }
}



// 誰1 117ms/35,492KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		
		if (a <= x && a+b >= x) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}


// 誰2 103ms/26,980KB
import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int X = 0;
		do {
			A = input.nextInt();
			B = input.nextInt();
			X = input.nextInt();
		}while(A < 1 || A > 100 || B < 1 || B > 100 || X < 1 || X > 200 );
		if(A + B < X || A > X) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}