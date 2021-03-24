// ABC157 A.Duplex Printing

//正解
//String系とInt系で書き方が違う事を覚えよう自分
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	int n = Integer.parseInt(br.readLine());

            System.out.println(n/2 + n%2);
        }
    }
}


//誰かの答え
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
 
        if(a%2==0){
            System.out.println(a/2);
        }else{
            System.out.println(a/2 + 1);
        }
        
    }
}