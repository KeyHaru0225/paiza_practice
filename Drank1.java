import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        steps(10, 100);
    }
    
    public static void steps (int d,int s) {
      int steps = d * 100000 / s;
      
      if(steps >= 10000) {
        System.out.println("yes");
    } else {
        System.out.println("no");
    }
    
    }
  
    
    
    
}