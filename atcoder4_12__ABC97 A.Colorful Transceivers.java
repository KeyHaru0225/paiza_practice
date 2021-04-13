// ABC97 A.Colorful Transceivers


// 84ms/32,524KB
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
			int c = Integer.parseInt(chr[2]);
            int d = Integer.parseInt(chr[3]);
          
            int diff1 = Math.abs(a-b);
            int diff2 = Math.abs(b-c);
            int diff3 = Math.abs(a-c);
          
            if(diff1 <= d && diff2 <= d) {
            	System.out.println("Yes");
            } else if(diff3 <= d) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
          
        }
    }
}


// 誰　92ms/26,956KB
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		
		String[] strs = s.trim().split(" ");
		
		int a = Integer.valueOf(strs[0]);
		int b = Integer.valueOf(strs[1]);
		int c = Integer.valueOf(strs[2]);
		int d = Integer.valueOf(strs[3]);
	
		if( Math.abs(c-a) <= d || Math.abs(a-b) <= d && Math.abs(c-b) <= d) {
			System.out.println("Yes");			
		//indireto
		} else {
			System.out.println("No");			
		}
			
	}
}

