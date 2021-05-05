// ABC20 A.クイズ

// 75ms/31,916KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
          
            if(n == 1) {
            	System.out.println("ABC");
            } else {
            	System.out.println("chokudai");
            }
          
        }
    }
}