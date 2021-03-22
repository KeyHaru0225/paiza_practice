//ABC168 A.∴(Therefore)

//コンパイルエラー
import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String n = new sc.nextLine();
      　StringBuilder rev = new StringBuilder(n);
        n =rev.reverse().toString();
      
        if(n.charAt(0) == "2" || n.charAt(0) =="4" || n.charAt(0) =="5" || n.charAt(0) =="7" || n.charAt(0) =="9"){
       		System.out.println("hon");
        } else if (n.charAt(0) == "0" || n.charAt(0) =="1" || n.charAt(0) =="6" || n.charAt(0) =="8"){
        	System.out.println("pon");
        } else {
        	System.out.println("bon");
        }
                  
    }
}




/*
./Main.java:7: error: package sc does not exist
        String n = new sc.nextLine();
                         ^
1 error
*/
//↑String n = sc.nextLine();「new」外したら正解。むしろ何で入れたんや私…
//自力正解で今月一番嬉しいかもしれん。めっちゃAPI駆使したし
import java.util.*;
import java.io.*;
import java.lang.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String n = sc.nextLine();
        StringBuilder rev = new StringBuilder(n);
        n = rev.reverse().toString();
      
        if(n.charAt(0) == '2' || n.charAt(0) == '4' || n.charAt(0) == '5' || n.charAt(0) == '7' || n.charAt(0) =='9'){
       		System.out.println("hon");
        } else if (n.charAt(0) == '0' || n.charAt(0) =='1' || n.charAt(0) =='6' || n.charAt(0) =='8'){
        	System.out.println("pon");
        } else {
        	System.out.println("bon");
        }
                  
    }
}


//誰かの答え
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
 
		n %= 10;
 
		switch (n) {
			case 2:
			case 4:
			case 5:
			case 7:
			case 9:
				System.out.println("hon");
				break;
 
			case 0:
			case 1:
			case 6:
			case 8:
				System.out.println("pon");
				break;
 
			case 3:
				System.out.println("bon");
				break;
		}
	}
}