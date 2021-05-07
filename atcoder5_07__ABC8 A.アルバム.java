// ABC8 A.アルバム

// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int s = Integer.parseInt(chr[0]);
			int t = Integer.parseInt(chr[1]);
          
            System.out.println(t / s + 1);
          
        }
    }
}

// 82ms/32,400KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int s = Integer.parseInt(chr[0]);
			int t = Integer.parseInt(chr[1]);
          
            System.out.println((t - s) + 1);
          
        }
    }
}

// 1 120ms/35,596KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int t = sc.nextInt();
		int ans = (t - s) + 1;
		
		System.out.println(ans);
	}
}

// 2 119ms/35,712KB
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Math.abs(sc.nextInt() - sc.nextInt()) + 1);
	}
}