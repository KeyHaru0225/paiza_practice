// ABC23 A.加算王

// CE
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	String x = sc.next();
      
        String ans1 = x.substring(0);
        String ans2 = x.substring(1);
      
        int ans1 = Integer.valueOf(ans1);
        int ans2 = Integer.valueOf(ans2);
      
        System.out.println(ans1 + ans2);
      
    }
}

// 86ms/32,476KB　下の人の真似た
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int x = Integer.parseInt(chr[0]);
          
            System.out.println(x/10 + x%10);
        }
    }
}


// 1 123ms/35,612KB
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();

		int tens = x / 10;
		int ones = x % 10;
		int ans = tens + ones;

		System.out.println(ans);
	}
}