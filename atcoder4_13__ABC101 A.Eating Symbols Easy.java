// ABC101 A.Eating Symbols Easy


// WA
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      
        String str = sc.next();
        String s[] = str.split(" ");
        int count = 0;
      
        for(int i = 0; i<s.length; i++){
        	if(s[i].equals("+")){
            	count ++;
            } else if(s[i].equals("-")){
            	count --;
            } else {
            	System.out.println("");
            }
        }
      
      System.out.println(count);
      
    }
}

// 110ms/35,548KB
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      
        String str = sc.next();
        String[] s = str.split("");  // " "だとREになった注意
        int count = 0;
      
        for(int i = 0; i<str.length(); i++){
        	if(s[i].equals("+")){
            	count += 1;
            } else {
            	count -= 1;
            }
        }
      
      System.out.println(count);
      
    }
}



// 誰1 112ms/35,392KB
import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int i=0;
		String s = sc.next();
		for(char ch: s.toCharArray()) {
			if(ch=='+') i++;
			else i--;
		}
		System.out.println(i);
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}
  
}


// 誰2 113ms/35,648KB
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        String operators = sc.next();
        String[] array = operators.split("");

        for (int i = 0; i < operators.length(); i++) {
            if (array[i].equals("+")) {
                num += 1;
            } else {
                num -= 1;
            }
        }
        System.out.println(num);
    }
}
