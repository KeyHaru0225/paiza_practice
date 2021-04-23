// ABC55 A.Restaurant


// 80ms/32,160KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
          
            System.out.println((800 * n) - (n / 15) * 200);
        }
    }
}



// 1 119ms/35,692KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println((800 * n) - (n / 15) * 200);
	}	
}