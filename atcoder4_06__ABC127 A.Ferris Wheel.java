// ABC127 A.Ferris Wheel

// 正解。簡単　79ms/32,488KB
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
 
            if(a >= 13){
            	System.out.println(b);
            } else if(a >= 6 && a <= 12){
            	System.out.println(b/2);
            } else {
            	System.out.println(0);
            }
          
        }
    }
}