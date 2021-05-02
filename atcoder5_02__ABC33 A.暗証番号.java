// ABC33 A.暗証番号

// WA 5回ぐらいやって全部WA orz
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String n = sc.next();
        
        if(n.substring(0,1).equals(n.substring(1,2)) && n.substring(2,3).equals(n.substring(0,3)))  {
        	System.out.println("SAME");
        } else {
        	System.out.println("DIFFERENT");
        }
      
    }
}

// 1 114ms/35,680KB
import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    if(c[0]==c[1] && c[1]==c[2] && c[2]==c[3]) System.out.println("SAME");
    else System.out.println("DIFFERENT");
  }
}


// 2 115ms/35,692KB
import java.util.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] A = sc.next().toCharArray();
        String res = "DIFFERENT";
        if(A[0] == A[1] && A[0] == A[2] && A[0] == A[3]){
            res = "SAME";
        }
        System.out.println(res);
        sc.close();
    }
}