// ABC152 A.AC or WA

//正解。簡単。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
          String in = br.readLine();
          
          String chr[] = in.split(" ");
          int n = Integer.parseInt(chr[0]);
          int m = Integer.parseInt(chr[1]);
          
          if(n == m){
          	System.out.println("Yes");
          } else {
          	System.out.println("No");
          }
          
          
        }
    }
}


//krpsの答え
/*
 	created by krps
 	本体は120行目あたりのsolve()に書いてあります。
 	Good Luck!
 */



import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;


public class Main {
	public static void main(String[] args) {

		for(int i=0;i<1;i++) {
			solver();
			out.flush();
		}
	}
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);
	//Set<Long> a=new HashSet<Long>();



	//Integer.toBinaryString(i);
	//Integer.toString(i, 2);
//	//Integer.parseInt(bin, 2);
	//bitset
		//StringBuffer S = new StringBuffer(sc.next());
				//String hoge2 = str.reverse().toString();
				//map.containsKey(A)
				//Map<Integer, Integer> map = new HashMap<Integer, Integer>(N);
				/*for ( キーのデータ型 key : マップの名前.keySet() ) {
					データのデータ型 data = マップの名前.get( key );

					// keyやdataを使った処理;
				}*/
				//int i = Integer.parseInt(s);
				//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek BFSは前から実行される
				//Deque<String> dd=new ArrayDeque<>();//push後ろに入れる,poll(pop)後ろからとる,peek addは先頭に入るからバグ注意
				//stackdfsは後ろから実行される
				//ArrayList<Integer> cc = new ArrayList<>(N);
				//cc.contains(tmp)
				//Arrays.asList(c).contains("a")
				//list.set(1,"walk");//1 1 2 3 5
				//PriorityQueue<Integer> r=new PriorityQueue<Integer>();//add poll
		
		public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>> {
		    public Pair(final K key, final V value) {
		        super(key, value);
		    }

			@Override
			public int compareTo(Pair<K, V> o) {

				Comparable key = (Comparable)this.getKey();
				Comparable key2 = (Comparable)o.getKey();

				/*if (false) {
					Comparable key3 = (Comparable) this.getValue();
					Comparable key4 = (Comparable) o.getValue();
					if (key.compareTo(key2) == 0) {
						return key3.compareTo(key4);
					}
				}*/
				return key.compareTo(key2);
			}

		}

		// 文字列として入力を取得




	//private static long mod=1000000007;
	//private static long mod2=998244353;
	private static int INF =(1<<31)-1;
	@SuppressWarnings("unused")
	private static long LINF=4000000000000000000L;
	private static boolean isPrime(long t) {
		if(t<2)return false;
		for(int i=2;i*i<=t;i++) {
			if(t%i==0)return false;
		}
		return true;
	}
	private static ArrayList<Long> Divisors(long t) {
		ArrayList<Long> c=new ArrayList<Long>();

		for(long i=1;i*i<=t;i++) {
			if(t%i==0) {

				if(i*i!=t) {
					c.add(t/i);
				}
				c.add((long)i);
			}
		}
		return c;
	}
	private static ArrayList<Long> sortedfacto(long t) {
		ArrayList<Long> c=new ArrayList<Long>();
		for(long i=2;i*i<=t;i++) {


			if(t%i==0) {
				p(t+" "+i);
				c.add((long)i);
				t/=i;
				i--;
			}
		}
		if(t!=1)c.add(t);
		Collections.sort(c);

		return c;
	}

	@SuppressWarnings("unused")
	private static long ncr(long n,long r) {
		long res=1;

		for(int i=0;i<r;i++) {
			res*=n-i;
			res/=i+1;
		}
		return res;
	}
	@SuppressWarnings("unused")
	private static int StringCount(String T,String v) {
		int res=0;
		int t=0;
		while(T.indexOf(v,t)>=0) {
			//p(t);
			res++;
			t=T.indexOf(v,t)+1;
		}
		return res;
	}
	private static int arrayMax(int a[]) {
		int res=0;
		for(int i=0;i<a.length;i++)res=max(res,a[i]);
		return res;
	}
	private static void swap(int V[],int a,int b) {
		int temp=V[b];
		V[b]=V[a];
		V[a]=temp;
	}
	//Map<Integer, HashSet<Integer>> map = new HashMap<>();
	//

	private static int ketawa(String S) {
		int res=0;
		for(int i=0;i<S.length();i++) {
			res+=S.charAt(i)-'0';
		}return res;
	}
	private static void p(long[][] a) {for(int i=0;i<a.length;i++)p(a[i]);};
	private static void p(long[] a) {p(Arrays.toString(a));};
	private static void p(int[][] a) {for(int i=0;i<a.length;i++)p(a[i]);};
	private static void p(int[] a) {p(Arrays.toString(a));};
	private static <T> void p(T t) {out.println(t);}
	private static <T> void p() {out.println();}
	private static void p(graph.edge2[] e) {
		for (int i = 0; i < e.length; i++) {
			out.println(e[i].to+" "+e[i].cost);
		}
	}
	private static void doubleToString(double a) {
		System.out.println(BigDecimal.valueOf(a).toPlainString());
	}
	private static int mod=1000000000+7;
	private static long A_[];
	private static long memo[][];
	private static ArrayList<Map<Integer,Integer>> c;
	private static <T> int[] ArrayListToList(ArrayList<Integer> c2,int[] v) {for(int i=0;i<c2.size();i++)v[i]=c2.get(i);return v;}
	private static ArrayList<Integer> ListToArrayList(int[] v) {ArrayList<Integer> c=new ArrayList<>(v.length);for(int i=0;i<v.length;i++)c.add(v[i]);return c;}
	private static String maenizero(String s,int keta) {
		while(s.length()<keta)s="0"+s;
		return s;
	}

	private static int ketawa(int S) {
		int res=0;
		while(S!=0) {
			res+=S%10;
			S/=10;
		}
		return res;
	}
	private static long X_x[]=new long[1];
	private static long kaijou(int x,long mod) {
		if(X_x.length!=50000000)X_x=new long[50000000];
		if(x<=1)return X_x[x]=1;
		if(X_x[x]!=0)return X_x[x];
		return X_x[x]=(x*kaijou(x-1,mod))%mod;
		/*long a=1;
		for(int i=2;i<=K;i++)a=(a*i)%mod;
		return (int)a;*/

	}


	private static long memo2[][];
	private static long V(int N,int k) {
		//NをK回に切り分ける方法
		//p(N+" "+k);
		if(k<=0)return 0;
		if(N<=k)return memo2[N][k]=0;
		if(N-k==1)return memo2[N][k]=1;
		if(k==1) {
			return memo2[N][k]=N-1;
		}
		if(memo2[N][k]!=-1)return memo2[N][k];

		else {
			long res=0;
			for (int i = 1; N-i>=k-1; i++) {
				res+=V(N-i,k-1);
			}
			return memo2[N][k]=res;
		}
	}

	static class segmentTree{
		int n;
		long dat[];
		long identity=1;//単位元
		segmentTree(int N,int identity) {//setTreeの要素の数
			this.identity =identity;
			init(N);
		}
		void init(int n_) {
			this.n=1;
			while(n<n_)n*=2;
			this.dat= new long[2*n-1];
			for(int i=0;i<2*n-1;i++)dat[i]=identity;
		}
		void update(int k,long a) {
			k+=n-1;
			dat[k]=a;
			while(k>0) {
				k=(k-1)/2;
				//System.err.println("update "+k+" "+Cal(this.dat[k*2+1],this.dat[k*2+2]));
				dat[k]=Cal(dat[k*2+1],dat[k*2+2]);
			}
		}
		long get(int k) {//k番目の値を取得 0<=k<N
			k+=n-1;
			return dat[k];
		}
		//[a,b)を求める。
		long getV(int a,int b) {
			return query(a, b, 0, 0, n);
		}
		//[a,b)の値を求める
		//外から呼び出すときは、a,b,0,0,N
		long query(int a,int b,int k,int l,int r) {
			if(r<=a||b<=l) {
				return identity;
			}
			if(a<=l&&r<=b) {
				return dat[k];
			}else {
				long A=query(a, b, k*2+1, l, (l+r)/2);
				long B=query(a, b, k*2+2, (l+r)/2, r);
				return Cal(A,B);
			}
		}
		long Cal(long a,long b) {
			
			return Math.min(a, b);
		}
		int size() {
			return n;
		}
		//確認事項:Calとidentity
		//segmentTreeで宣言、initで初期化する。
		void toString(int n) {
			for(int i=0;i<n*2;i++) {
				System.err.print(dat[i]+" ");
			}
			System.err.println();
		}
		
		//
	}
	static class D implements Comparable<D>{
		int a;
		int b;
		D(int	a,int b){
			this.a=a;
			this.b=b;
		}

		@Override
		public int compareTo(D o) {

			Comparable key = (Comparable)this.a;
			Comparable key2 = (Comparable)o.a;

			Comparable key3 = (Comparable)this.b;
			Comparable key4 = (Comparable)o.b;

			if(key.compareTo(key2)==0) {
				return key3.compareTo(key4);
			}
			return key.compareTo(key2);
		}
	}
	static void B(boolean x) {
		if(x)p("Yes");
		else p("No");
	}
	static void B(boolean x, String a,String b) {
		if(x)p(a);
		else p(b);
	}
	static int count=0;
	private static void solver(){
		int a = sc.nextInt(), b = sc.nextInt();
		B(a==b);
	}
	
	
	
	
	private static double[][] gyakutwotwo(double[][] A){
		if(A[0][0]*A[1][1]-A[1][0]*A[0][1]==0) {
			System.out.println("YOU CANT DIVIDE BY ZERO");
			return null;
		}
		double X=A[0][0]*A[1][1]-A[1][0]*A[0][1];
		double C[][]=new double[2][2];
		C[0][0]=A[1][1]/X;
		C[1][1]=A[0][0]/X;
		C[1][0]=-A[+1][0]/X;
		C[0][1]=-A[0][1]/X;
		return C;
		
	}
	private static double[][] gyoureturuijou(int N,double A[][]){
		if(N<=0)return A;
		double res[][]=A.clone();// =1
		double a[][]=A.clone();// =1
		
		while(N!=0) {
			if((1&N)==1) {
				res=mTimesm(res, a);
			}
			a=mTimesm(a, a);
			N=N>>1;
		}
		return res;
	}
	private static double[][] mTimesm(double A[][],double B[][]) {
		if(A[0].length!=B.length) {
			System.out.println("BAD GYOURETU : NO ANSWER");//求められない行列
			return null;
		}
		//行列の積 Aの縦 * Bの横の行列を返す。
		double C[][]=new double[A.length][B[0].length];
		for (int i = 0; i < A.length; i++) {//横
			for (int t = 0; t < B[0].length; t++) {//縦
				for (int k = 0; k < A[0].length; k++) {
					C[i][t]+=A[i][k]*B[k][t];
				}
			}
		}
		return C;
	}
	private static int[][] mPlusm(int A[][],int B[][]) {
		//m + mの正方行列の和
		int C[][]=new int[A.length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int t = 0; t < A.length; t++) {
				C[i][t]=A[i][t]+B[i][t];
			}
		}
		return C;
	}
	
	

	
	
	
	static long modinv(long a,long mod) {
		long b=mod,u=1,v=0;
		while(b!=0) {
			long t=a/b;
			a-=t*b;long tem=a;a=b;b=tem;
			u-=t*v;tem=u;u=v;v=tem;
		}
		u%=mod;
		if(u<0)u+=mod;
		return u;
	}
	static long[] extendedGCD(long a, long b) {
        long s = 0, old_s = 1;
        long t = 1, old_t = 0;
        long r = b, old_r = a;
        while(r != 0) {
            long q = old_r / r;
            long old_s0 = old_s, old_t0 = old_t, old_r0 = old_r;
            old_s = s;
            s = old_s0 - q * s;
            old_t = t;
            t = old_t0 - q * t;
            old_r = r;
            r = old_r0 - q * r;
        }
        return new long[] {old_s, old_t};
    }
	private static Map<Integer, Long> dikstr2(int V,int E,int r,Map<Integer, ArrayList<graph.edge2>> m) {
		//最短距離を配列ではなく、mapで処理したい
		Map<Integer, Long> D = new HashMap<>(V);
		for (int i:m.keySet()) {
			D.put(i, LINF);
		}
		D.replace(r, 0L);
		PriorityQueue<Pair<Long,Integer>> p = new PriorityQueue<>();//add poll
		p.add(new Pair<Long, Integer>(0L, r));
		while(!p.isEmpty()) {
			Pair<Long,Integer> x=p.poll();
			int from=x.getValue();
			if(x.getKey()>D.get(from))continue;
			if(!m.containsKey(from))continue;
			for (int i = 0; i < m.get(from).size(); i++) {
				graph.edge2 e=m.get(from).get(i);
				if(D.get(e.to)>D.get(from)+e.cost) {
					D.replace(e.to, D.get(from)+e.cost);
					p.add(new Pair<Long, Integer>(D.get(e.to), e.to));
				}
			}
		}
		return D;
	}

	private static class graph{
		static class edge implements Comparable<edge>{
			int from,to,cost;
			public edge(int from,int to,int cost) {
				this.from=from;
				this.to=to;
				this.cost=cost;
			}
			@Override
			public int compareTo(edge o) {

				Comparable key = (Comparable)this.cost;
				Comparable key2 = (Comparable)o.cost;


				return key.compareTo(key2);
			}
		}
		static class edge2{
			int to;
			long cost;
			public edge2(int to,long cost) {
				this.to=to;
				this.cost=cost;
			}
		}
		//単一始点最短距離問題(ダイクストラ法) 負閉路対策不可 経路復元
		private static long[] dikstr(int V,int E,int r,Map<Integer, ArrayList<edge2>> m) {
			//int path[]=new int[V];
			//Arrays.fill(path, -1);
			long d[]=new long[V];
			Arrays.fill(d, LINF);
			d[r]=0;
			PriorityQueue<Pair<Long,Integer>> p = new PriorityQueue<>();//add poll
			p.add(new Pair<Long, Integer>(0L, r));
			while(!p.isEmpty()) {
				Pair<Long,Integer> x=p.poll();
				int from=x.getValue();
				if(x.getKey()>d[from])continue;
				if(!m.containsKey(from))continue;
				for (int i = 0; i < m.get(from).size(); i++) {
					edge2 e=m.get(from).get(i);
					if(d[e.to]>d[from]+e.cost) {
						d[e.to]=d[from]+e.cost;
						p.add(new Pair<Long, Integer>(d[e.to], e.to));
						//path[e.to]=from;
					}
				}
			}


			//経路復元
			//複数の経路を考える必要がある時は、pathに複数の同じような最短経路の辺を保存しておく
			//ArrayList<Integer> PATHs = new ArrayList<>();
			//int t=V-1;//goalから逆算する この場合0=goal
			//for(;t!=-1;t=path[t]) {
			//	PATHs.add(t);
			//}
			//p(path);
			//Collections.reverse(PATHs);
			//System.out.println(PATHs);

			return d;
		}
		//単一始点最短距離問題(ベルマンフォード法) 負閉路対策済み
		private static int[] shortest_path(int V,int E,int r,edge e[]) {
			int d[]=new int[V]; //0~eのグラフはこれ

			//Map<Integer, Integer> d = new HashMap<>();それ以外はこれ
			//for(int i=0;i<E;i++) {
			//	if(!d.containsKey(e[i].to))m.add(new Pair<Integer, Integer>(e[i].to, INF));
			//	if(!d.containsKey(e[i].from))m.add(new Pair<Integer, Integer>(e[i].from, INF));
			//}

			//d.replace(r, 0);

			Arrays.fill(d, INF);
			d[r]=0;
			int count=0;
			while(true) {
				boolean update =false;
				for(int i=0;i<E;i++) {
					if(d[e[i].from]!=INF&&d[e[i].from]+e[i].cost<d[e[i].to]) {
						update=true;
						d[e[i].to]=d[e[i].from]+e[i].cost;
					}
				}
				if(!update)break;
				if(count==V) {
					p("NEGATIVE CYCLE");
					return null;
				}
				count++;
			}
			return d;
		}
		//最小全域木問題(クラスカル法)
		private static long kruskal(int V,edge es[]) {
			Arrays.sort(es);
			int uni[]=new int[V];
			for(int i=0;i<V;i++)uni[i]=i;
			long res=0;
			for (int i = 0; i < es.length; i++) {
				if(Union_Find.find(uni, es[i].from)!=Union_Find.find(uni, es[i].to)) {
					Union_Find.union(uni, es[i].from, es[i].to);
					res+=es[i].cost;
				}
			}
			return res;
		}
	}
	private static long Pow(long i,long t) {
		//iのt乗をO(log t)で返す
		long a=i;
		long res=1;
		//for(int i=0;i<S.length();i++) {if(S.charAt(N-i)=='1') {res=res*a%mod;}
		//tをStringで受け取りたい時用
		while(t!=0) {
			if((1&t)==1) {
				res=res*a;
			}
			a=a*a;
			t=t>>1;
		}
		return res;
	}
	private static Map<Long, Integer> primeNumbers(long N) {
		Map<Long, Integer> c = new HashMap<>();
		for(long i=2;i*i<=N;i++) {
			if(N%i==0) {
				int count=0;
				while(N%i==0) {
					N/=i;
					count++;
				}
				c.put(i, count);
				continue;
			}
		}
		if(N!=1) {
			c.put(N, 1);
		}
		return c;
	}
