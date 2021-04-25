// ABC182 E.Akari

//　問題文もわからんし、答えもようわからん…

// 1 972ms/58,540KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] s = new char[h][w];
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			s[a[i]][b[i]] = 'o';
		}
		for (int i = 0; i < m; i++) {
			int c = sc.nextInt() - 1;
			int d = sc.nextInt() - 1;
			s[c][d] = 'x';
		}
		sc.close();

		boolean[][] x = new boolean[h][w];
		for (int i = 0; i < h; i++) {
			boolean flg = false;
			for (int j = 0; j < w; j++) {
				if (s[i][j] == 'o') {
					flg = true;
				}
				if (s[i][j] == 'x') {
					flg = false;
				}
				if (flg) {
					x[i][j] = true;
				}
			}
			flg = false;
			for (int j = w - 1; j >= 0; j--) {
				if (s[i][j] == 'o') {
					flg = true;
				}
				if (s[i][j] == 'x') {
					flg = false;
				}
				if (flg) {
					x[i][j] = true;
				}
			}
		}
		for (int j = 0; j < w; j++) {
			boolean flg = false;
			for (int i = 0; i < h; i++) {
				if (s[i][j] == 'o') {
					flg = true;
				}
				if (s[i][j] == 'x') {
					flg = false;
				}
				if (flg) {
					x[i][j] = true;
				}
			}
			flg = false;
			for (int i = h - 1; i >= 0; i--) {
				if (s[i][j] == 'o') {
					flg = true;
				}
				if (s[i][j] == 'x') {
					flg = false;
				}
				if (flg) {
					x[i][j] = true;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (x[i][j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
