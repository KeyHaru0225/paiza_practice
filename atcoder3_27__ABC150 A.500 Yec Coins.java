// ABC150 A.500 Yec Coins

//正解。簡単
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int k = Integer.parseInt(chr[0]);
            int x = Integer.parseInt(chr[1]);
          
            if(k*500 >= x){
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
        
        }
    }
}


//誰かの答え(kimata)
import java.util.Scanner;
 
/**
 *
 * @author ITAGE-202101
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        int k;
        int x;
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String [] strings1 = strings1 = string1.split(" ");
        k = Integer.valueOf(strings1[0]);
        x = Integer.valueOf(strings1[1]);
        if(k*500 >= x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
