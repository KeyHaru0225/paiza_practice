// ABC3 A.AttCoder社の給料

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
            int count = 0;
          
            for(int i = 1; i <= n; i++) {
            	count += 10000 * i * (1/6) ;
            }
          
          System.out.println(count);
        }
    }
}

// 81ms/32,540KB　下の人の真似た
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            int count = 0;
          
            for(int i = 1; i <= n; i++) {
            	count += 10000 * i;
            }
          count /= n;
          System.out.println(count);
        }
    }
}

// 1 117ms/35,740KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;

		for(int i = 1; i <= n; i++) {
			ans += 10000 * i;
		}
		ans /= n;
		System.out.println(ans);
	} 
}