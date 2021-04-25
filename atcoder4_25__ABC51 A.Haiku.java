// ABC51 A.Haiku

// CE はぇ～わからんのじゃ～＾
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String[] s = new array[19];
      
        if(s.substring(6) == (",") && s.substring(14) == (",")) {
        	s.charAt(6) = " ";
            s.charAt(14) = " ";
        }
        System.out.println(s);
    }
}

// 1 143ms/38,156KB
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

// 2 116ms/35,648KB
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inString = scan.nextLine();
        
        inString = inString.replace(",", " ");
        System.out.println(inString);
        
        scan.close();
  	}
}

// 3 112ms/35,568KB
import java.util.*;
 
public class Main{
 
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.replace(","," "));
	}
 
}