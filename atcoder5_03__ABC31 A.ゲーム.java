// ABC31 A.ゲーム

// 85ms/32,364KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int d = Integer.parseInt(chr[1]);
          
            int ans = Math.max((a+1)*d, a*(d+1));
          
            System.out.println(ans);
        }
    }
}
