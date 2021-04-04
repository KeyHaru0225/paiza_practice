// ABC194 B.Job Assignment

/* 問題文がよくわからん
   誰かの答え3がまだ分かりやすいかも
*/


//誰かの答え1 159ms/31,200KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();

		int ans = 200000;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					ans = Math.min(ans, a[i] + b[j]);
				} else {
					ans = Math.min(ans, Math.max(a[i], b[j]));
				}
			}
		}
		System.out.println(ans);
	}
}


// 誰かの答え2 177ms/38,752KB
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			a[i]= Integer.parseInt(sc.next());
			b[i]= Integer.parseInt(sc.next());
		}
		sc.close();
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int time;
				if(i==j) {
					time = a[i]+b[j];
				}else {
					time = Math.max(a[i], b[j]);
				}
				if(ans>time) ans = time;
			}
		}
		System.out.println(ans);
	}

}


// 誰かの答え3 177ms/38,752KB
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			a[i]= Integer.parseInt(sc.next());
			b[i]= Integer.parseInt(sc.next());
		}
		sc.close();
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int time;
				if(i==j) {
					time = a[i]+b[j];
				}else {
					time = Math.max(a[i], b[j]);
				}
				if(ans>time) ans = time;
			}
		}
		System.out.println(ans);
	}

}


// 誰かの答え4 97ms/33,856KB
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        var A = new int[N];
        var B = new int[N];
        int minA = Integer.MAX_VALUE;
        int minAi = -1;

        for (int n = 0; n < N; n++) {
            String[] in = br.readLine().split(" ");
            A[n] = Integer.parseInt(in[0]);
            B[n] = Integer.parseInt(in[1]);
            if (A[n] < minA) {
                minA = A[n];
                minAi = n;
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int n = 0; n < N; n++) {
            if (n != minAi) {
                int now = Math.max(minA, B[n]);
                ans = Math.min(ans, now);
            } else {
                int now = A[n] + B[n];
                ans = Math.min(ans, now);
            }
        }

        System.out.println(ans);
    }
}

