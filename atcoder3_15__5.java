// 問題 A-I Scream

//Wrong answer
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = A+B;
      
        if(M >= 15 && B >= 8){
          System.out.println("1");
        }
        if(M >= 10 && B >= 3){
          System.out.println("2");
        }
        if(M >= 3){
          System.out.println("3");
        } else {
          System.out.println("4");
        }
        
    }
}


//正解したやつ
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = A+B;
        int ans = 0;
      
        if(M >= 15 && B >= 8){
          ans = 1;
        } else if (M >= 10 && B >= 3) {
          ans = 2;
        } else if (M >= 3) {
          ans = 3;
        } else {
          ans = 4;
        }
       
      System.out.println(ans);
        
    }
}

//誰かの答え
import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;
    if(a + b >= 15 && b >= 8){
      ans = 1;
    }
    else if(a + b >= 10 && b >= 3){
      ans = 2;
    }
    else if(a + b >= 3){
      ans = 3;
    }
    else{
      ans = 4;
    }
    System.out.println(ans);
  }
}