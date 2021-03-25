// ABC155 A.Poor

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
            int c = Integer.parseInt(chr[2]);
          
            if(a == b && b == c || !(a == b) && !(b == c)){
            	System.out.println("No");
            } else if(a == b && !(b == c) || !(a == b) && b == c || a == c && !(c == b)) {
                System.out.println("Yes");
            } else {
            	System.out.println("");
            }
          
        }
    }
}


//下の人の真似したら正解
//あまり細かく分岐しない方が良いのかもしれない
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
            int c = Integer.parseInt(chr[2]);
          
            if(a == b && !(b == c) || b == c && !(c == a) || a == c && !(c == b)){
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
          
        }
    }
}


//誰かの答え
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
 
		if(a == b && b != c || b == c && c != a || a == c && c != b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}