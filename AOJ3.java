import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * b + " " + 2 * (a + b));
	}
}




import java.lang. *;
import java.util. *;
import java.io. *;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b + " " + 2*(a+b));
    } 
}























public class Main{
   public static int menseki(int a, int b) {
       int men = a*b;
       return men;
   }
   
   public static int mawari(int a, int b) {
       int mawa = a*2 + b*2;
       return mawa;
   }
   
   public static void main(String[] args) {
       int men = menseki(3, 5);
       int mawa = mawari(3, 5);
       System.out.println(men + "　　" + mawa);
   }
}


