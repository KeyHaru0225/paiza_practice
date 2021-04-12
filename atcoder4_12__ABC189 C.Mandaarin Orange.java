// ABC189 C.Mandaarin Orange


// 問題文は分かった。


// 誰1 699ms/47,284KB

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] A = new int[N];
		int ans = 0;
		
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
	}
		
		for(int i=0; i<N; i++) {
			int countA =0;
			int countB =0;
	
			for(int j=0; j<N; j++) {
				if(A[j]>=A[i]) {
					countA++;
	
				}else {
					countB=Math.max(countA, countB);
					countA =0;
				}
				
				if(j==N-1) {
					countB = Math.max(countA, countB);
				}
				
			}
//			System.out.println(countB);
			ans = Math.max(ans, A[i]*countB);
			
		}
		
		System.out.println(ans);

}
}


// 誰2 310ms/47,504KB
import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = sc.nextInt();
        sc.close();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int min = a[i], tmp = min;
            for (int j = i + 1; j < n; ++j) {
                min = Math.min(min, a[j]);
                tmp = Math.max((min * (j - i + 1)), tmp);
            }
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}

// 誰3 307ms/47,716KB
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int ans = 0;
		
		for (int l = 0; l < n; l++) {
			int min = a[l];
			for (int r = l; r < n; r++) {
				min = Math.min(min, a[r]);
				ans = Math.max(ans, min*(r-l+1));
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}

}
