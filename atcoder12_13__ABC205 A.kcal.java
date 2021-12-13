// ABC205 A.kcal

// 79ms/33,316KB
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	public static void main(String args[]) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
          	String chr[] = in.split(" ");
          	int a = Integer.parseInt(chr[0]);
          	int b = Integer.parseInt(chr[1]);
          
          	double ans = (double) (a * b) / 100;
          
          	System.out.println(ans);
        }
    }
}