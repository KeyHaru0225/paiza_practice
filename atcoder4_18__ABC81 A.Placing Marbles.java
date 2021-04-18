// ABC81 A.Placing Marbles

// WA
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        char[] s = sc.next().toCharArray();
        int count = 0;
      
        for(int i=0; i<s.length; i++){
        	if(s[i] == 1){
            	count ++;
            } 
        }
      
      System.out.println(count);
    }
}

//　誰の改良版　115ms/35,504KB
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int ans = 0;
    
    for(int i=0; i<3; i++){
    	if(str.charAt(i) == '1'){
        	ans ++;
        }
    }
    

    System.out.println(ans);
    sc.close();
  }
}


// 誰　118ms/35,740KB
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int ans = 0;
    if (str.charAt(0) == '1') {
      ans++;
    }

    if (str.charAt(1) == '1') {
      ans++;
    }

    if (str.charAt(2) == '1') {
      ans++;
    }

    System.out.println(ans);
    sc.close();
  }
}