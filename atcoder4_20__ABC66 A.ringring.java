// ABC66 A.ringring

// 82ms/32,444KB
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
			int c = Integer.parseInt(chr[2]);
          
            System.out.println(Math.min((a + b), Math.min(b + c, a + c)));
          
        }
    }
}

// 誰　121ms/35,620KB
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] array = new int[]{a,b,c};
		Arrays.sort(array);
		
		System.out.println(array[0] + array[1]);
	}
}	