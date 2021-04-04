// ABC131 A.Security

// CE指摘多すぎて笑った
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        char[] s = sc.next().charArray();

        if(char[0] == char[1] && char[2] == char[3]){
        	System.out.println("Bad");
        } else if(char[0] == char[1] && char[1] == char[2] && char[2] == char[3]) {
        	System.out.println("Bad");
        } else if(char[0] == char[1] && char[1] == char[2]) {
        	System.out.println("Bad");
        } else if(char[1] == char[2] && char[2] == char[3]) {
        	System.out.println("Bad");
        } else if(char[1] == char[2]) {
        	System.out.println("Bad");
        } else {
        	System.out.println("Good");
        }
      
    }
}


//　誰かの答え1 145ms/35,692KB
import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char[]chars= s.toCharArray();
		int count = 0;
		for(int i = 0; i < 3; i++) {
			if(chars[i+1]==chars[i]) {
				count++;
			}
		}
		
		System.out.println((count==0)? "Good":"Bad");
	}

}


// 誰かの答え2 104ms/27,084KB
import java.util.*;
public class Main {
    public static void main(String []args){
    Scanner scan=new Scanner(System.in);  
    String str=scan.next();
    str+=" ";
 
    for (int i=0;i<str.length()-1;i++)
       if (str.charAt(i)==str.charAt(i+1))
          {   System.out.println("Bad");
               System.exit(0);
          }
    
    System.out.println("Good");
   }
}
