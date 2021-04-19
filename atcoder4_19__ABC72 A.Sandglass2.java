// ABC72 A.Sandglass2

// 81ms/32,556KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int X = Integer.parseInt(chr[0]);
			int t = Integer.parseInt(chr[1]);
          
            int ans = X - t;
            if(ans <= 0){
            	System.out.println(0);
            } else {
            	System.out.println(ans);
            }
          
        }
    }
}

// 誰　120ms/35,736KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int t = sc.nextInt();

		if(x >= t) {
			System.out.println(x - t);
		} else {
			System.out.println(0);
		}
	}
}	