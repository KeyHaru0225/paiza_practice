// ABC80 A.Parking

// 75ms/32,684KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);
          
            int p1 = a * n;
            
            System.out.println(Math.min(p1,b));
        }
    }
}

// 誰 95ms/27,008KB
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a*n >= b){
            System.out.println(b);
        }else{
            System.out.println(a*n);
        }
    }
}