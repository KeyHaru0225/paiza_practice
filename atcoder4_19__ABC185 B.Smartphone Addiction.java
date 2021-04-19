// ABC185 B.Smartphone Addiction

// 問題文と考え方は分かったけど、どうコーディングして良いかわからん

//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            int m = Integer.parseInt(chr[1]);
            int t = Integer.parseInt(chr[2]);
            String[] A = br.readLine().split(" ");
            String[] B = br.readLine().split(" ");
            int count = 0;
		
          for(int i=0; i<n; i++){
            int a = Integer.parseInt(A[i]);
            int b = Integer.parseInt(B[i]);
            
            
          }
            
            n-a + Math.abs()
          
          
        }
    }
}


// 誰　179ms/38,872KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();;
		int M = sc.nextInt();
		int T = sc.nextInt();
		int before = 0;
		int A = 0;
		int B = 0;
		int life=N;
		for (int i = 0; i < M; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			life -= A - before;
			before = B;
			if (life <= 0) {
				System.out.println("No");
				return;
			}
			life =Math.min(life+B-A, N);
		}
		life -= T - before;
		before = B;
		if (life <= 0) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
