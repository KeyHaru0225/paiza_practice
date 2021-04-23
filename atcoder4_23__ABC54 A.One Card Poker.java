// ABC54 A.One Card Poker

// 82ms/32,444KB 誰1真似した
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
          
                if(a == 1 && b != 1) {
                System.out.println("Alice");
            } else if(a != 1 && b == 1) {
                System.out.println("Bob");
            } else if (a > b) {
                System.out.println("Alice");
            } else if(a < b) {
                System.out.println("Bob");
            } else if (a == b) {
                System.out.println("Draw");
            }
          
        }
    }
}


// 1 116ms/35,620KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a == 1 && b != 1) {
			System.out.println("Alice");
		} else if(a != 1 && b == 1) {
			System.out.println("Bob");
		} else if (a > b) {
			System.out.println("Alice");
		} else if(a < b) {
			System.out.println("Bob");
		} else if (a == b) {
			System.out.println("Draw");
		}
	}	
}

// 2 111ms/35,588KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if (A == B ) System.out.println("Draw");
		else if((A > B || A == 1) && B != 1) System.out.println("Alice");
		else System.out.println("Bob");
	}
}