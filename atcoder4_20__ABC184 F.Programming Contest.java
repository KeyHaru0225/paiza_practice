// ABC184 F.Programming Contest

//　問題文はFのくせにシンプルで分かりやすい

// 誰1 1999ms/93,784KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int t = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		long ans = 0;
		int n2 = n / 2;
		TreeSet<Long> set = new TreeSet<>();
		int end = 1 << n2;
		for (int i = 0; i < end; i++) {
			long sum = 0;
			for (int j = 0; j < n2; j++) {
				if ((i >> j & 1) == 1) {
					sum += a[j];
				}
			}
			if (sum <= t) {
				ans = Math.max(ans, sum);
				set.add(sum);
			}
		}

		int n3 = n - n2;
		end = 1 << n3;
		for (int i = 0; i < end; i++) {
			long sum = 0;
			for (int j = 0; j < n3; j++) {
				if ((i >> j & 1) == 1) {
					sum += a[n2 + j];
				}
			}
			if (sum <= t) {
				ans = Math.max(ans, sum);
				long r = t - sum;
				Long v = set.floor(r);
				if (v != null) {
					ans = Math.max(ans, sum + v);
				}
			}
		}
		System.out.println(ans);
	}
}


// 誰2 262ms/61,136KB
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long t = sc.nextLong();
		
		long[] a = new long[n];
		long sum = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			if(a[i]<t)sum += a[i];
			else if(a[i] == t)
			{
				System.out.println(a[i]);
				return;
			}
		}
		
		if(sum <=t)
		{
			System.out.println(sum);
			return;
		}
		
		Arrays.sort(a);
		
		//ArrayList<Long> list = new ArrayList<>();
		PriorityQueue<Long> set = new PriorityQueue<>();
		set.add(0l);
		
		long remsum = sum;
		
		long ans = 0;
		
		for(int i = 0; i < n; i++)
		{
			//System.out.println("i: " + i + " " + set.size());
			PriorityQueue<Long> newset = new PriorityQueue<>();
			
			if(set.size() > 200000)
			{
				System.out.println(t);
				return;
			}
			
			
			remsum -=a[i];
			
			while(!set.isEmpty())
			{
				long ck = set.poll();
				
				if(ck+a[i] <= t)
				{
					ans=Math.max(ans, ck+a[i]);
					if(ck+a[i] <= t)newset.add(ck+a[i]);
				}
				if(ck+remsum >= t)
				{
					newset.add(ck);
				}
				else ans = Math.max(ans, ck+remsum);
				if(ck+a[i] >= t)
				{
					break;
				}
			}

			set = newset;
			
		}
		
		
		for(Long l : set)
		{
			if(l<= t)ans = Math.max(ans, l);
		}
		System.out.println(ans);
		

	}

}

