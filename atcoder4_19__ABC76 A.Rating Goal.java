// ABC76 A.Rating Goal

// RE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int r = Integer.parseInt(chr[0]);
            int g = Integer.parseInt(chr[1]);
          
            System.out.println(2*g - r);
          
        }
    }
}

// 誰1 98ms/27,036KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		sc.close();

		System.out.println(g * 2 - r);
	}
}
