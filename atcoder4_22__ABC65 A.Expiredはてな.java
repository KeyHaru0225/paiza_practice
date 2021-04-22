// ABC65 A.Expired?

//　30分は考えたけど計算式が思い浮かばん…
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int x = Integer.parseInt(chr[0]);
            int a = Integer.parseInt(chr[1]);
            int b = Integer.parseInt(chr[2]);
        }
    }
}

// 誰2真似たら正解　77ms/32,520KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int x = Integer.parseInt(chr[0]);
            int a = Integer.parseInt(chr[1]);
            int b = Integer.parseInt(chr[2]);
            
                if (a >= b) {
                System.out.println("delicious");
            } else if (a + x >= b) {
                System.out.println("safe");
            } else {
                System.out.println("dangerous");
            }
        }
    }
}


// 誰1 110ms/35,652KB
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), a = scan.nextInt(), b = scan.nextInt();
        b -= a;
        if (b <= 0) System.out.println("delicious");
        else if (b <= x) System.out.println("safe");
        else System.out.println("dangerous");
    }
}

// 誰2 114ms/35,776KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a >= b) {
			System.out.println("delicious");
		} else if (a + x >= b) {
			System.out.println("safe");
		} else {
			System.out.println("dangerous");
		}
		
	}
}


