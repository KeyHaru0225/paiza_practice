// ABC133 A.T or T

// 正解　86ms/32,576KB
// 下の人の答えのMatn.min使ったら、80ms/32,588KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String args[]) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
            int a = Integer.parseInt(chr[1]);
            int b = Integer.parseInt(chr[2]);
          
            if(n*a <= b){
            	System.out.println(n*a);
            } else {
            	System.out.println(b);
            }
            
        }
    }
}


// 誰かの答え　115ms/35,736KB
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
 
		int min = Math.min(a * n, b);
		System.out.println(min);
	}
}
