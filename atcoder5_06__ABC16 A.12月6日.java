// ABC16 A.12月6日

// 83ms/32,604KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int m = Integer.parseInt(chr[0]);
			int d = Integer.parseInt(chr[1]);
          
            if(m % d == 0) {
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
          
        }
    }
}