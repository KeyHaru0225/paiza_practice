// ABC176 A.Takoyaki

//正解
//変数宣言せずに、直接System～に書いた方が実行時間が短くなる
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
      
    int ans = n/x*t;

    if(n%x == 0){
    	System.out.println(ans);
    } else {
        System.out.println(ans + t);
    }
      
  }
}


//誰かの答え
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
 
        if(n%x!=0){
            System.out.println(n/x*t+t);
        }else{
            System.out.println(n/x*t);
        }
        
    }
}