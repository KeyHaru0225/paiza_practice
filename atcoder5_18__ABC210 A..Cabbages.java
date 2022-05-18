// ABC A.Cabbages


// 68ms/25,308KB
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
            int a = Integer.parseInt(chr[1]);
            int x = Integer.parseInt(chr[2]);
            int y = Integer.parseInt(chr[3]);
          
            if(n <= a) {
			System.out.println(n * x);
 		} else {
			System.out.println(x*a + (n - a) * y);
		}
          
        }
    }
}