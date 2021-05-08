// ABC1 A.積雪深差

// RE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int h1 = Integer.parseInt(chr[0]);
			int h2 = Integer.parseInt(chr[1]);
          
            System.out.println(h1 - h2);
          
        }
    }
}

// 1 123ms/35,604KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1 = sc.nextInt();
		int h2 = sc.nextInt();
		
		int ans = h1 - h2;
		System.out.println(ans);
	} 
}