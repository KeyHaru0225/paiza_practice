// ABC187 E.Through Path

// 問題文難しい

// 誰1 1172ms/86,152KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static List<List<Integer>> list;
	static int[] dep;
	static long[] ans;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		int[] a = new int[n - 1];
		int[] b = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			String[] sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
			list.get(a[i]).add(b[i]);
			list.get(b[i]).add(a[i]);
		}

		dep = new int[n];
		dfs(0, -1);
		ans = new long[n];

		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			int t = Integer.parseInt(sa[0]);
			int e = Integer.parseInt(sa[1]) - 1;
			int x = Integer.parseInt(sa[2]);
			int ae = 0;
			int be = 0;
			if (t == 1) {
				ae = a[e];
				be = b[e];
			} else {
				ae = b[e];
				be = a[e];
			}
			if (dep[ae] < dep[be]) {
				ans[0] += x;
				ans[be] -= x;
			} else {
				ans[ae] += x;
			}
		}
		br.close();

		dfs2(0, -1);
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(ans[i]);
		}
		pw.flush();
	}

	static void dfs(int x, int p) {
		for (int c : list.get(x)) {
			if (c != p) {
				dep[c] = dep[x] + 1;
				dfs(c, x);
			}
		}
	}

	static void dfs2(int x, int p) {
		for (int c : list.get(x)) {
			if (c != p) {
				ans[c] += ans[x];
				dfs2(c, x);
			}
		}
	}
}


///　誰2 1193ms/87,296KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static int n;
	static List<List<Integer>> list;
	static long[] dp;
	static int[] dep;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		int[] ha = new int[n - 1];
		int[] hb = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			String[] sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
			ha[i] = a;
			hb[i] = b;
		}

		dep = new int[n];
		dfs(0, -1);
		dp = new long[n];

		int q = Integer.parseInt(br.readLine());
		for (int i = 0; i < q; i++) {
			String[] sa = br.readLine().split(" ");
			int t = Integer.parseInt(sa[0]);
			int e = Integer.parseInt(sa[1]) - 1;
			int x = Integer.parseInt(sa[2]);
			if (t == 1) {
				if (dep[ha[e]] < dep[hb[e]]) {
					dp[0] += x;
					dp[hb[e]] -= x;
				} else {
					dp[ha[e]] += x;
				}
			} else {
				if (dep[ha[e]] > dep[hb[e]]) {
					dp[0] += x;
					dp[ha[e]] -= x;
				} else {
					dp[hb[e]] += x;
				}
			}
		}
		br.close();

		dfs2(0, -1);
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			pw.println(dp[i]);
		}
		pw.flush();
	}

	static void dfs(int x, int p) {
		for (int c : list.get(x)) {
			if (c != p) {
				dep[c] = dep[x] + 1;
				dfs(c, x);
			}
		}
	}

	static void dfs2(int x, int p) {
		for (int c : list.get(x)) {
			if (c != p) {
				dp[c] += dp[x];
				dfs2(c, x);
			}
		}
	}
}
