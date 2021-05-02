// ABC32 A.高橋君と青木君の好きな数

// 難しいわからん。たぶん最小公倍数求めるんやろうけど…
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
			int n = Integer.parseInt(chr[2]);
          
          
        }
    }
}

// RE
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
			int n = Integer.parseInt(chr[2]);

          while(true){
			if (n % a == 0 && n % b == 0) {
				System.out.println(n);
				break;
            }
			n++;
          }
          
        }
    }
}

// 1 114ms/35,716KB
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();
		while(true){
			if (n % a == 0 && n % b == 0) {
				System.out.println(n);
				break;
			}
			n++;
		}
		scanner.close();
	}
}