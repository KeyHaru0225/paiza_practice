// ABC184 A.Determinant

//頭全然回らん
//と思ったらまさかの正解wwwwwww
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        int[][] A = new int[2][2];
        
        A[1][0] = sc.nextInt();
        A[1][1] = sc.nextInt();
        A[0][0] = sc.nextInt();
        A[0][1] = sc.nextInt();
         
        System.out.println(A[1][0]*A[0][1] - A[1][1]*A[0][0]);
    
    }
}


//誰かの答え
//二次元配列使わんでよくね？って気づいた
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println(a*d-c*b);
 
	}
}