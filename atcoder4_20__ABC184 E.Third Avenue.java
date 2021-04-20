// ABC184 E.Third Avenue

// 問題文はわかった

// 839ms/90,388KB
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
		}
		sc.close();

		int s = 0;
		int g = 0;
		Map<Character, List<Integer>> map = new HashMap<>();
		for (char i = 'a'; i <= 'z'; i++) {
			map.put(i, new ArrayList<>());
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == 'S') s = i * w + j;
				if (a[i][j] == 'G') g = i * w + j;
				if ('a' <= a[i][j] && a[i][j] <= 'z') {
					map.get(a[i][j]).add(i * w + j);
				}
			}
		}

		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};

		int[] d = new int[h * w];
		Queue<Integer> que = new ArrayDeque<>();
		que.add(s);
		while (!que.isEmpty()) {
			int cur = que.poll();
			int cx = cur / w;
			int cy = cur % w;
			for (int i = 0; i < 4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				if (nx < 0 || h <= nx || ny < 0 || w <= ny || a[nx][ny] == '#') {
					continue;
				}
				int next = nx * w + ny;
				if (d[next] == 0) {
					que.add(next);
					d[next] = d[cur] + 1;
				}
			}
			if ('a' <= a[cx][cy] && a[cx][cy] <= 'z') {
				for (int next : map.get(a[cx][cy])) {
					if (d[next] == 0) {
						que.add(next);
						d[next] = d[cur] + 1;
					}
				}
				map.get(a[cx][cy]).clear();
			}
		}
		int ans = d[g];
		if (ans == 0) {
			ans = -1;
		}
		System.out.println(ans);
	}
}
