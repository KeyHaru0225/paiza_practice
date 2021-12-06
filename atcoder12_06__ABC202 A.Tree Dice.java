// ABC202 A.Three Dice

// 76ms/32,692KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;


public class Main {
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
          String chr[] = in.split(" ");
          int a = Integer.parseInt(chr[0]);
          int b = Integer.parseInt(chr[1]);
          int c = Integer.parseInt(chr[2]);
          
          int a1 = Math.abs(7 - a);
          int b1 = Math.abs(7 - b);
          int c1 = Math.abs(7 - c);
          
          System.out.println(a1 + b1 + c1);
          
          
        }
    }
}



// 誰　106ms/35,720KB
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(21-(a+b+c));
    }
}