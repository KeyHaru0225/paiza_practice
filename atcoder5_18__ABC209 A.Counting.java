// ABC209 A.Counting


// 68ms/25,332KB
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
          
            if(a <= b) {
            	System.out.println(b - a + 1);
            } else {
            	System.out.println(0);
            }
        }
    }
}