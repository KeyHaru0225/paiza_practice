// ABC185 D.Stamp

// 問題文は理解できた。答え見ても難しくてわからん；；

// 誰1 591ms/60,668KB
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m+2];
		for (int i = 1; i <=m; i++) {
			arr[i] = sc.nextInt();
		}
		if (m == 0) {
			System.out.println(1);
		} else {
			arr[0]=0;
			arr[m+1]=n+1;
			Arrays.sort(arr);
			int min=Integer.MAX_VALUE;
			for(int i=1;i<arr.length;i++) {
				if(arr[i]-arr[i-1]-1>0) {
					min=Math.min(min, arr[i]-arr[i-1]-1);
				}
			}
			long sum=0;
			for(int i=1;i<arr.length;i++) {
				int val=arr[i]-arr[i-1]-1;
				
				if(val>0) {
					if(val%min==0) {
						sum+=val/min;
					}else {
						sum+=(val/min) +1;
					}
				}
			}
			System.out.println(sum);
		}
	}
}


// 誰2 310ms/62,400KB
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        String[] in = br.readLine().split(" ");
        int l = M + 2;
        var a = new int[l];
        a[0] = 0;
        for (int m = 0; m < M; m++) {
            a[m + 1] = Integer.parseInt(in[m]);
        }
        a[M + 1] = N + 1;
        Arrays.sort(a);

        int stamp = Integer.MAX_VALUE;
        var wid = new int[l - 1];
        for (int m = 0; m < l - 1; m++) {
            wid[m] = a[m + 1] - a[m] - 1;
            if (wid[m] != 0) {
                stamp = Math.min(wid[m], stamp);
            }
        }

        int ans = 0;
        for (int w = 0; w < l - 1; w++) {
            ans += (wid[w] + stamp - 1) / stamp;
        }

        System.out.println(ans);
    }
}