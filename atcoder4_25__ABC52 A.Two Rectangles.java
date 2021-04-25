// ABC52 A.Two Rectangles

// 78ms/32,460KB
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
			int c = Integer.parseInt(chr[2]);
            int d = Integer.parseInt(chr[3]);
          
            int ans1 = a * b;
            int ans2 = c * d;
          
            if(ans1 >= ans2){
            	System.out.println(ans1);
            } else {
            	System.out.println(ans2);
            }
          
        }
    }
}


// 1 117ms/35,620KB
import java.util.*;
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      
      int S = Math.max((A*B),(C*D));
      
      System.out.println(S);
    }
}