// ABC109 A.ABC333


//正解　80ms/32,512KB
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
          
            if((a*b)%2 == 0){
            	System.out.println("No");
            } else {
            	System.out.println("Yes");
            }
          
        }
    }
}


// 誰かの答え 123ms/35,708KB
import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		System.out.println((A*B)%2==1 ? "Yes" : "No");
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}

}
