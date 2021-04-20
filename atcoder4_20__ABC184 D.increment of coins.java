// ABC184 D.increment of coins

// 期待値の問題、計算式がわかんねー


// 誰1 119ms/36,636KB
// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    static double[][][]dp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        dp=new double[101][101][101];
        double sol=f(a,b,c);
        System.out.println(sol);
    }
    public static double f(int a,int b,int c){
        if(a>=100 || b>=100 || c>=100) return 0.0;
        if(dp[a][b][c]!=0)return dp[a][b][c];
        double sum=a+b+c;
        double prob=0;
        if(a>0)prob=prob+((1+f(a+1,b,c))*a)/sum;
        if(b>0)prob=prob+((1+f(a,b+1,c))*b)/sum;
        if(c>0)prob=prob+((1+f(a,b,c+1))*c)/sum;
        
        return dp[a][b][c]=prob;
    }
}


// 誰2 147ms/45,224KB
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        double dp[][][] = new double[101][101][101];
        for (int x = 99; x >= a; --x) {
            for (int y = 99; y >= b; --y) {
                for (int z = 99; z >= c; --z) {
                    int sum = x + y + z;
                    double tmpx = dp[x + 1][y][z] + 1.0, tmpy = dp[x][y + 1][z] + 1.0, tmpz = dp[x][y][z + 1] + 1.0;
                    tmpx *= (double) x;
                    tmpy *= (double) y;
                    tmpz *= (double) z;
                    double tmp = tmpx + tmpy + tmpz;
                    tmp /= (double) sum;
                    dp[x][y][z] = tmp;
                }
            }
        }
        double ans = dp[a][b][c];
        System.out.println(ans);
    }
}
