// ABC64 A.RGB Cards

// 82ms/32,468KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int r = Integer.parseInt(chr[0]) * 100;
			int g = Integer.parseInt(chr[1]) * 10;
			int b = Integer.parseInt(chr[2]);
          
            if((r+g+b) % 4 == 0){
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
          
        }
    }
}

// 面白い考え方と思った　116ms/35,688KB
import java.util.*;

public class Main {
	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int g=sc.nextInt();
		int b=sc.nextInt();
		if((g*10+b)%4==0)System.out.println("YES");
		else System.out.println("NO");
	}
}