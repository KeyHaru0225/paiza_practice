// ABC15 A.高橋くんの研修 

//　114ms/35,460KB
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
        String a = sc.next();
        String b = sc.next();
      
        if(a.length() > b.length()) {
        	System.out.println(a);
        } else {
        	System.out.println(b);
        }
          
    }
}