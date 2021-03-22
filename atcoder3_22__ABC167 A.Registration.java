//　ABC167 A.Registration

//実行時エラー
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String str = br.readLine();
          
            String chr[] = str.split(" ");
            String s = chr[0];
            String t = chr[1];
          
           if(t.endsWith("[a-z]")){
           		System.out.println("Yes");
           } else {
             	System.out.println("No");
           }
        
        }
    }
}


//正解が5、不正解6
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
      
            String s = sc.next();
            String t = sc.next();
          
           if(s.endsWith("[a-z]") == t.endsWith("[a-z]")){
           		System.out.println("Yes");
           } else {
             	System.out.println("No");
           }
        
        
    }
}


//
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
      
            String s = sc.next();
            String t = s + sc.next();
          
           if(s.endsWith("[a-z]") == t.endsWith("[a-z]")){
           		System.out.println("Yes");
           } else {
             	System.out.println("No");
           }
        
        
    }
}


//正解が6、不正解が5
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
      
            String s = sc.next();
            String t = s + sc.next();
          
      
           if(t == s + "[a-z]{1}"){
           		System.out.println("Yes");
           } else {
             	System.out.println("No");
           }
        
        
    }
}


//誰かの答え1
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
 
		if(s.equals(t.substring(0, t.length() - 1))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

//誰かの答え2
import java.util.Scanner;
 
public class Main {
//throws Exception入れると速い
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
//sc.close();入れると速い
		sc.close();
 
		if (t.startsWith(s)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}