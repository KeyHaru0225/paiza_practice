// ABC183 A.ReLU

//正解した。簡単でわらった。
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        int x  = sc.nextInt();
      
        if(x>=0){
        	System.out.println(x);
        } else {
        	System.out.println("0");
        }
    }
}


//誰かの答え
import java.util.Scanner;
 
public class Main {
 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        System.out.println((x < 0 ? 0 : x));
    }
}