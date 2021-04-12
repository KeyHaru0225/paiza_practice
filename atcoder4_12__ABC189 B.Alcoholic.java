// ABC189 B.Alcoholic


// RE わからんくなった。けど頑張ったとは思う。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int x = Integer.parseInt(chr[1]);
          
            for(int i=0; i<n; i++){
            	String str[] = br.readLine().split(" ");
                int v = Integer.parseInt(str[0]);
                int p = Integer.parseInt(str[1]);
                int count = 0;
                
                if(v*(p/100) <= 15){
                	count ++;
                } else {
                    count ++;
                    break;
                }
              System.out.println(count);
            }
          
          
        }	
     }
}


// 誰2真似したら正解した　101ms/33,812KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			long n = Integer.parseInt(chr[0]);
			long x = Integer.parseInt(chr[1]);
                        long count = 0;
          
            for(int i=0; i<n; i++){
            	String str[] = br.readLine().split(" ");
                long v = Integer.parseInt(str[0]);
                long p = Integer.parseInt(str[1]);
                count += v*p;
                
                if(count > x*100){
                	System.out.println(i+1);
                        break;
                } 
           }
             if(count <= x*100){
               System.out.println(-1);
           }
          
          
        }	
     }
}


// 誰1 159ms/33,008KB
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		BigDecimal count = new BigDecimal("0");
		int ans = -1;
		for(int i = 0; i < n; i++) {
			count = count.add(new BigDecimal(Double.toString(
					s.nextInt()*s.nextInt()/100.0)));
			if(count.subtract(new BigDecimal(Integer.toString(x))).
					compareTo(BigDecimal.ZERO) == 1) {
				ans = i+1;
				break;
			}
		}
		System.out.println(ans);
	}
}


// 誰2  157ms/39,580KB
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long X = sc.nextLong();
		long count =0;
		
		for(int i=0; i<N; ++i) {
			long V = sc.nextLong();
			long P = sc.nextLong();
			
			count += V*P;
			
			if(count>X*100) {
				//System.out.println(count);
				System.out.println(i+1);
				break;
			}
			
		
			
			
		}
		
		if(count<=X*100) {
			System.out.println(-1);
		}
		
	}

}
