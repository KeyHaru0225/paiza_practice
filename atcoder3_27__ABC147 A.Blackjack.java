// ABC147 A.Blackjack

//正解
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a_1 = Integer.parseInt(chr[0]);
            int a_2 = Integer.parseInt(chr[1]);
            int a_3 = Integer.parseInt(chr[2]);
          
            if(a_1 + a_2 + a_3 >= 22){
            	System.out.println("bust");
            } else {
            	System.out.println("win");
            }
          
          
        }
    }
}


//誰かの答え
//Collaborated with no one
//Written by Adinma Chidumije
import java.util.*;
 
public class Main{
	public static void main(String[] args){
			Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
			
    int x1,x2,x3;
   x1 = sc.nextInt();
   x2 = sc.nextInt();
   x3 = sc.nextInt();
    
   
    if ((x1+x2+x3>=22)) {
        System.out.println("bust");
    } else {
    	System.out.println("win");
    } 	
    sc.close();
		}
}