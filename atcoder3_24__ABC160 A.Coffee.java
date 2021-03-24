// ABC160 A.Coffee

//コンパイルエラー
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String s = br.readLine();
            char[] c = s.next().toCharArray();

            if(s.substring(2,3) == c.equals(c[2]) && s.substring(2,3) == c.equals(c[3]) 
              && s.substring(4,5) == c.equals(c[4]) && s.substring(4,5) == c.equals(c[5])) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
            
        }
    }
}


//コンパイルエラー2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String s = br.readLine();
            char[] c = s.toCharArray();

            if(s.substring(2,3) == c[2] && s.substring(2,3) == c[3] 
              && s.substring(4,5) == c[4] && s.substring(4,5) == c[5]) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
            
        }
    }
}


//正解7、不正解6
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String s = br.readLine();
 
            if(s.substring(2) == s.substring(3) && s.substring(4) == s.substring(5)) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
            
        }
    }
}



//正解7、不正解6
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String s = br.readLine();
 
            if(s.toLowerCase().substring(2) == s.toLowerCase().substring(3) 
               && s.toLowerCase().substring(4) == s.toLowerCase().substring(5)) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
            
        }
    }
}


//問題文読み間違え…
//下の人の答え参考にしたら正解
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String s = br.readLine();
 
            if(s.substring(2,3).equals(s.substring(3,4)) && s.substring(4,5).equals(s.substring(5,6))) {
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
            
        }
    }
}









//誰かの答え
import java.util.*;
 
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		if(s.substring(2,3).equals(s.substring(3,4)) && s.substring(4,5).equals(s.substring(5,6))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}