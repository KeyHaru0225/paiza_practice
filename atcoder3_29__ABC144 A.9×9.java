// ABC144 A.9×9

//不正解
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
       		String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
          
            if((String)a.length() == 1 && (String)b.length() == 1){
            	System.out.println(a*b);
            } else {
            	System.out.println(-1);
            }
        
        }
    }
}


//正解したwwwまじかwwwww
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
       		String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
          
            if(Math.abs(a) <= 9 && Math.abs(b) <= 9){
            	System.out.println(a*b);
            } else {
            	System.out.println(-1);
            }
        
        }
    }
}


// 誰かの答え
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt(); 
		int b =sc.nextInt(); 
 
		if(a<=9 && b<=9) {
		System.out.println(a*b);
		}else {
			System.out.println(-1);
		}
		
		}
}