//=========================Union Find=============================================
    //union idx2 tree to idx1 tree O(a(N))
private static class Union_Find{
	private static int find(int[] tree,int idx) {//木の根のindexを返す
        if(tree[idx]==idx) return idx;
        return tree[idx] = find(tree,tree[idx]);

    }
	private static void union_shape(int[] tree) {//木の根に直接つなげる 経路圧縮
		for(int i=0;i<tree.length;i++) {
			find(tree,i);
		}
	}
    private static int[] union(int tree[],int idx1,int idx2) {//idx1の根にidx2をつなげる
        int root1 = find(tree,idx1);
        int root2 = find(tree,idx2);
        tree[root2] = root1;
        return tree;
    }
    private static int union_MaxSize(int[] tree) {//最も大きい木の頂点数を返す
		union_shape(tree);
		int V[]=new int[tree.length+1];
		for(int i=0;i<tree.length;i++) {
			V[tree[i]]++;
		}
		int max=0;
		for(int i=0;i<=tree.length;i++) {
			max=Math.max(max, V[i]);
		}
		return max;
	}
    private static int tree_Number(int[] tree) {//木の数を返す
    	int res=0;
    	for(int i=0;i<tree.length;i++) {
    		if(tree[i]==i)res++;
    	}
    	return res;
    }
    private static void union2(int tree[],int idx1,int idx2) {//idx1の根にidx2をつなげる
        int root1 = find(tree,idx1);
        int root2 = Union_Find.find(tree,idx2);
        if(root1==root2)return;
        if(c.get(root1).size()>c.get(root2).size()) {
        	//root2をroot1に移し替える
        	for(int a:c.get(root2).keySet()) {
            	if(!c.get(root1).containsKey(a)) {
            		c.get(root1).put(a, 0);
            	}
            	c.get(root1).replace(a, c.get(root1).get(a)+c.get(root2).get(a));
            }
        	tree[root2] = root1;
        }else {
        	for(int a:c.get(root1).keySet()) {
            	if(!c.get(root2).containsKey(a)) {
            		c.get(root2).put(a, 0);
            	}
            	c.get(root2).replace(a, c.get(root2).get(a)+c.get(root1).get(a));
            }
        	tree[root1] = root2;
        }
        //return tree;
    }
}
//=========================二分探索=============================================
private static class binarySerch{
	private static int BinarySearch(int A[],int value) {
		int S=0,E=A.length,G=-1;
		while(S<=E) {
			G=(S+E)/2;
			if(A[G]==value)return G;
			else if(A[G]>value) {
				if(E==G)break;E=G;
			}else if(A[G]<value) {
				if(S==G)break;S=G;
			}
		}
		return -1;
	}
	private static int lowerBound(int A[],int value) {
		//A[i-1]<value<=A[i] value以上のindexを返す
		//value未満しかなかったらA.lengthを返す
		//value以上の個数は(A.length-i)value未満の個数はiである
		int S=0,E=A.length,G=-1;
		if(A[0]>=value)return 0;
		if(A[A.length-1]<value)return A.length;

		while(true) {
			G=(S+E)/2;

			if(A[G]>=value&&A[G-1]<value) {
				return G;
			}else if(A[G]>=value) {
				E=G;
			}else if(A[G]<value) {
				S=G;
			}

		}
	}
	private static int upperBound(int A[],int value) {
		//A[i-1]<=value<A[i] valueより大きい数のindexの最小値を返す
		//value以下しかなかったらA.lengthを返す
		//valueより大きい数の個数は(A.length-i)value以下の個数はiである
		int S=0,E=A.length,G=-1;
		if(A[0]>value)return 0;
		if(A[A.length-1]<=value)return A.length;

		while(true) {
			G=(S+E)/2;

			if(A[G]>value&&A[G-1]<=value) {
				return G;
			}else if(A[G]>value) {
				E=G;
			}else if(A[G]<=value) {
				S=G;
			}

		}
	}
	private static int lowerBound(long A[],long value) {
		//A[i-1]<value<=A[i] value以上のindexを返す
		//value未満しかなかったらA.lengthを返す
		//value以上の個数は(A.length-i)value未満の個数はiである
		int S=0,E=A.length,G=-1;
		if(A[0]>=value)return 0;
		if(A[A.length-1]<value)return A.length;

		while(true) {
			G=(S+E)/2;

			if(A[G]>=value&&A[G-1]<value) {
				return G;
			}else if(A[G]>=value) {
				E=G;
			}else if(A[G]<value) {
				S=G;
			}

		}
	}
	private static int upperBound(long A[],long value) {
		//A[i-1]<=value<A[i] valueより大きい数のindexの最小値を返す
		//value以下しかなかったらA.lengthを返す
		//valueより大きい数の個数は(A.length-i)value以下の個数はiである
		int S=0,E=A.length,G=-1;
		if(A[0]>value)return 0;
		if(A[A.length-1]<=value)return A.length;

		while(true) {
			G=(S+E)/2;

			if(A[G]>value&&A[G-1]<=value) {
				return G;
			}else if(A[G]>value) {
				E=G;
			}else if(A[G]<=value) {
				S=G;
			}

		}
	}

