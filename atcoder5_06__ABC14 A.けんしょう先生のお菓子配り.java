// ABC14 A.けんしょう先生のお菓子配り

//　RE  2変形してやってもREだったいみふ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
          
            int num = (a + b) % b;
          
            if(num == 0) {
            	System.out.println(0);
            } else {
            	System.out.println(b - num);
            }
          
        }
    }
}


// 1 314ms/35,688KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i = 0;
		
		while(true) {
			if((a + i) % b == 0) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}

// 2 126ms/35,632KB
import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((a%b==0)? 0:b-a%b);
	}

}
