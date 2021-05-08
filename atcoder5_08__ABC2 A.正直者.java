// ABC2 A.正直者

// 84ms/32,540KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int x = Integer.parseInt(chr[0]);
			int y = Integer.parseInt(chr[1]);
          
            if(x >= y) {
            	System.out.println(x);
            } else {
            	System.out.println(y);
            }
          
        }
    }
}


// 1 121ms/35,732KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int ans = Math.max(x, y);
		System.out.println(ans);
	} 
}