	private static int lowerBound(ArrayList<Integer> A,int value) {
		//A[i-1]<value<=A[i] value以上のindexを返す
		//value未満しかなかったらA.lengthを返す
		//value以上の個数は(A.length-i)value未満の個数はiである
		int S=0,E=A.size(),G=-1;
		if(A.get(0)>=value)return 0;
		if(A.get(A.size()-1)<value)return A.size();

		while(true) {
			G=(S+E)/2;

			if(A.get(G)>=value&&A.get(G-1)<value) {
				return G;
			}else if(A.get(G)>=value) {
				E=G;
			}else if(A.get(G)<value) {
				S=G;
			}

		}
	}
	private static int upperBound(ArrayList<Integer> A,int value) {
		//A[i-1]<=value<A[i] valueより大きい数のindexの最小値を返す
		//value以下しかなかったらA.lengthを返す
		//valueより大きい数の個数は(A.length-i)value以下の個数はiである
		int S=0,E=A.size(),G=-1;
		if(A.get(0)>value)return 0;
		if(A.get(A.size()-1)<=value)return A.size();

		while(true) {
			G=(S+E)/2;

			if(A.get(G)>value&&A.get(G-1)<=value) {
				return G;
			}else if(A.get(G)>value) {
				E=G;
			}else if(A.get(G)<=value) {
				S=G;
			}

		}
	}
	private static int lowerBound(ArrayList<Long> A,long value) {
		//A[i-1]<value<=A[i] value以上のindexを返す
		//value未満しかなかったらA.lengthを返す
		//value以上の個数は(A.length-i)value未満の個数はiである
		int S=0,E=A.size(),G=-1;
		if(A.get(0)>=value)return 0;
		if(A.get(A.size()-1)<value)return A.size();

		while(true) {
			G=(S+E)/2;

			if(A.get(G)>=value&&A.get(G-1)<value) {
				return G;
			}else if(A.get(G)>=value) {
				E=G;
			}else if(A.get(G)<value) {
				S=G;
			}

		}
	}
	private static int upperBound(ArrayList<Long> A,long value) {
		//A[i-1]<=value<A[i] valueより大きい数のindexの最小値を返す
		//value以下しかなかったらA.lengthを返す
		//valueより大きい数の個数は(A.length-i)value以下の個数はiである
		int S=0,E=A.size(),G=-1;
		if(A.get(0)>value)return 0;
		if(A.get(A.size()-1)<=value)return A.size();

		while(true) {
			G=(S+E)/2;

			if(A.get(G)>value&&A.get(G-1)<=value) {
				return G;
			}else if(A.get(G)>value) {
				E=G;
			}else if(A.get(G)<=value) {
				S=G;
			}

		}
	}
}
//=========================累積和====================================================
private static class cumlativeSum{
	private static long GetCumulativeSum(long V[],int a,int b,int nindex) {
		//1-indexであるa-b間の和を求める 要素の数はa-b+1個
		if(nindex==0) {//0-indexの時は1-indexに変える
			a++;b++;
		}
		return V[b]-V[a-1];
	}
	private static int GetCumulativeSum(int V[],int a,int b,int nindex) {
		//1-indexであるa-b間の和を求める 要素の数はa-b+1個
		if(nindex==0) {//0-indexの時は1-indexに変える
			a++;b++;
		}
		return V[b]-V[a-1];
	}
	private static int[] nextIntCumulativeSum(int N) {
		int Csum[]=new int[N+1];
		for(int i=1;i<=N;i++) {
			Csum[i]=sc.nextInt()+Csum[i-1];
		}
		return Csum;
	}
	private static long[] nextLongCumulativeSum(int N) {
		long Csum2[]=new long[N+1];
		for(int i=1;i<=N;i++) {
			Csum2[i]=sc.nextInt()+Csum2[i-1];
		}
		return Csum2;
	}
	private static int getV(int S[][],int x,int y,int a,int b) {
		//p(S[x-1][y-1]+" "+S[x+a-1][y+b-1]+" "+S[x-1][y+b-1]+" "+S[x+a-1][y-1]);
		return S[x-1][y-1]+S[x+a-1][y+b-1]-S[x-1][y+b-1]-S[x+a-1][y-1];
	}
}
	private static long modNcR2(int n,int r,int mod) {
		long x_b=1;

		for(int i=0;i<r;i++) {
			x_b*=(n-i);
			x_b%=mod;
		}

		long y=1;
		for(int i=1;i<=r;i++) {
			y*=i;
			y%=mod;
			//nPrにr!%modの逆元を掛ける
		}
		return  (x_b*modPow((int) y,mod-2,mod)%mod);

	}
	private static long modPow(long i,long t,long mod) {
		if(t==0)return 1;
		if(i==0)return 0;
		//iのt乗をO(log t)で返す
		i%=mod;
		//t%=mod;
		long a=i%mod;
		long res=1;
		//for(int i=0;i<S.length();i++) {if(S.charAt(N-i)=='1') {res=res*a%mod;}
		//tをStringで受け取りたい時用
		while(t!=0) {
			if((1&t)==1) {
				res=res*a%mod;
			}
			a=a*a%mod;
			t=t>>1;
		}
		return res;
	}
	private static long min(long ...a) {

		long m=a[0];
		for(int i=0;i<a.length;i++) {
			m=Math.min(a[i], m);
		}
		return m;



	}
	private static int min(int ...a) {

	int m=a[0];
	for(int i=0;i<a.length;i++) {
		m=Math.min(a[i], m);
	}
	return m;
}
	private static int max(int ...a) {

	int m=a[0];
	for(int i=0;i<a.length;i++) {
		m=Math.max(a[i], m);
	}
	return m;
}
	private static long max(long ...a) {
		long m=a[0];
		for(int i=0;i<a.length;i++) {
			m=Math.max(a[i], m);
		}
		return m;
	}
	private static double min(double ...a) {
		double m=a[0];
	for(int i=0;i<a.length;i++) {
		m=Math.min(a[i], m);
	}
	return m;
}
	private static double max(double ...a) {
	double m=a[0];
	for(int i=0;i<a.length;i++) {
		m=Math.max(a[i], m);
	}
	return m;
}
	private static int abs(int a) {
		return max(a,-a);
	}
	private static long abs(long a) {
		return max(a,-a);
	}
	private static double abs(double a) {
		return max(a,-a);
	}
	private static String zeroume(String S) {
		while(S.length()<6)S='0'+S;
		return S;
	}

	//速度が足りないときは、前計算を1回だけにしたり、longをintに変えたりするといい
	public static long gcd(long num1,long num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }
	public static long lcm(long num1,long num2) {
		return num1*num2/gcd(num1,num2);
	}
	//O(N^0.5)
		private static void bubunwa() {
		int N=sc.nextInt();
		int K=sc.nextInt();
		int a[]=sc.nextIntArray(N, false);

		boolean dp[] =new boolean[K+1];

		Arrays.fill(dp, false);
		dp[0]=true;
		for(int i=0;i<N;i++) {
			for(int x=K-a[i];x>=0;x--) {
				if(dp[x])dp[x+a[i]]=true;
			}
		}

		p(dp[K] ? "Yes":"No");
	}
	static String nextPermutation(String s) {
		ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<s.length();i++) {
			list.add(s.charAt(i));
		}
		int pivotPos=-1;
		char pivot=0;
		for(int i=list.size()-2;i>=0;i--) {
			if(list.get(i)<list.get(i+1)) {
				pivotPos=i;
				pivot=list.get(i);
				break;
			}
		}
		if(pivotPos==-1&&pivot==0) {
			return "Final";
		}
		int L=pivotPos+1,R=list.size()-1;



		int minPos=-1;
		char min =Character.MAX_VALUE;

		for(int i=R;i>=L;i--) {
			if(pivot<list.get(i)) {
				if(list.get(i)<min) {
					min=list.get(i);
					minPos=i;
				}
			}
		}

		Collections.swap(list, pivotPos, minPos);
		Collections.sort(list.subList(L, R+1));


		StringBuilder sb=new StringBuilder();
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
		}
		return sb.toString();
	}
	private static long[][] com;
	private static void nCr(int mod) {
	int MAX = 3001;
	com= new long[MAX][MAX];
	for(int i = 0; i < MAX; i++)
	    com[i][0] = 1;
	for(int i = 1; i < MAX; i++) {
	    for(int j = 1; j <= i; j++) {
	        com[i][j] = com[i-1][j-1] + com[i-1][j];
	        com[i][j] %= mod;
	    }
	}
}
	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;

	    private boolean hasNextByte() {
	      if (ptr < buflen) {
	        return true;
	      } else {
	        ptr = 0;
	        try {
	          buflen = in.read(buffer);
	        } catch (IOException e) {
	          e.printStackTrace();
	        }
	        if (buflen <= 0) {
	          return false;
	        }
	      }
	      return true;
	    }

	    private int readByte() {
	      if (hasNextByte()) return buffer[ptr++];
	      else return -1;
	    }

	    private static boolean isPrintableChar(int c) {
	      return 33 <= c && c <= 126;
	    }

	    private void skipUnprintable() {
	      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
	    }

	    public boolean hasNext() {
	      skipUnprintable();
	      return hasNextByte();
	    }

	    public String next() {
	      if (!hasNext()) throw new NoSuchElementException();
	      StringBuilder sb = new StringBuilder();
	      int b = readByte();
	      while (isPrintableChar(b)) {
	        sb.appendCodePoint(b);
	        b = readByte();
	      }
	      return sb.toString();
	    }

	    public long nextLong() {
	      if (!hasNext()) throw new NoSuchElementException();
	      long n = 0;
	      boolean minus = false;
	      int b = readByte();
	      if (b == '-') {
	        minus = true;
	        b = readByte();
	      }
	      if (b < '0' || '9' < b) {
	        throw new NumberFormatException();
	      }
	      while (true) {
	        if ('0' <= b && b <= '9') {
	          n *= 10;
	          n += b - '0';
	        } else if (b == -1 || !isPrintableChar(b)) {
	          return minus ? -n : n;
	        } else {
	          throw new NumberFormatException();
	        }
	        b = readByte();
	      }
	    }

	    public int nextInt() {
	      return (int) nextLong();
	    }

	    public double nextDouble(){
	    	return Double.parseDouble(next());
	    }
	    public int[] nextIntArray(int N) {

		        int[] array = new int[N];
		        for (int i = 0; i < N; i++) {
		          array[i] = sc.nextInt();
		        }
		        return array;

		    }
	    public int[] nextIntArray(int N, boolean oneBased) {
	      if (oneBased) {
	        int[] array = new int[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      } else {
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextInt();
	        }
	        return array;
	      }
	    }

	    public long[] nextLongArray(int N, boolean oneBased) {
	      if (oneBased) {
	        long[] array = new long[N + 1];
	        for (int i = 1; i <= N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      } else {
	        long[] array = new long[N];
	        for (int i = 0; i < N; i++) {
	          array[i] = sc.nextLong();
	        }
	        return array;
	      }
	    }
	    public long[] nextLongArray(int N) {
		        long[] array = new long[N];
		        for (int i = 0; i < N; i++) {
		          array[i] = sc.nextLong();
		        }
		        return array;
		      }

	  }
}

