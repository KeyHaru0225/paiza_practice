// ABC163 A.Circle Pond

//正解した…えっなんでって感じ。ﾅ､ﾅﾝﾀﾞｯﾃｰ!!
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int r = Integer.parseInt(chr[0]);
          
            System.out.println((double)2 * Math.PI * r);
        }
    }
}


//誰かの答え
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
 
        double circumference = (r * 2) * 3.14;
        System.out.println(circumference);
    }
}