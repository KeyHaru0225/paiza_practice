// ABC187 D.Choose Me


// 問題文流し読みしかしてない

// 誰1 700ms/61,188KB
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[]arr=new long[n];
		long sum=0;
		for(int i=0;i<n;i++) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			arr[i]=2*a+b;
			sum=sum-a;
		}
		Arrays.sort(arr);
		int i=n-1;
		int count=0;
		while(sum<=0 && i>=0) {
			sum=sum+arr[i];
			count++;
			i--;
		}
		System.out.println(count);
		
		
	}
}


// 誰2 749ms/64,832KB
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long aoki = 0;
        long taka = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < N; i++){
            long a = sc.nextLong();
            long t = sc.nextLong();
            pq.add(2*a+t);
            aoki += a;
        }
        int count = 0;
        while(pq.size()>0){
            long p = pq.poll();
            taka += p;
            count++;
            if(taka>aoki){
                System.out.println(count);
                return;
            }
        }
        sc.close();

    }
}