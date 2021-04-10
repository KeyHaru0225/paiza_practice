// ABC110 A.Maximize the Formula


// WA
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
          
            int max = Math.max(a*10+b, Math.max(b*10+c,c*10+a));
          
            System.out.println(max);
            
        }
    }
}


// 下の人のまねしたら出来た　85ms/32,428KB
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
          
            int max = Math.max(10*a+b+c, Math.max(a+10*b+c, a+b+10*c));
          
            System.out.println(max);
            
        }
    }
}


// 誰かの答え1 118ms/35,584KB
import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		System.out.println(Math.max(10*A+B+C, Math.max(A+10*B+C, A+B+10*C)));
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}

}


// 誰かの答え2 120ms/35,536KB
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Integer[] array = new Integer[]{a, b, c};
        Arrays.sort(array);
        System.out.println(array[0] + array[1] + array[2] * 10);
    }
}