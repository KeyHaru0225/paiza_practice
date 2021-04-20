// ABC67 A.Sharing Cookies

// 81ms/32,476KB 下の人の真似た　問題文はちゃんと読みましょう(2回目)
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
          
            if(a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0){
            	System.out.println("Possible");
            } else {
            	System.out.println("Impossible");
            }
          
        }
    }
}

// 誰 121ms/35,312KB
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}

