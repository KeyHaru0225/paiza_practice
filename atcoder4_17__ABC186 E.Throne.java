// ABC186 E.Throne

//　問題文は分かった。人の答えみてもよくわからん。難しいね、この問題。

// 誰1 123ms/36,056KB
import java.util.Scanner;

public class Main {

    static Scanner scanner;
    static long x=0;
    static long y=0;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int T=gi();
        StringBuilder ans=new StringBuilder();
        extgcd(111,30);
        for(int i=0; i<T;i++) {
        	if(i!=0)ans.append(System.lineSeparator());
        	long N=gl();
        	long S=gl();
        	long K=gl();
        	long u=extgcd(N,-K);
        	if(S%u!=0) {
        		ans.append(-1);
        		continue;
        	}

        	long v=y*S/u;
        	long t=N/u;
        	long vv=v%t;
        	if(vv<0)vv+=Math.abs(t);
            ans.append(vv);
        }
        System.out.println(ans);
    }

    // ユークリッドの互除法
    public static long uclid(long m, long n) {
        if (m<n) {
            m^=n;
            n^=m;
            m^=n;
        }

        while(true) {
            long t=m%n;
            if (t==0) {
                return n;
            } else {
                m=n;
                n=t;
            }
        }
    }

    public static long extgcd(long a, long b) {
        if(b==0) {
        	x=1;
        	y=0;
        	return a;
        }
        long d=extgcd(b, a%b);
        x^=y;
        y^=x;
        x^=y;
        y-=a/b*x;
    	return d;
    }

    // 文字列として入力を取得
    public static String gs() {
         return scanner.next();
    }

    // intとして入力を取得
    public static int gi() {
         return Integer.parseInt(scanner.next());
    }

    // longとして入力を取得
    public static long gl() {
         return Long.parseLong(scanner.next());
    }

    // doubleとして入力を取得
    public static double gd() {
         return Double.parseDouble(scanner.next());
    }
}


//　誰2 141ms/36,256KB
import java.util.Scanner;

class Main {
	public static void main(String... args) {
		//System.out.println(multInverse(43, 15) + " " + multInverse(553, 142));
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt(), s = sc.nextInt(), k = sc.nextInt();
			System.out.println(calc(n, n-s, k));
		}
	}

	private static int calc(int n, int s, int k) {

		if (gcd(k, n) == 1)
			return (int ) (((long) s * (long) multInverse(n, k)) % (long) n);
		//System.out.println("not first");
		int g = gcd(k, n);
		if ((s - k) % g != 0)
			return -1;
		//System.out.println("not second");

		return calc(n / g, s / g, k / g);

	}

	public static int gcd(int a, int b) {
		int x = Math.max(a, b);
		int y = Math.min(a, b);
		while (y != 0) {
			x = x % y;
			int tmp = x;
			x = y;
			y = tmp;
		}
		return x;
	}

	public static int multInverse(int a, int b) {
		Point p = multInverseRec(a, b);
		return (p.y < 0) ? p.y + a : p.y;
	}

	private static Point multInverseRec(int m, int n) {
		if (n == 1)
			return new Point(0, n);
		Point p = multInverseRec(n, m % n);
		return new Point(p.y, p.x - (m / n) * p.y);
	}
}


class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

