// ABC102 A.Happy Birthday!


// 79ms/32,492KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" "); // この場合は「" "」にしないとRE
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
          
            if(a > 8 || b > 8){
            	System.out.println(":( ");
            } else {
            	System.out.println("Yay!");
            }
          
        }
    }
}

// 誰　110ms/27,032KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		if(a<=8 && b<=8)
			System.out.println("Yay!");
		else
			System.out.println(":(");
		
		input.close();
	}
}