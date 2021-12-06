// ABC204 A.Rock-paper-scissors


// 80ms/32,764KB
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
          String chr[] = in.split(" ");
          int x = Integer.parseInt(chr[0]);
          int y = Integer.parseInt(chr[1]);
          
          if (x == y) {
          	System.out.println(x);
          } else {
          	System.out.println(3 - x - y);
          }
          
        }
    }
}



// 誰　113ms/35,644KB
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x == y) {
			System.out.println(x);
		}else {
			System.out.println(3 - x - y);
		}
		sc.close();
	}

}
