// ABC57 A.Remaining Time

// HashMap()使ったらいいんかなあ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
          
            int ans = a + b;
          
            if(ans > 24) {
            
            }
        }
    }
}


// 82ms/32,420KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
          
            int ans = (a + b) % 24;
		
			System.out.println(ans);
            
            
        }
    }
}


// 1 118ms/35,520KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int r = (a + b) % 24;
		
		System.out.println(r);
	}
}

// 2 101ms/26,716KB
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int ans = a + b;

		if (ans >= 24) {
			ans = ans - 24;
			System.out.println(ans);
		} else {
			System.out.println(ans);
		}
	}
}