// ABC17 A.プロコン

// RE　いみふ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int s1 = Integer.parseInt(chr[0]);
			double e1 = Double.parseDouble(chr[1]) * 0.1;
			int s2 = Integer.parseInt(chr[2]);
            double e2 = Double.parseDouble(chr[3]) * 0.1;
			int s3 = Integer.parseInt(chr[4]);
			double e3 = Double.parseDouble(chr[5]) * 0.1;
          
            System.out.println(s1*e1 + s2*e2 + s3*e3); 
        }
    }
}

// RE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int s1 = Integer.parseInt(chr[0]);
			int e1 = Integer.parseInt(chr[1]) / 10;
			int s2 = Integer.parseInt(chr[2]);
            int e2 = Integer.parseInt(chr[3]) / 10;
			int s3 = Integer.parseInt(chr[4]);
			int e3 = Integer.parseInt(chr[5]) / 10;
          
            System.out.println(s1*e1 + s2*e2 + s3*e3); 
        }
    }
}



// 1 114ms/35,376KB
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;

		for(int i = 0; i < 3; i++) {
			ans += sc.nextInt() * sc.nextInt() / 10;
		}
		System.out.println(ans);
	}
}