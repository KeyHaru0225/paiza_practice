// ABC26 A.掛け算の最大値

// 82ms/32,576KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
  	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    	String in = br.readLine();
      
        String chr[] = in.split(" ");
        int a = Integer.parseInt(chr[0]);

        System.out.println((a/2) * (a/2));
        
    }
  }
}