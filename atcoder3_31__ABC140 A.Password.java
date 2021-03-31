// ABC140 A.Password

// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
          
            System.out.println(Math.pow(n,3));
        
        }
    }
}

// 正解 75ms/32,364KB
//Math.pow()はdouble型で返却されるみたいだから、不正解になってたみたい
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
          
            System.out.println((int)Math.pow(n,3));
        
        }
    }
}

// 誰かの答え 125ms/35,380KB
import java.util.*;
 
public class Main{
	public static void main(String[] args)throws
	Exception{
		Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        
        if(n >= 1 && n <= 9){
            System.out.println(n * n * n);
        }
    }
}
          
 