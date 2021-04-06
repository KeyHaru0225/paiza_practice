// ABC128 A.Apple Pie


// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]) * 3;
            int p = Integer.parseInt(chr[1]);
          
            int P_app = p/2; //pから作れるPieの数
     
            int ans = (a+(p%2)) + P_app;
          
            System.out.println(ans);
        }
    }
}


// 正解　76ms/32,692KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]) * 3;
            int p = Integer.parseInt(chr[1]);
          
            int ap = (a+(p%2))/2;         　
            int ans = ap + (p/2);
          
            System.out.println(ans);
        }
    }
}


// 誰かの答え　113ms/35,740KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int p = sc.nextInt();

		int max = (a * 3 + p) / 2;
		System.out.println(max);
	}
}