// ABC196 C.Doubled


// 問題文がいみふ


// 誰かの答え1 379ms/56,772KB
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int cnt = 0;
    for(int i=1; i<=Math.pow(10,6); i++){
      String str = String.valueOf(i);
      String sum = str+str;
      long temp = Long.parseLong(sum);
      if(temp <= n)cnt++;
    }
    System.out.print(cnt);
  }
}

// 誰かの答え2 308ms/56,308KB
import java.util.Scanner;

public class Main {

	static long N;

	public static void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextLong();
		sc.nextLine();
		sc.close();
	}

	public static long f(long x) {
		String str = Long.toString(x);
		return Long.parseLong(str + str);
	}

	public static void main(String[] args) {
		input();

		long x = 1;
		while (f(x) <= N) {
			x++;
		}

		long ans = x - 1;
		System.out.println(ans);
	}

}


// 誰かの答え3 160ms/35,764KB
import java.util.*;
public class Main {
    private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        new Main().Solve();
    }

    void Solve() {
        var N = sc.nextLong();

        var x = 1L;
        var cnt = 0L;
        while(true) {
            var y = x * ((long)Math.pow(10, (long)Math.log10(x) + 1)) + x;
            if(y > N) break;
            x++;
            cnt++;
        }

        System.out.println(cnt);
    }
}
