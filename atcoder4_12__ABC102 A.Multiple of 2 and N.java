// ABC102 A.Multiple of 2 and N


/*　最小公倍数のアルゴリズム(下の奴)まねしたら正解したわ
　　あんまよくわかってないけど
    誰1がわかりやすい解答かなあ
　
最小公倍数lcm
static int lcm (int a, int b) {
	int temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (int)(c/b);
}
*/　

// 83ms/32,640KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            int m =2;
          
            int lcm;
            int x = n;
            x *= m;
            while((lcm = n%m) != 0){
            	n = m;
                m = lcm;
            }
          System.out.println(x/m);
        }
    }
}


// 誰1 119ms/35,612KB
import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n % 2 == 0){
      System.out.print(n);
    } else {
       System.out.print(n * 2);
    }
    sc.close();
    }
  }


// 誰2  115ms/35,852KB
import java.util.*;

public class Main {

	static int GCD(int a, int b) {
		if (b == 0) return a;
		return GCD(b, a % b);
	}

	static int LCM(int a, int b) {
		return b * a / GCD(a, b);
	}

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(LCM(2,N));
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}
}
