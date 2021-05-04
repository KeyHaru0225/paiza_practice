// ABC24 A.動物園

// RE　イミフ
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
            int k = Integer.parseInt(chr[3]);
			int s = Integer.parseInt(chr[4]);
            int t = Integer.parseInt(chr[5]);
          
            if(s + t >= k) {
            	System.out.println(s*a + t*b - c*(s + t));
            } else {
            	System.out.println(s*a + t*b);
            }
          
        }
    }
}


// 1  121ms/35,624KB
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();

		int childPrice = a * s;
		int adultPrice = b * t;
		int totalPrice = childPrice + adultPrice;
		int totalNumber = s + t;

		if(totalNumber >= k) {
			totalPrice -= totalNumber * c;
		}
		System.out.println(totalPrice);
	}
}