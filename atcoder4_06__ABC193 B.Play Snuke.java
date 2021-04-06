// ABC193 B.Play Snuke

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);
          
  /* x-aをしてけばいいことはわかる
  	 それで在庫が0じゃなかったら、p円で買えるってことまではわかったけど、コードがわからん
  */


// 誰かの答え1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      String[] str = new String[N+1];
      for(int j=0; j<N+1; j++){
        str[j] = scan.nextLine();
      }
      int A = 0;
      int P = 0;
      int X = 0;
      int max_P = 1000000000;
      for(int i=0; i<N+1; i++){
        if(i>0){
        String[] e = str[i].split(" ");
        A = Integer.parseInt(e[0]);
        P = Integer.parseInt(e[1]);
        X = Integer.parseInt(e[2]);

        if((A<X)&&(P<max_P)){
          max_P = P;
        }
        } 
      }
      if(max_P == 1000000000){
        max_P = -1;
      }
      System.out.println(max_P);
    }
}


// 誰かの答え2
import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    
    int ans = Integer.MAX_VALUE;
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      int a = Integer.parseInt(S[0]);
      int b = Integer.parseInt(S[1]);
      int c = Integer.parseInt(S[2]);
      if(a < c && b < ans) ans = b;
    }
    if(ans == Integer.MAX_VALUE) ans = -1;
    System.out.println(ans);
  }
}


// 誰かの答え3
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] p = new int[n];
		int[] x = new int[n];
		
		for(int i = 0; i < n; ++i) {
			a[i] = Integer.parseInt(sc.next());
			p[i] = Integer.parseInt(sc.next());
			x[i] = Integer.parseInt(sc.next());
		}
		int ans = 1000000001;
		for(int i = 0; i < n; ++i) {
			if(x[i] > a[i] && ans > p[i]) {
				ans = p[i];
			}
		}
		if(ans == 1000000001) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}
	
}
