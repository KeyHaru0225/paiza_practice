// ABC182 B.Almost GCD

//　頑張ったけどわからんくなった
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            String[] A = br.readLine().split(" ");
            String[] A = Arrays.sort(A);
            int count = 0;
          
            for(int i=0; i<n; i++){
            	int a = Integer.parseInt(A[i])
                  if(A[n-1] % A[i] == 0){
                  	count ++;
                  }
            }
        }
    }
}

// 1 114ms/27,028KB
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int tmp = 0, ans = 0;
		for (int i = 2; i < 1000; i++) {
			int cnt = 0;
			for (int v : a) {
				if (v % i == 0)
					cnt++;
			}
			if (tmp < cnt) {
				tmp = cnt;
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
