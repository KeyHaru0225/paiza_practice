// ABC206 A.Maxi-Buying

// 79ms/32,520KB
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
          String chr[] = in.split(" ");
          int n = Integer.parseInt(chr[0]);
          
          int ans = (int)(n * 1.08);
          
          if (ans < 206) {
          	System.out.println("Yay!");
          } else if (ans == 206) {
          	System.out.println("so-so");
          } else {
          	System.out.println(":(");
          }
        }
    }
}




// 誰
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int x = (int)(1.08*N);

            if (x < 206)
            {
                System.out.println("Yay!");
            } else if(x == 206) {
                System.out.println("so-so");
            } else {
                System.out.println(":(");
            }
        }
    }
}