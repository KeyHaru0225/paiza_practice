// ABC41 A.添字

// 117ms/35,824KB
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String s = sc.next();
        int i = sc.nextInt();
      
        System.out.println(s.charAt(i-1));
    }
}

// 1 81ms/32,820KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static final int INF = 1000000000;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		int n = Integer.parseInt(br.readLine());

		System.out.println(str[n - 1]);
	}
}
