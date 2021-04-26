// ABC.43 A.キャンディーとN人の子供イージー

// 下の人の真似た　79ms/32,300KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
          
            int ans = 0;
            for(int i=1; i <= n; i++){
            	ans += i;
            }
          
            System.out.println(ans);
        }
    }
}

// 1 86ms/32,388KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static final int INF = 1000000000;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int ans = 0;

		for (int i = 1; i <= n; i++) {
			ans += i;
		}

		System.out.println(ans);
	}
}
