// ABC197 C.ORXOR

// 問題文の意味は分かった。だがしかし、解けないのである。

// 皆書いてる内容はおんなじだった。

// 誰かの答え1
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0;i < n;i++)
            arr[i] = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i < 1 << (n - 1);i++){
            int xor = 0;
            int or = 0;
            for(int j = 0;j <= n;j++){
                if(j < n)
                    or |= arr[j];
                if(j == n || ((i >> j)&1) == 1){
                    xor ^= or;
                    or = 0;
                }
            }
            ans = Math.min(xor,ans);
        }
        System.out.println(ans);
    }
}


// 誰かの答え2
import java.util.Scanner;

/**
 * @author pribic (Priyank Doshi)
 * @since 03/04/21
 */
public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      /**
       * 1 3 7 5 4
       *
       * 0 0 1 0 0
       */
      int ans = Integer.MAX_VALUE;
      for (int i = 0; i < (1 << n); i++) {
        int runningXOr = 0;
        int runningOr = 0;
        for (int bit = 0; bit < n; bit++) {
          runningOr |= arr[bit];
          if ((i >> bit & 1) == 1) {
            runningXOr ^= runningOr;
            runningOr = 0;
          }
        }
        runningXOr ^= runningOr;
        ans = Math.min(ans, runningXOr);
      }
      System.out.println(ans);
    }
  }

  /**
   * 1 3 7 5 4
   */
  private static int solve(int[] arr, int start, int end) {
    if (end == start) return arr[start];
    int len = end - start + 1;
    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < len - 1; i++) {
      int cut1 = solve(arr, start, start + i);
      int cut2 = solve(arr, start + i + 1, end);
      ans = Math.min(ans, cut1 ^ cut2);
    }
    return ans;
  }

}

