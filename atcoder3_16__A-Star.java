// ABC192 A.Star

// 正解
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      
    int X = sc.nextInt();
    
    int amari = X%100;
    int ans = 100-amari;
    
    System.out.println(ans);
      
    }
}


//誰かの答え
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = x / 100;
        int b = x - 100 * a;
        int result = 100 - b;
        System.out.println(result);
    }
}