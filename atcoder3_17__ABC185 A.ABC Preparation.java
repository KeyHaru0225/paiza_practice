// ABC185 A.ABC Preparation

//間違った
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        int A_1 = sc.nextInt();
        int A_2 = sc.nextInt();
        int A_3 = sc.nextInt();
        int A_4 = sc.nextInt();

        System.out.println(Math.min(A_1,A_2,A_3,A_4));
      
    }
}

//ヒント(検索しながら)見ながらやった
//間違った→intいらんみたい。それでコンパイルエラー。
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        int A[] = new int[4];
        int A[0] = sc.nextInt();
        int A[1] = sc.nextInt();
        int A[2] = sc.nextInt();
        int A[3] = sc.nextInt();
      
        int min = A[0];
        
        for(int i=1; i<A.length; i++){
        	int k = A[i];
            if(k < min) {
            	min = k;
            }
        }
      
        System.out.println(min);

    }
}

//正解したコード
import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        int[] A = new int[4];
　　　　//int A[0]とかにしたらコンパイルエラー
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        A[3] = sc.nextInt();
      
        int min = A[0];
        
        for(int i=1; i<A.length; i++){
        	int k = A[i];
            if(k < min) {
            	min = k;
            }
        }
      
        System.out.println(min);
 
    }
}


//他の人の答え
import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        for (int i = 0; i < 4; ++i) {
            int a = sc.nextInt();
            ans = (i == 0 ? a : Math.min(ans, a));
        }
        sc.close();
        System.out.println(ans);
    }
}