// ABC175 A.Rainy Season

//ほんまに文字列わからん
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);
 
			if(n == "r" &&){
            	
            }
		}
	}
}



//誰かの答え
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
 
        if (s.equals("RRR"))
            System.out.println(3);
 
        if (s.equals("SRR") || s.equals("RRS"))
            System.out.println(2);
 
        if (s.equals("SSR") || s.equals("SRS") || s.equals("RSS") || s.equals("RSR"))
            System.out.println(1);
 
        if (s.equals("SSS"))
            System.out.println(0);
    }
}