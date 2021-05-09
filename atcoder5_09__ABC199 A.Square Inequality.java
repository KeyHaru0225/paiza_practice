// ABC199 A.Square Inequality

// 80ms/32,812KB
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
          
            if(Math.pow(a,2) + Math.pow(b,2) < Math.pow(c,2)) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
          
        }
    }
}