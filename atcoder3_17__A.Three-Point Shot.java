//ABC188 A.Three-Point Shot

//正解した！！　めちゃくちゃ嬉しい！！;;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        int x = sc.nextInt();
        int y = sc.nextInt();
      
      if(x>=y){
      	y += 3;
        if(y>x){
        	System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
      } else if(y>=x){
        x += 3;
        if(x>y){
        	System.out.println("Yes");
        } else {
            System.out.println("No");
        }
      } else{
            System.out.println("");
      }
      
    }
}



//誰かの答え
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
 
		if(x > y) {
			if(x-1 == y || x-2 == y) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
 
		if(x < y) {
			if(y-1 == x || y-2 == x) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}