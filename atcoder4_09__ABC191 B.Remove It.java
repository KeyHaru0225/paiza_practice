// ABC191 B.Remove It

//　問題文の意味は分かった



// 誰かの答え1 894ms/59,508KB
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      if (x != a[i]) {
        System.out.println(a[i]);
      }
    }
  }
}


// 誰かの答え2 500ms/60,476KB
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
		int X = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < N; i++ ) {
			int target = sc.nextInt();
			if(target == X) {

			} else {
				sb.append(String.valueOf(target));
				sb.append(" ");
			}
		}

		if(sb.length() == 0) {
			System.out.println("");
		} else {
			System.out.println(sb.toString().substring(0, sb.lastIndexOf(" ")));
		}
	}
}


// 誰かの答え3 501ms/60,496KB
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			if(num!=x) {
				sb.append(num+" ");
			}
		}
		System.out.println(sb);

	}

}
