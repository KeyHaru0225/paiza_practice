// ABC11 A.来月は何月？

// 83ms/32,484KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
          
            if(n <= 11) {
            	System.out.println(n + 1);
            } else {
            	System.out.println(1);
            }
          
        }
    }
}

// 1 117ms/35,620KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = n + 1;

		if(ans == 13) {
			System.out.println(1);
		} else {
			System.out.println(ans);
		}
	}
}