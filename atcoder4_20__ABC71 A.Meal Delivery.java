// ABC71 A.Meal Delivery

// 85ms/32,556KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int x = Integer.parseInt(chr[0]);
            int a = Integer.parseInt(chr[1]);
            int b = Integer.parseInt(chr[2]);
          
            int xa = Math.abs(x-a);
            int xb = Math.abs(x-b);
          
            if(xa > xb){
            	System.out.println("B");
            } else {
            	System.out.println("A");
            }
        
        }
    }
}

// 誰　115ms/35,604KB
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), a = scan.nextInt(), b = scan.nextInt();
        if (Math.abs(x - a) < Math.abs(x - b)) System.out.println("A");
        else System.out.println("B");
    }
}

