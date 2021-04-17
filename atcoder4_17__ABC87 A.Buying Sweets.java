// ABC87 A.Buying Sweets

// RE いみふ
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
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);
          
            int balance = x - a;
          
            System.out.println(balance % b);
        }
    }
}

// 誰 120ms/35,700KB
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((x - a) % b);
    }
}