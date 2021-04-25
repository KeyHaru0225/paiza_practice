// ABC182 D.Wandering

// 1 540ms/50,036KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long[] b = new long[n + 1];
		long[] m = new long[n + 1];
		long now = 0;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			b[i + 1] = b[i] + a[i];
			m[i + 1] = Math.max(m[i], b[i + 1]);
			ans = Math.max(ans, now + m[i + 1]);
			now += b[i + 1];
		}
		System.out.println(ans);
	}
}
