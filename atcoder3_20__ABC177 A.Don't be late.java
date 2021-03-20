// ABC177 A.Don't be late


//不正解
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();
    
    int ans = d/s; 
      
    if(t >= ans) {
    	System.out.println("Yes");
    } else {
        System.out.println("No");
    }
      
  }
}


//正解した
//double型はメモリ食う
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      
    double d = sc.nextDouble();
    double t = sc.nextDouble();
    double s = sc.nextDouble();
    
    double a = d/s; 
    double ans = Math.ceil(a);
      
    if(t >= ans) {
    	System.out.println("Yes");
    } else {
        System.out.println("No");
    }
      
  }
}


//誰かの答え
//私より速いし、メモリも食ってない
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
 
        if(D<=T*S){
            System.out.println("Yes");
        }else{System.out.println("No");}
    }
}
