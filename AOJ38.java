//面積　S = 1/2*a*b*sinC
//長さ　h = 2S/a
//周の長さ L(まずcから求める)
//　c*c= a*a + b*b -2abcosC　余弦定理
//  cの正の平方根を求める
//  L = a+b+c

//数学的なAPIがわからんから適当にコーディング
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int c = sc.nextInt();
        
        double S = 1/2 * a * b* sinC;
        double h = 2S/a;
        
        c*c = a*a + b*b - 2abccosC
        //cの平方根をMath.sqrtで求める
        double L = a + b + c;
        
        System.out.printf("%.9f\n",S);
        System.out.printf("%.9f\n",h);
        System.out.printf("%.9f\n",L);
    }
}

//誰かの答え
import java.util.Scanner;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double degree = scanner.nextDouble();

		double S = 0.5*a*b*Math.sin(Math.PI*degree/180.0);
		double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.PI*degree/180.0));

		System.out.printf("%.10f\n",S);
		System.out.printf("%.10f\n", a+b+c);
		System.out.printf("%.10f\n", 2*S/a);
	}
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Double a,b,C;
        a=scan.nextDouble();
        b=scan.nextDouble();
        C=scan.nextDouble();
        C*=Math.PI/180.0;
        Double S=0.5*a*b*Math.sin(C);
        Double c=Math.sqrt(a*a+b*b-2*a*b*Math.cos(C));
        Double L=a+b+c;
        Double h=2*S/a;
        System.out.printf("%.5f\n%.5f\n%.5f\n",S,L,h);
        scan.close();
    }
}



