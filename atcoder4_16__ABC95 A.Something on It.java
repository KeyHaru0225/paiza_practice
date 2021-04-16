// ABC95 A.Something on It


//
import java.util.Scanner;

public class Main{
	public static void main(String agrsg[]){
    	Scanner sc = new Scanner(System.in);
      
        String str = sc.next("");
        String[] s = str.split("");
        int count = 700;
      
        for(int i=0; i<str.length(); i++){
        	if(s[i].equals("o")){
            	count += 200; 
            } else {
            	count ;
            }
        }
      
      System.out.println(count);
      
        
    }
}


// RE
import java.util.Scanner;

public class Main{
	public static void main(String agrsg[]){
    	Scanner sc = new Scanner(System.in);
      
        String str = sc.next("");
        String[] s = str.split("");
        int count = 700;
      
        for(int i=0; i<str.length(); i++){
        	if(s[i].equals("o")){
            	count += 100; 
            } else {
            	count = count;
            } 
        }
      
      System.out.println(count);
      
        
    }
}


// 誰1 110ms/35,488KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		
		int r = 0;
		for (int i=0; i<s.length; i++) {
			if (s[i] == 'o') {
				r++;
			}
		}
		
		r *= 100;
		
		System.out.println(r + 700);
	}
}

// 誰2 117ms/35,628KB
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        int ram = 700;
        int top = 100;
        int result = 0;
        String[] list = S.split("");

        result += ram;
        for (String a:list) {
            if("o".equals(a)) {
                result += top;
            }
        }

        System.out.println(result);
    }

}


// 誰3 79ms/32,460KB
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			char[] s=br.readLine().toCharArray();
			int price=700;
			for(int i=0;i<s.length;i++) {
				if(s[i]=='o')price+=100;
			}
			System.out.println(price);
		}
	}
}