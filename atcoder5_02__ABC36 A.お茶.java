// ABC36 A.お茶

// 81ms/32,,556KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
          
            if(b%a == 0){
            	System.out.println(b/a);
            } else {
            	System.out.println(b/a + 1);
            }
          
        }
    }
}