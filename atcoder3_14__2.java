// 問題名　A-Health M Death

import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int H = sc.nextInt();
      
      if(H%M == 0){
      	System.out.println("Yes");
      } else{
        System.out.println("No");
      }
    
    }
}






//問題名 B-Many Oranges

//わからんかった
import java.util.Scanner;
import java.math.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        int A = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt() * 1000;
        
        int max = W/A;
        int min = (int)Math.ceil((double)W/B);
      
      　int diff = B-A; //ここでエラーが出る
        double rem = W%A;
        int quo = W/A;
        if(Math.ceil(rem/quo) > diff) {
        	System.out.println("UNSATISFIABLE");
            return;
        } 
        System.out.println(min + " " + max);
    }
}

/*
./Main.java:15: error: illegal character: '\u3000'
      　int diff = B-A;
      ^
1 error
*/



//誰かの答え
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
 
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt() * 1000;
 
        int max = w / a;
        int min = (int)Math.ceil((double) w / b);
 
        // ぴったりにできるか判定
        int usable = b - a; 
        double gap = w % a;
        int sho = w / a;
        if (Math.ceil(gap / sho) > usable) {
            System.out.println("UNSATISFIABLE");
            return;
        }
 
        System.out.println(min + " " + max);
    }
}


//誰かの答え2
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt()*1000;
 
        int min = 1_000_010;
        int max = -1;
        for (int i = 1; i <= 1_000_000; i++) {
            if (A*i <= W && W <= B*i) {
                min = Math.min(min,i);
                max = Math.max(max,i);
            }
        }
 
        if (max == -1) {
            System.out.println("UNSATISFIABLE");
        } else {
            System.out.println(min+" "+max);
        }
    }
}

//誰かの答え3
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int m = 1000000000;
        int M = 0;
        for(int n=1;n<=1000000;n++){
          if(A*n<=1000*W && 1000*W<=B*n){
             m=Math.min(m,n);
             M=Math.max(M,n);
          }
        }
        if(M==0){
          System.out.println("UNSATISFIABLE");
        }else{
          System.out.println(m+" "+M);
        }
    }
}