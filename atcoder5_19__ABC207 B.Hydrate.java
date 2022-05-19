// ABC207 B.Hydrate


// 分からんかったから回答見た
// 72ms/25,808KB
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            long a = Long.parseLong(chr[0]);
            long b = Long.parseLong(chr[1]);
            long c = Long.parseLong(chr[2]);
            long d = Long.parseLong(chr[3]);
          
            long blue = a;
            long red = 0;
          
            for(int i = 1; i <= a; i++) {
            	blue += b;
                red += c;
                if(blue <= d * red) {
                	System.out.println(i);
                    return;
                }
            }
            System.out.println(-1);
        }
    }
}



// 1
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();
		
		long blue = a;
		long red = 0;
		
		for(int i = 1; i <= a; i++) {
			blue += b;
			red += c;
			if(blue <= d * red) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}

// 2
import java.util.*;
 
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		long aka = 0;
		long ao = a;
		int count = 0;
		while(aka*d < ao && count < 100001){
			aka += c;
			ao += b;
			count += 1;
		}
		if(aka*d>=ao){
			System.out.print(count);
		} else{
			System.out.print(-1);
		}
	}
}