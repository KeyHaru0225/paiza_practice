//ABC40 A.赤赤赤赤青

// WA
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
			int x = Integer.parseInt(chr[1]);
          
            if(n%x != 0){
            	System.out.println(n%x);
            } else {
            	System.out.println(n/x -1);
            }
          
        }
    }
}

// 79ms/32,648KB
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
			int x = Integer.parseInt(chr[1]);
          
            System.out.println(Math.min(n-x,x-1));
          
        }
    }
}

// 1 123ms/35,684KB
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(Math.min(n-x,x-1));
    }

}