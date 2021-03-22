// ABC166 A.A?C

//不正解
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String s = br.readLine();
          
            if(s == "ABC") {
            	System.out.println("ARC");
            } else if(s == "ARC") {
            	System.out.println("ABC");
            } else {
            	System.out.println("");
            }
          
          
        }
    }
}


//正解！　しかも実行速度他の人よりもめっちゃ速い！　すばらし！！
//文字列の判定は「.equals()」
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String s = br.readLine();
          
            if(s.equals("ABC")) {
            	System.out.println("ARC");
            } else if(s.equals("ARC")) {
            	System.out.println("ABC");
            } else {
            	System.out.println("");
            }
          
          
        }
    }
}

//誰かの答え
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String n = sc.next();
 
        if(n. equals("ABC")){
            System.out.println("ARC"); 
        }else{
            System.out.println("ABC");
        }
    }
}
