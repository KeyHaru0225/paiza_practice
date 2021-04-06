// ABC125 A.Biscuit Generator

// CE
/*
./Main.java:18: error: not a statement
            for(int i=a; i<=t; i*2){
                                ^
./Main.java:19: error: ';' expected
            	int count += b;
            	         ^
./Main.java:19: error: not a statement
            	int count += b;
            	             ^
3 errors
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
			int t = Integer.parseInt(chr[2]) + 0.5;
          
            int count = 0;
          
            for(int i=a; i<=t; i*2){
            	int count += b;
            }
          
            System.out.println(count);
        }
    }
}


// 下の人の参考にして正解　78ms/32,636KB
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
			int t = Integer.parseInt(chr[2]);
           
            System.out.println(t/a*b);
            
        }
    }
}


// 誰かの答え1 118ms/35,488KB
import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
      	int a=sc.nextInt();
      	int b=sc.nextInt();
      	int t=sc.nextInt();
      	System.out.println(t/a*b);
    }
}


// 誰かの答え2  120ms/35,304KB
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();
		
		int time = (int) (t + 0.5);
		System.out.println((time / a) * b);
	}
}