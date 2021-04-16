// ABC187 F.Close Group

// 単純無向グラフって初めて聞いたぞい。問題文は何となくわかった。

// 誰1 1077ms/57,240KB
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] d = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			d[a][b] = true;
			d[b][a] = true;
		}
		sc.close();

		int n2 = 1 << n;
		int[] dp = new int[n2];
		Arrays.fill(dp, n);
		dp[0] = 1;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n2; i++) {
			if (dp[i] == 1) {
				list.add(i);
			} else {
				continue;
			}
			List<Integer> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i >> j & 1) == 1) {
					list1.add(j);
				} else {
					list2.add(j);
				}
			}
			for (int k : list2) {
				boolean flg = true;
				for (int j : list1) {
					if (!d[j][k]) {
						flg = false;
						break;
					}
				}
				int alt = dp[i];
				if (!flg) {
					alt++;
				}
				int next = i + (1 << k);
				dp[next] = Math.min(dp[next], alt);
			}
		}
		int[] dp2 = new int[n2];
		Arrays.fill(dp2, n);
		for (int i : list) {
			dp2[i] = 1;
		}
		for (int i = 1; i < n2; i++) {
			for (int j = i; j > 0; j = j - 1 & i) {
				dp2[i] = Math.min(dp2[i], dp2[j] + dp2[i - j]);
			}
		}
		System.out.println(dp2[n2 - 1]);
	}
}

// 誰2 764ms/38,608KB
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 * 
 * https://atcoder.jp/contests/abc187/submissions/19103570 にも参考
 */
public class Main {

	/** 最大値 */
	private static final int INF = Integer.MAX_VALUE >> 1;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			int[] a = new int[m], b = new int[m], edges = new int[n];
			Arrays.fill(edges, 0);
			IntStream.range(0, m).forEach(i -> {
				a[i] = scanner.nextInt() - 1;
				b[i] = scanner.nextInt() - 1;
				edges[a[i]] |= 1 << b[i];
				edges[b[i]] |= 1 << a[i];
			});
			int[] dp = new int[1 << n];
			Arrays.fill(dp, INF);
			dp[0] = 1;
			IntStream.range(0, n).forEach(i -> IntStream.range(0, 1 << n)
					.filter(j -> (1 == dp[j]) && (j == (edges[i] & j))).forEach(j -> dp[j | 1 << i] = 1));
			IntStream.range(0, 1 << n).forEach(i -> {
				for (int j = (i - 1) & i; j > 0; j = (j - 1) & i) {
					dp[i] = Math.min(dp[i], dp[i ^ j] + dp[j]);
				}
			});
			System.out.println(dp[(1 << n) - 1]);
		}
	}
}

