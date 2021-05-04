// ABC22 A.Best Body

// これ絶対難易度Bやろ
// RE 84ms/32,904KB　

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            int s = Integer.parseInt(chr[1]);
            int t = Integer.parseInt(chr[2]);
            String[] A = br.readLine().split(" ");
            
            int count = 0;
		
          for(int i=0; i<n; i++){
             int a = Integer.parseInt(A[i]);
               if(a >= s && a <= t) {
               		count ++;
               } else {
               		count = count;
               }
          }
            
            System.out.println(count);
          
          
        }
    }
}


// 1 173ms/38,696KB
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		int weight = 0;
		int count = 0;

		for(int i = 0; i < n; i++) {
			weight += sc.nextInt();
			if(weight >= s && weight <= t) {
				count++;
			}
		}
		System.out.println(count);
	}
}