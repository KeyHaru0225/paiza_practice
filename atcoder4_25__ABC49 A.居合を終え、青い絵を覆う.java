// ABC49 A.居合を終え、青い絵を覆う

// 157ms/35,520KB
//　初めて文字列自分で解いたかもしれん…！
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	String c = sc.next();
      
        if(c.equals("a") || c.equals("i") || c.equals("u") || c.equals("e") || c.equals("o")) {
        	System.out.println("vowel");
        } else {
        	System.out.println("consonant");
        }
      
    }
}

// 1 110ms/35,468KB
import java.util.*;

public class Main{
  
	public static void main(String[] args){
      
    	Scanner sc = new Scanner(System.in);
      	char c = sc.next().charAt(0);
      
      	if(c=='a' || c=='i' || c=='u' || c=='e' || c=='o'){
        	System.out.println("vowel");
        }else{
        	System.out.println("consonant");
        }
    }
}

// 2 111ms/35,720KB
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        List<Character> vowels = new ArrayList<>(); //母音
        vowels.add('a'); //あ
        vowels.add('e'); //え
        vowels.add('i'); //い
        vowels.add('o'); //お
        vowels.add('u'); //う

        if (vowels.contains(c)) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}