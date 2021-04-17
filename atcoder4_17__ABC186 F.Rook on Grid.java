// ABC186 F.Rook on Grid

//　問題文はわかった。けどこれに関しては答えを見ても難しくて理解できない。

// 誰1 684ms/77,080KB
import java.io.*;
import java.util.*;

class FastScanner {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer("");
	String next() {
		while (!st.hasMoreTokens())
			try {
				st=new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		return st.nextToken();
	}
	
	int nextInt() {
		return Integer.parseInt(next());
	}
	int[] readArray(int n) {
		int[] a=new int[n];
		for (int i=0; i<n; i++) a[i]=nextInt();
		return a;
	}
	long nextLong() {
		return Long.parseLong(next());
	}
}

public class Main{
	
	static int N = 200010;
	static int[] tr = new int[N];
	static List<int[]> points = new ArrayList<int[]>();
	static boolean[] visit = new boolean[N];
	
	static int lowbit(int x) {
		return x & -x;
	}
	
	static void add(int p, int v) {
		while(p < N) {
			tr[p] += v;
			p += lowbit(p);
		}
	}
	
	static int query(int p) {
		int res = 0;
		while(p > 0) {
			res += tr[p];
			p -= lowbit(p);
		}
		return res;
	}
	
	static List<int[]> unique() {
		List<int[]> ano = new ArrayList<int[]>();
		for(int i=0; i<points.size(); i++) {
			if(i == 0 || (points.get(i)[0] != points.get(i-1)[0] || points.get(i)[1] != points.get(i-1)[1])) {
				ano.add(points.get(i));
			}
		}
		return ano;
	}
	
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
			
		int[] arr = fs.readArray(3);
		int n = arr[0]; int m = arr[1]; int w = arr[2];
		
		int xmin = N; int ymin = N;
		for(int i=0; i<w; i++) {
			int[] cur = fs.readArray(2);
			int x = cur[0]; int y = cur[1];
			
			if(x == 1) ymin = Math.min(ymin, y);
			if(y == 1) xmin = Math.min(xmin, x);
			points.add(new int[] {x, y});
		}
		
		for(int i=xmin+1; i<=n; i++) points.add(new int[] {i, 1});
		for(int i=ymin+1; i<=m; i++) points.add(new int[] {1, i});
		
		Collections.sort(points, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] != o2[0]) return o1[0] - o2[0]; 
				else return o1[1] - o2[1];
			}
		});
		points = unique();
		
		int row = 0; long tmp = 0;
		for(int i=0; i<points.size(); i++) {
			if(!visit[points.get(i)[1]]) {
				visit[points.get(i)[1]] = true;
				add(points.get(i)[1], 1);
			}
			
			if(i == points.size() - 1 || (points.get(i)[0] != points.get(i + 1)[0])) {
				tmp += query(N - 1) - query(points.get(row)[1] - 1);
				row = i + 1;
			}
		}
		
		System.out.println((long)n * m - tmp);
	}
}

// 誰2 786ms/61,208KB
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[] rowsMin = new int[h];
        Arrays.fill(rowsMin, w - 1);
        int[] colsMin = new int[w];
        Arrays.fill(colsMin, h - 1);
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            rowsMin[x] = Math.min(rowsMin[x], y - 1);
            colsMin[y] = Math.min(colsMin[y], x - 1);
        }
        long ans = 0;
        PriorityQueue<One> queue = new PriorityQueue<>();
        for (int i = 0; i <= rowsMin[0]; i++) {
            ans += colsMin[i] + 1;
            queue.add(new One(colsMin[i] + 1, i));
        }
        BinaryIndexedTree bit = new BinaryIndexedTree(w);
        for (int i = rowsMin[0] + 1; i < w; i++) {
            bit.add(i, 1);
        }
        for (int i = 0; i <= colsMin[0]; i++) {
            while (queue.peek().idx <= i) {
                bit.add(queue.poll().value, 1);
            }
            ans += bit.getSum(rowsMin[i]);
        }
        System.out.println(ans);
    }
    
    static class One implements Comparable<One> {
        int idx;
        int value;
        
        public One(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
        
        public int compareTo(One another) {
            return idx - another.idx;
        }
    }
}

class BinaryIndexedTree {
    int size;
    int[] tree;
    
    public BinaryIndexedTree(int size) {
        this.size = size;
        tree = new int[size];
    }
    
    public void add(int idx, int value) {
        int mask = 1;
        while (idx < size) {
            if ((idx & mask) != 0) {
                tree[idx] += value;
                idx += mask;
            }
            mask <<= 1;
        }
    }
    
    public int getSum(int from, int to) {
        return getSum(to) - getSum(from - 1);
    }
    
    public int getSum(int x) {
        int mask = 1;
        int ans = 0;
        while (x > 0) {
            if ((x & mask) != 0) {
                ans += tree[x];
                x -= mask;
            }
            mask <<= 1;
        }
        return ans;
    }
}