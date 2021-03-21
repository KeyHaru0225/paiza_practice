// ABC173 A.Payment

//ややこしく考えすぎた…

//コンパイルエラー
import java.io.*;
  
public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(System.in);
        
        int n = Integer.parseInt(br.readLine());
        int x = Integer.ParseInt(br.readLine()) * 1000;
        
        if(n == x){
        	System.out.println("0");
        } else if(x > n && !(x%n == 0)){
        	System.out.println(x%n);
        } else {
          	System.out.println("");
        }
      
    }
}

/*
./Main.java:5: error: incompatible types: InputStream cannot be converted to Reader
    	BufferedReader br = new BufferedReader(System.in);
    	                                             ^
./Main.java:8: error: cannot find symbol
        int x = Integer.ParseInt(br.readLine()) * 1000;
                       ^
  symbol:   method ParseInt(String)
  location: class Integer
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
2 errors
*/



//実行時エラーが出た
import java.io.*;
  
public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine()) * 1000;
        
        if(n == x){
        	System.out.println("0");
        } else if(x > n && !(x%n == 0)){
        	System.out.println(x%n);
        } else {
          	System.out.println("");
        }
      
    }
}


//実行時エラー
import java.util.Scanner;
  
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt() * 1000;
        
        if(n == x){
        	System.out.println("0");
        } else if(x > n && !(x%n == 0)){
        	System.out.println(x%n);
        } else {
          	System.out.println("");
        }
      
    }
}


//実行時エラー
import java.util.Scanner;
  
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        if(n == x){
        	System.out.println("0");
        } else {
          	System.out.println(x%n);
        }
      
    }
}


//実行時エラー
import java.util.Scanner;
  
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        if(n == x){
        	System.out.println("0");
        } else if(x > n && !(x%n == 0) && !(x == 0)){
          	System.out.println(x%n);
        } else {
      		System.out.println("");
        }
    }



//誰かの答え
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int change = 0;
 
        if (n % 1000 == 0) {
            System.out.println(change);
        } else {
            change = 1000 - (n % 1000);
            System.out.println(change);
        }
    }
}
}