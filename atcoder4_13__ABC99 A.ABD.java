// ABC99 A.ABD


// 86ms/32,468KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
          
            if(n >=1000){
            	System.out.println("ABD");
            } else {
            	System.out.println("ABC");
            }
          
        }
    }
}


// 誰　92ms/27,008KB
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        String ans = null;

        if(n >= 1000) {
            ans = "ABD";
        } else {
            ans = "ABC";
        }
        System.out.println(ans);
    }
}