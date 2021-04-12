// ABC189 D.Logical Expression


//問題文がいまいちよくわからん


// 誰1 118ms/35,760KB
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 0; i < n; ++i) {
            String s = sc.next();
            if (s.equals("OR"))
                ans += (long) 1 << (long) (i + 1);
        }
        sc.close();
        System.out.println(ans);
    }
}


// 誰2 123ms/35,692KB
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[]arr=new boolean[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next().equals("OR");
		}
		long sol=f(n,arr);
		System.out.println(sol);
	}

	private static long f(int n, boolean[] arr) {
		// TODO Auto-generated method stub
		if(n==0) return 1;
		if(arr[n-1]) {
			return (long) Math.pow(2, n)+f(n-1,arr);
		}else {
			return f(n-1,arr);
		}
	}

}


// 誰3 122ms/35,684KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		long ans = 1;

		for(int i = 0; i < N; i++) {
			String s = input.next();
			if (s.equals("OR")) ans += (1L << (i + 1));
		}
			
		System.out.println(ans);
	}
}


