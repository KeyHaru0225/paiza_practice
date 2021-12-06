// ABC203 A.Chinchirorin

// WA 76ms/32,756KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
    	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
          String chr[] = in.split(" ");
          int a = Integer.parseInt(chr[0]);
          int b = Integer.parseInt(chr[1]);
          int c = Integer.parseInt(chr[2]);
          
          if (a != b && b != c) {
          	System.out.println(0);
          } else {
          	System.out.println(1);
          }
          
        }
    }
}



// 76ms/32,548KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
    	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
          String chr[] = in.split(" ");
          int a = Integer.parseInt(chr[0]);
          int b = Integer.parseInt(chr[1]);
          int c = Integer.parseInt(chr[2]);
          
          if(a == b){
            System.out.println(c);
          }else if(b == c){
            System.out.println(a);
          }else if(a == c){
            System.out.println(b);
          }else{
            System.out.println(0);
          }
          
        }
    }
}






// 誰　110ms/35,696KB
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a == b){
      System.out.println(c);
    }else if(b == c){
      System.out.println(a);
    }else if(a == c){
      System.out.println(b);
    }else{
      System.out.println(0);
    }
  }
}

