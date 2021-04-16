// ABC92 A.Traveling Budget

// RE　いみふ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);
            int d = Integer.parseInt(chr[3]);
          
            System.out.print(Math.min(a, b) + Math.min(c, d));
            
        }
    }
}


// 誰1 120ms/35,444KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int r = Math.min(a, b);
		r += Math.min(c, d);
		
		System.out.println(r);
	}
}


// 誰2 117ms/35,560KB
import java.util.Scanner;
import java.lang.Math;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    
    System.out.print(Math.min(a, b) + Math.min(c, d));
  }
}