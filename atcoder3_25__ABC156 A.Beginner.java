// ABC156 A.Beginner

//正解
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
            int r = Integer.parseInt(chr[1]);
          
            if(n>=10){
            	System.out.println(r);
            } else {
            	System.out.println(r + 100*(10-n));
            }
          
        }
    }
}


//誰かの答え
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //参加回数 N
        int R = sc.nextInt(); //表示レーティング R
 
        System.out.println(R + (100 * Math.max(0, 10 - N)));
    }
}