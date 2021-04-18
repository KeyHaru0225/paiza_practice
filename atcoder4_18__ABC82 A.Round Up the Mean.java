// ABC82 A.Round Up the Mean


// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			double a = Integer.parseInt(chr[0]);
			double b = Integer.parseInt(chr[1]);
          
            double x = (a + b)/2;
          
            System.out.println(Math.ceil(x));
        }
    }
}


// 問題文はきちんと読みましょう　82ms/32,536KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			double a = Integer.parseInt(chr[0]);
			double b = Integer.parseInt(chr[1]);
          
            double x = (double)(a + b)/2;
          
            System.out.println((int)Math.ceil(x));
        }
    }
}

// 誰　122ms/37,260KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println((int)Math.ceil((a+b)/2));
	}
}