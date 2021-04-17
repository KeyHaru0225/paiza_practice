// ABC85 A.Already 2018

// CE  文字列わからん
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
      
        char[3] = s.replace(7,8);
      
        System.out.println(s);
        }
    }
}


// 誰1 114ms/36,080KB
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        String ans = S.substring(4);
        
        System.out.println("2018" + ans);
        
    }
}

// 誰2 119ms/35,572KB
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s;
    
    s = sc.nextLine();
    
    s = s.replace("2017","2018");
    
    System.out.println(s);
  }
}