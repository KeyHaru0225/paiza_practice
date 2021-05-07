// ABC10 A.ハンドルネーム


// CE　エラーコード読んでもイミフだった
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in) {
        	String s = sc.next();
          
            System.out.println(s + "pp");
          
        }
    }
}

// 1 212ms/39,092KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String ans = s + "pp";
		System.out.println(ans);
	}
}

// 2 139ms/38,384KB
import java.util.*;

class Main{

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println(scn.next() + "pp");
	}

}