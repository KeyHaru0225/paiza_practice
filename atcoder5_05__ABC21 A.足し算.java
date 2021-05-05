// ABC21 A.足し算

//　簡単なもんだいみたいやのにわからんくなった泣

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
           
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
          
            int num = n/2;
            int rem = n%2;
          
            System.out.println(num)
        }
    }
}


// 73ms/32,440KB 　下の人の真似たけど答え見てもなにやってるかわからん…
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
           
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
            System.out.println(n);
          
            for(int i=0; i<n; i++) {
            	System.out.println(1);
            }
            
        }
    }
}


// 1 110ms/35,672KB
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		
		for(int i = 0; i < n; i++) {
			System.out.println(1);
		}
	}
}