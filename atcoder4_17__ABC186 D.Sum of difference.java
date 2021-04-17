// ABC186 D.Sum of difference

//　問題文はわかった。ここまでで降参。
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            String[] A = br.readLine().split(" ");
          
          for(int i=0; i<n; i++){
            int a = Integer.parseInt(A[i]);
          }
          
       }
    }
}


//　誰1 567ms/62,568KB
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] ary = new long[N]; //配列 0..(N-1);
        long[] sumAry = new long[N-1];//累積和0..(N-2);
        
        for(int i = 0;i < N; i++){
            ary[i] = Long.parseLong(sc.next());
        }
        Arrays.sort(ary);
        sumAry[0] = ary[0] +ary[1];
        if(N>2){
            for(int i = 1;i <= N-2; i++){
                sumAry[i] = sumAry[i-1] + ary[i+1];
            }
        }
        //デバッグ
      
        
        //配列と累積和を逆から
        long ans = 0;
        for(int i = N-1;i >= 1; i--){
            long tmp = ary[i] * (i+1);
            ans += tmp - sumAry[i-1];
        }
        System.out.println(ans);


        
        sc.close();
    }
}


// 誰2 335ms/62,940KB
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] in = br.readLine().split(" ");
        var A = new long[N];
        for (int n = 0; n < N; n++) {
            A[n] = Long.parseLong(in[n]);
        }

        Arrays.sort(A);
        long ans = 0;
        for (int a = 0; a < N; a++) {
            ans += A[a] * a - A[a] * (N - 1 - a);
        }

        System.out.println(ans);

    }
}