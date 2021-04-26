// ABC42 A.和風いろはちゃんイージー

// 81ms/32,520KB
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
			int c = Integer.parseInt(chr[2]);
          
            if(a == 5 && b == 5 && c == 5 || a == 7 && b == 7 && c == 7 || 
               a == 7 && b == 7 && c == 5 || a == 7 && b == 5 && c == 7 ||
               a == 5 && b == 7 && c == 7){
            	System.out.println("NO");
            } else {
            	System.out.println("YES");
            }
          
        }
    }
}

// 1 82ms/32,552KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int INF = 1000000000;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int R = Integer.parseInt(str[0]);
		int D = Integer.parseInt(str[1]);
		int F = Integer.parseInt(str[2]);

		int s[] = new int[11];

		s[R]++;
		s[D]++;
		s[F]++;

		if (s[5] == 2 && s[7] == 1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
