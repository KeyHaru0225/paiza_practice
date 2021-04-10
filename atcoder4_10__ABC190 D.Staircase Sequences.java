// ABC190 D.Staircase Sequences

/*
公差とは、機械工学に代表される工学において許容される差のこと。
 基準値と許容される範囲の最大値および最小値の差を許容差、
最大値と最小値の差を公差と呼ぶ。
*/

/*
数学における等差数列とは、「隣接する項が共通の差を持つ数列」 を言う。
 例えば、5, 7, 9, 11, 13 … は初項 5, 公差 2 の等差数列である。
*/


// 誰かの答え1 135ms/35,644KB
import java.util.Scanner;

public class Main {

    public static long primeFactNum(long n) {
        long ans = 0;
        for (long i = 1; i <= n / i; ++i)
            ans += (n % i == 0 ? (i * i != n ? 2 : 1) : 0);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        while (n % 2 == 0)
            n >>= (long) 1;
        long ans = primeFactNum(n) << (long) 1;
        System.out.println(ans);
    }
}

// 誰かの答え2 74ms/25,684KB
import java.io.*;
import java.util.*;
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        long n = Long.parseLong(st.nextToken());;
        while (n%2==0) {
            n/=2;
        }
        long prod = 1;
        for (long i = 3; i <= Math.sqrt(n); i+=2) {
            long count = 1;
            while (n%i==0) {
                count++;
                n/=i;
            }
            prod*=count;
        }

        if (n>1) {
            prod*=2;
        }
        prod*=2;
        System.out.println(prod);
    }
}


// 誰かの答え3 126ms/35,596KB
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //N
        long n = sc.nextLong();
        while(n%2==0) n/=2;
 
        //ans count
        long ans = 0;

        for(long i=1; i*i<=n; i++){

            if(n%i==0){
                ans = ans + 2;
            }

            if(i*i==n) ans--;
        }
        
        System.out.println(ans*2);
    }
}