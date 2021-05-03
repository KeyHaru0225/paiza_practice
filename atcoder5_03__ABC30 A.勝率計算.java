// ABC30 A.勝率計算

// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);
            int d = Integer.parseInt(chr[3]);
          
            Double T = (double)b/a;
            Double A = (double)d/c;
          
            if(T > A) {
            	System.out.println("TAKAHASHI");
            } else if (T == A) {
            	System.out.println("DRAW");
            } else {
            	System.out.println("AOKI");
            }
          
        }
    }
}

// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			double a = Double.parseDouble(chr[0]);
			double b = Double.parseDouble(chr[1]);
			double c = Double.parseDouble(chr[2]);
            double d = Double.parseDouble(chr[3]);
          
            Double T = b/a;
            Double A = d/c;
          
            if(T > A) {
            	System.out.println("TAKAHASHI");
            } else if (T == A) {
            	System.out.println("DRAW");
            } else {
            	System.out.println("AOKI");
            }
          
        }
    }
}


//  89ms/32,544KB　やっと正解。
//  Buffered～を使う時はなるべくInt型使った方が桁落ちとかしやんくて良いんかな…
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);
            int d = Integer.parseInt(chr[3]);
          
            if(100*b/a > 100*d/c) {
            	System.out.println("TAKAHASHI");
            } else if (100*b/a < 100*d/c) {
            	System.out.println("AOKI");
            } else {
            	System.out.println("DRAW");
            }
          
        }
    }
}




// 1 138ms/37,264KB
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();

		double takahashi = b / a;
		double aoki = d / c;

		if(takahashi > aoki) {
			System.out.println("TAKAHASHI");
		} else if(takahashi < aoki) {
			System.out.println("AOKI");
		} else if(takahashi == aoki && b >= d) {
			System.out.println("DRAW");
		} else if(takahashi == aoki && b <= d) {
			System.out.println("DRAW");
		}
	}
}


// 2 122ms/35,600KB
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        if(100*b/a > 100*d/c){
            System.out.println("TAKAHASHI");
        } else if (100*b/a < 100*d/c){
            System.out.println("AOKI");
        } else {
            System.out.println("DRAW");
        }
    }
}