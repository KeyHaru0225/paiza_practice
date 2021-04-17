// ABC86 A.Product

// 80ms/32,796KB
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
          
            int ans = a*b;
          
            if(ans%2 == 0){
            	System.out.println("Even");
            } else {
            	System.out.println("Odd");
            }
        }
    }
}


// 誰　119ms/35,520KB
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String outPutString = makeOutPutString(sc);
		System.out.println(outPutString);
		sc.close();
	}

	private static String makeOutPutString(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (isEven(a) || isEven(b)) {
			return "Even";
		} else {
			return "Odd";
		}
	}

	private static boolean isEven(int i) {
		int j = i % 2;
		return j == 0;
	}
}
