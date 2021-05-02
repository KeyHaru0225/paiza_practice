// ABC35 A.テレビ

// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int w = Integer.parseInt(chr[0]);
			int h = Integer.parseInt(chr[1]);
          
            if(w % 4 == 0 && h % 3 == 0){
            	System.out.println("4:3");
            } else {
                System.out.println("16:9");
            }
          
        }
    }
}

// 85ms/32,500KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int w = Integer.parseInt(chr[0]);
			int h = Integer.parseInt(chr[1]);
          
            if(w % 16 == 0 && h % 9 == 0){
            	System.out.println("16:9");
            } else {
                System.out.println("4:3");
            }
          
        }
    }
}


// 1 121ms/35,648KB
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();

        if (w % 16 == 0 && h % 9 == 0) {
            System.out.println("16:9");
        } else {
            System.out.println("4:3");
        }
    }
}


// 2 122ms/35,780KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		if (w / 4 * 3 == h || w / 3 * 4 == h) {
			System.out.println("4:3");
		} else {
			System.out.println("16:9");
		}
	}
}