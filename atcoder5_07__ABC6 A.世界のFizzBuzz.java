// ABC6 A.世界のFizzBuzz

// 81ms/32,280KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
          
            if(n % 3 == 0) {
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
          
        }
    }
}