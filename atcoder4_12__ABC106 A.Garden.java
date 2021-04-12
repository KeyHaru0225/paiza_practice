// ABC106 A.Garden


// 81ms/32,356KB
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
          
            System.out.println((a-1)*(b-1));
        }
    }
}


// 誰かの答え　116ms/35,700KB
import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
        System.out.println((sc.nextInt()-1)*(sc.nextInt()-1));
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}

}
