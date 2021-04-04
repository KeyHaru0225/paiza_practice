// ABC129 A.Airplane

// AC*2 WA*10 草
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int p = Integer.parseInt(chr[0]);
			int q = Integer.parseInt(chr[1]);
			int r = Integer.parseInt(chr[2]);
          
            if(p != q && q != r && p+q < r){
            	System.out.println(p+q);
            } else if (p != q && q != r && p+q == r){
            	System.out.println(p+q);
            } else {
            	System.out.println("");
            }
          
           
        }
    }
}


// 下の人の答え参考にしたら正解　79ms/32,460KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int p = Integer.parseInt(chr[0]);
			int q = Integer.parseInt(chr[1]);
			int r = Integer.parseInt(chr[2]);
          
            		int min = Math.min(p + q, Math.min(p + r, q + r));
		    	System.out.println(min);
          
        }
    }
}


// 誰かの答え1 114ms/35,580KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int min = Math.min(p + q, Math.min(p + r, q + r));
		System.out.println(min);
	}
}