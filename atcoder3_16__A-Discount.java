// ABCC193 A-Discount

//不正解だった…
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
      
        double x = (A-B)/A;
        double ans = x*100;
      
        System.out.println(ans);
   
    }
}

//double型にしたら正解になった
//double x =～　のところで↑だと型が合ってなかったから不正解になったのかも
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
      
        double x = (A-B)/A;
        double ans = x*100;
      
        System.out.println(ans);
   
    }
}

//誰かの答え
import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    b = a - b;
    b *= 100;
    System.out.println(b / a);
  }
}