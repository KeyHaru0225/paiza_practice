// ABC182 F.Valid payments

//　問題文がいまいち理解できん。答えも見てもわからん。

// 1 120ms/35,808KB
import java.util.*;
class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in); 
        int N = sc.nextInt(); long X = sc.nextLong();
        var a = new long[N+1];    
        for(int i=0;i<N;i++){
            a[i] = sc.nextLong();
        }
        a[N] = Long.MAX_VALUE / 3;
        var dp = new long[N+1][2];
        dp[N][0] = 1;
        for(int i=N-1;i>=0;i--){
            long rem = X % a[i+1];
            dp[i][0] += dp[i+1][0];
          	if(rem % a[i] != 0 && (rem / a[i] + 1) * a[i] < a[i+1]){
            	dp[i][1] += dp[i+1][0];
            }
            if(rem == 0 || i == N-1)continue;
          	rem = -(rem - a[i+1]);
            if(rem % a[i] != 0){           
            	dp[i][1] += dp[i+1][1];
                if((rem / a[i] + 1) * a[i] < a[i+1]){
            		dp[i][0] += dp[i+1][1];    
                }
            }else{
                dp[i][0] += dp[i+1][1];
            }
        }
        System.out.println(dp[0][0]);
    }
}