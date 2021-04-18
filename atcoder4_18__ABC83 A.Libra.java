// ABC83 A.Libra

// 80ms/32,568KB
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
            int d = Integer.parseInt(chr[3]);
          
            int L = a + b;
            int R = c + d;
          
            if(L>R){
            	System.out.println("Left");
            } else if(L == R) {
            	System.out.println("Balanced");
            } else {
            	System.out.println("Right");
            }
          
        }
    }
}


// 誰　117ms/35,424KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ab = sc.nextInt() + sc.nextInt();
		int cd = sc.nextInt() + sc.nextInt();
		
		if (ab - cd > 0) {
			System.out.println("Left");
		} else if (ab - cd < 0) {
			System.out.println("Right");
		} else {
			System.out.println("Balanced");
		}
	}
}