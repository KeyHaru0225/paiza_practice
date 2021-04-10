// ABC190 E.Magical Ornament


// サイトで色んな人の解答見るべきかも



// 誰かの答え1 1315ms/96,728KB
import java.util.*;
public class Main {
	static List<Integer>[] adjL;
	static int[][] dist;
	static int[]c;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int M = input.nextInt();
		
		adjL = new List[N + 1];
		for(int i = 1; i <= N; i++) adjL[i] = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			int u = input.nextInt();
			int v = input.nextInt();
			adjL[u].add(v);
			adjL[v].add(u);
		}
		
		int K = input.nextInt();
		dist = new int[K][K];
		c = new int[K];
		long[][] dp = new long[1<<K][K];
		
		for(int i = 0; i < 1<<K; i++) Arrays.fill(dp[i], Integer.MAX_VALUE);	
		for(int i = 0; i < K; i++) c[i] = input.nextInt();
		for(int i = 0; i < K; i++) {
			bfs(c[i],i,N+1);
			dp[1<<i][i] = 1;
		}
				
		for(int set = 0; set < (1 << K); set++) {
			for(int i = 0; i < K; i++) {
				if ((set & (1 << i)) == 0) continue;
				int prev = set ^ (1 << i);		
				for(int j = 0; j < K; j++) {
					if ((prev & 1 << j) == 0 || dist[i][j] == -1) continue;
					dp[set][i] = Math.min(dp[set][i], dp[prev][j] + dist[i][j]);
	
				}
			}
		}
		
		long ans = Integer.MAX_VALUE;
		for(int i = 0; i < K; i++) ans = Math.min(ans, dp[(1 << K) - 1][i]);
		if (ans == Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(ans);
	}
	
	public static void bfs(int node, int index, int n) {
		Queue<Integer> q = new LinkedList<>();
		int[] tmp = new int[n];
		Arrays.fill(tmp, -1);
		tmp[node] = 0;
		int len = 1;
		
		q.add(node);
		while(!q.isEmpty()) {
			int size = q.size();
			while (size-- > 0) {
				int cur = q.poll();
				for(int nb : adjL[cur]) {
					if (tmp[nb] >= 0) continue;
					tmp[nb] = len;
					q.add(nb);
				}
			}
			len++;
		}
		for(int i = 0; i < dist[0].length; i++) dist[index][i] = tmp[c[i]];
	}
}


// 誰かの答え2 970ms/90,320KB
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author kamel
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            List<Integer>[] adj = new List[n];
//        for (int i = 0; i < adj.length; i++) {
//            adj[i] = new ArrayList<>();
//        }
            for (int i = 0; i < m; i++) {
                int from = in.nextInt();
                int to = in.nextInt();

                from--;
                to--;

                if (adj[from] == null) {
                    adj[from] = new ArrayList<>();
                }
                if (adj[to] == null) {
                    adj[to] = new ArrayList<>();
                }

                adj[from].add(to);
                adj[to].add(from);
            }
            int k = in.nextInt();
            int[] colors = new int[k];
            Set<Integer> colorSet = new HashSet<>();
            for (int i = 0; i < k; i++) {
                colors[i] = in.nextInt();
                colors[i]--;
                colorSet.add(colors[i]);
            }
            int INF = Integer.MAX_VALUE / 10;
            Map<Integer, int[]> dist = new HashMap<>();
            for (int c : colors) {
                int[] dArray = new int[n];
                Arrays.fill(dArray, INF);
                dist.computeIfAbsent(c, x -> dArray)[c] = 0;
                Queue<Integer> queue = new ArrayDeque<>();
                queue.add(c);
                int[] pointDist = dist.get(c);
                while (!queue.isEmpty()) {
                    int color = queue.poll();
                    int d = pointDist[color];
                    if (adj[color] == null) {
                        continue;
                    }
                    for (int next : adj[color]) {
                        if (pointDist[next] == INF) {
                            queue.add(next);
                            pointDist[next] = d + 1;
                        }
                    }
                }
            }
            int[][] dp = new int[1 << k][k];
            for (int[] d : dp) {
                Arrays.fill(d, INF);
            }
            for (int i = 0; i < k; i++) {
                dp[1 << i][i] = 0;
            }

            for (int mask = 0; mask < 1 << k; mask++) {
                for (int i = 0; i < k; i++) {
                    int from = colors[i];
                    if (dp[mask][i] == INF) {
                        continue;
                    }
                    int[] pointDist = dist.get(from);
                    for (int j = 0; j < k; j++) {
                        if ((mask & (1 << j)) > 0 || i == j) {
                            continue;
                        }
                        int to = colors[j];
                        if (pointDist[to] == INF) {
                            continue;
                        }
                        dp[mask | (1 << j)][j] = Math.min(dp[mask | (1 << j)][j], dp[mask][i] + pointDist[to] - 1);
                    }
                }
            }
            int result = INF;
            for (int i = 0; i < k; i++) {
                result = Math.min(result, dp[(1 << k) - 1][i]);
            }
            if (result == INF) {
                out.println(-1);
            } else {
                out.println(result + k);
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

