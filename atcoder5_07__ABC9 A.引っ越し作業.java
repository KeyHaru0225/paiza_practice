// ABC A.引っ越し作業

// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
          
            if(n % 2 == 0 || n != 1) {
            	System.out.println(n/2);
            } else if (n == 1) {
            	System.out.println(1);
            } else {
            	System.out.println(n / 2 + 1);
            }
          
        }
    }
}

// 1 124ms/35,644KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int division = n / 2;
		int remainder = n % 2;

		if(remainder == 0) {
			System.out.println(division);
		} else {
			System.out.println(division + 1);
		}
	}
}

// 2 119ms/35,804KB
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = (int) Math.ceil(N / 2.0);

        System.out.println(result);
    }
}

