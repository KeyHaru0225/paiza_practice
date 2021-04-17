// ABC89 A.Grouping 2


// 79ms/32,240KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
          
            System.out.println(n/3);
          
        }
    }
}


// 誰 98ms/27,108KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();  // close()使ってるから高速なんかなあ

		System.out.println(n / 3);
	}
}
