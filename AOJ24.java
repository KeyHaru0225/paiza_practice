import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num[][] = new int [n][m];
        
        for(int i = 0; i<n; i++){
            
        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        int B[] = new int[m];
        
        for(int i = 0; i<n; i++){
            for(int j =0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<m; i++){
            B[i] = sc.nextInt();
        }
        int ans;
        for(int i =0; i<n; i++){
            ans = 0;
            for(int j = 0; j<m; j++){
                ans += A[i][j] * B[j];
            }
            System.out.printf("%d\n", ans);
        }
    }
}








public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int A[][] = new int[N][M];
		int B[] = new int[M];

		for(int row = 0; row < N; row++){
			for(int col = 0; col < M; col++){
				A[row][col] = sc.nextInt();
			}
		}

		for(int row = 0; row < M; row++){
			B[row] = sc.nextInt();
		}

		int ans;

		for(int row = 0; row < N; row++){
			ans = 0;
			for(int col = 0; col < M; col++){
				ans += A[row][col]*B[col];
			}
			System.out.printf("%d\n", ans);
		}
	}
}