// ABC179 A.Plural Form

//わからん。私こういう文字数える系？苦手夜話
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args){
    	BufferedReader br = new BufferedReader(new intputStreamReader(System.in));
        
        String s = br.readLine();
        char[] c = s.next().toCharArray();
      　
        for(i=0; i<c.length; i++){
        	
        }
    }
}



//誰かの答え1
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
 
		if(s.endsWith("s")) {
			s = s + "es";
		} else {
			s = s + "s";
		}
 
		System.out.println(s);
	}
}

//誰かの答え2
//実行速度めっちゃ速い
import java.util.Scanner;
import java.io.PrintWriter;
 
public class Main{
	
	static Scanner sc;
	static PrintWriter out;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		if(s.charAt(n-1)=='s')
			s+="es";
		else
			s+="s";
		System.out.println(s);
	}
 
}