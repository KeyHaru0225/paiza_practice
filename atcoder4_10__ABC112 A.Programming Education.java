// ABC112 A.Programming Education


// RE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);
          
            if(n == 1){
            	System.out.println("Hello World");
            } else if(n == 2){
            	System.out.println(a + b);
            } else {
            	System.out.println("");
            }
          
        }
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 

// RE たぶん順番がおかしいんやろうな
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);
          
            if(n == 1){
            	System.out.println("Hello World");
            } 
            
            if(n == 2){
            	System.out.println(a + b);
            }
          
        }
    }
}


// 誰かの答え　160ms/35,568KB
import java.util.Scanner;

class Main{
 public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   int n = scan.nextInt();
   
   if(n == 1){
     System.out.print("Hello World");
   } else {
    int a = scan.nextInt();
    int b = scan.nextInt();
 	System.out.print(a + b);  
   }
 }
}