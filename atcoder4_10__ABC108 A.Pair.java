// ABC108 A.Pair

// わかんね
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int k = Integer.parseInt(chr[0]);
        }
    }
}


// 下の人の真似たら正解した　85ms/32,124KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int k = Integer.parseInt(chr[0]);
          
            System.out.println((k/2) * ((k+1)/2));
        }
    }
}


// 誰かの答え 122ms/35,740KB
import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println((N/2)*((N+1)/2));
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}

}
