// ABC164 A.Sheep and Wolves

//正解
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        int s = sc.nextInt();
        int w = sc.nextInt();
      
        if(w>=s){
        	System.out.println("unsafe");
        } else {
        	System.out.println("safe");
        }
      
    }
}

// 正解。ABC165で同じような事して不正解だったのに何故…？
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int s = Integer.parseInt(chr[0]);
			int w = Integer.parseInt(chr[1]);
          
            if(w>=s){
              System.out.println("unsafe");
           } else {
              System.out.println("safe");
           }
          
        }
    }
}
		