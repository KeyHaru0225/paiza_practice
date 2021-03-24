// ABC161 A.ABC Swap

//正解！
//変数値の交換は、一時的に変数を用意して避難させないと、元の値が消えてしまうところがポイント…のはず
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
      
        String in = br.readLine();
      
        String chr[] = in.split(" ");
        int a = Integer.parseInt(chr[0]);
        int b = Integer.parseInt(chr[1]);
        int c = Integer.parseInt(chr[2]);
        
        int w = a;
        a = b;
        b = w;
      
        int x = a;
        a = c;
        c = x;
      
        System.out.println(a + " " + b + " " + c);
        
        }
    }
}


//誰かの答え
//私が142ms/37,068KBで、この人は88ms/26,904KB
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = 0;
        x = a;
        a = b;
        b = x;
 
        x = a;
        a = c;
        c = x;
        System.out.println(a+" "+b+" "+c);   
    }
}