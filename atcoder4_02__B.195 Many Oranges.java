// B.195 Many Oranges

//なんかよくわからんくなった
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
            int w = Integer.parseInt(chr[2]) * 1000;
          
            if(w%a == 0 && w%b == 0)
          
        }
    }
}


// 下の人の答え見ながらやったら正解した
// 139ms/36,840KB
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
            int w = Integer.parseInt(chr[2]) * 1000;
          
            int max = -1;
			int min = 100_000_0;
          
            for(int i=1; i<=100_000_0; i++) {
				if(a*i<=w && w<=b*i) {
				min = Math.min(i,min);
				max = Math.max(i, max);
				}
		    }
          
           if(max == -1){
			System.out.println("UNSATISFIABLE");
			}else{
			  System.out.println(min+" "+max);
		    }
          
        }
    }
}


// 誰かの答え1
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int w = sc.nextInt();
		int W = 1000*w;
		int max = -1;
		int min = 1000000;
		
		for(int i=1; i<=1000000; ++i) {
			if(A*i<=W && W<=B*i) {
				min = Math.min(i,min);
				max = Math.max(i, max);
			}
		}
		
		if(max==-1) {
			System.out.println("UNSATISFIABLE");
		}else {
		System.out.println(min+" "+max);
		}
	}

}


// 誰かの答え2
// 100ms/27,220KB
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long w = sc.nextLong();
    long m = 1000 * 10000;
    long M = -1;
    for(long i = 1; i < 1000 * 1000 + 1; i++) {
      if(a * i <= w * 1000 && w * 1000 <= b * i){
        m = Math.min(m, i);
        M = Math.max(M, i);
      }
    }
    if(M == -1) {
      System.out.println("UNSATISFIABLE");
    } else {
      System.out.println(m + " " + M);
    }
  }
}
