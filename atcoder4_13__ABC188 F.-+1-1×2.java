// ABC188 F.-+1-1*2

// 問題文はシンプルで分かりやすい。

// 誰1 94ms/27,012KB
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Map<Long, Long> map = new HashMap<>();
	static long x, y;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		x = sc.nextLong();
		y = sc.nextLong();
		sc.close();

		map.put(x, 0L);
		System.out.println(dfs(y));
	}

	static long dfs(long n) {
		if (map.containsKey(n)) {
			return map.get(n);
		}
		long ret = Math.abs(n - x);
		if (n > x) {
			if (n % 2 == 0) {
				ret = Math.min(ret, dfs(n / 2) + 1);
			} else {
				ret = Math.min(ret, dfs(n / 2) + 2);
				ret = Math.min(ret, dfs(n / 2 + 1) + 2);
			}
		}
		map.put(n, ret);
		return ret;
	}
}

// 誰2 120ms/35,880KB
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			long x = sc.nextLong();
			long y = sc.nextLong();

			HashMap<Long, Long> memo = new HashMap<Long, Long>();
			System.out.println(calcX(x, y, memo));
		}
	}

	public static long calcX(long x, long y, HashMap<Long, Long> memo) {
		if (memo.containsKey(y)) {
			return memo.get(y);
		} else if (y <= x) {
			memo.put(y, x - y);
			return (x - y);
		} else {
			if(y%2 == 0) {
				memo.put(y, Math.min(calcX(x, y / 2, memo) + 1 , y - x));
			}else {
				memo.put(y, Math.min(calcX(x, (y-1), memo) + 1 , calcX(x, (y+1), memo) + 1));
			}

			return memo.get(y);
		}
	}
}
