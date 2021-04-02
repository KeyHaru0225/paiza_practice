// ABC138 A.Red or Not

// CE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)  throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.perseInt(chr[0]);
            String s = chr[1];
          
            if(a>=3200){
            	System.out.println(s);
            } else {
            	System.out.println("red");
            }
          
        }
    }
}


/*
./Main.java:9: error: cannot find symbol
        FastScanner fs = new FastScanner();
        ^
  symbol:   class FastScanner
  location: class Main
./Main.java:9: error: cannot find symbol
        FastScanner fs = new FastScanner();
                             ^
  symbol:   class FastScanner
  location: class Main
./Main.java:15: error: cannot find symbol
            int a = Integer.perseInt(chr[0]);
                           ^
  symbol:   method perseInt(String)
  location: class Integer
3 errors
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args)  throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { 
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
          
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.perseInt(chr[0]);
            String s = fs.next();
          
            if(a>=3200){
            	System.out.println(s);
            } else {
            	System.out.println("red");
            }
          
        }
    }
}


// 誰かの答え
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        String s = sc.next();
 
        if(a >= 3200){
            System.out.println(s);
        }else{
            System.out.println("red");
        }
    }
}