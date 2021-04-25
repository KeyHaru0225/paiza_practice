// ABC53 A.ABC/ARC

// 82ms/32,544KB
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
	public static void main(String[] args) throws IOException{
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    	String in = br.readLine();
      
        String chr[] = in.split(" ");
        int x = Integer.parseInt(chr[0]);
      
        if(x < 1200){
        	System.out.println("ABC");
        } else {
        	System.out.println("ARC");
        }
      
    	}
    }
}