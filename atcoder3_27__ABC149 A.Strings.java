// ABC149 A.Strings

//不正解
import java.util.Scanner;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
    	Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
     
        System.out.println(sb.append(s).append(t));
               
    }
}


//正解
import java.util.Scanner;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
    	Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
     
        sb.append(t);
        sb.append(s);
      
        System.out.println(sb.toString());
               
    }
}


//誰かの答え
import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		System.out.println(t.concat(s));
	}
}