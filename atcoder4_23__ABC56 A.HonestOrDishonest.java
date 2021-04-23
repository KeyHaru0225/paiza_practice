// ABC56 A.HonestOrDishonest

// 114ms/35,348KB
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String a = sc.next();
        String b = sc.next();
      
        if(a.equals("D") && b.equals("D") || a.equals("H") && b.equals("H")) {
			System.out.println("H");
		} else {
			System.out.println("D");
		}
    }
}

// 1 97ms/26,992KB
import java . util.Scanner;
public class Main {
    public static void main(String[] args) {
   Scanner input = new Scanner (System .in);
        String a = input.next();
         String b = input.next();
if (a.charAt(0)==b.charAt(0))
            System.out.println('H');
       else
        System.out.println('D');  
        }
}