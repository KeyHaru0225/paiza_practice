// ABC171 A.αlphabet

//コンパイルエラー
import java.util.Scanner;
import java.lang.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String α = sc.next();
      
        if(α.toLowerCase.matches("[a-z]")){
        	System.out.println("a");
        } else if(α.toUpperCase.matches("[A-Z]")){
        	System.out.println("A");
        } else {
        	System.out.println("");
        }

    }
}

//これがやりたかったんや
import java.util.Scanner;
import java.util.regex.Pattern;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
 
        if(Pattern.matches("^[A-Z]+$", str)) {
            System.out.println("A");
        }
        if(Pattern.matches("^[a-z]+$", str)) {
            System.out.println("a");
        }
    }
}


//誰かの答え1
import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        char x=inp.charAt(0);
        if(x >= 'a') {
            System.out.println('a');
        }
        else {
            System.out.println('A');
        }
 
    }
}