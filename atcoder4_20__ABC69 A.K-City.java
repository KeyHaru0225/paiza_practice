// ABC69 A.K-City

// 79ms/32,632KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]) - 1;
			int m = Integer.parseInt(chr[1]) - 1;

            System.out.println(n * m);
          
        }
    }
}