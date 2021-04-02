// ABC134 A.Dodecagon

// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int r = Integer.parseInt(chr[0]);
          
            System.out.println(3*Math.pow(r,2));
        }
    }
}


// 何かよくわからんけどキャストしやなあかんみたい
// 83ms/32,552KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int r = Integer.parseInt(chr[0]);
          
            System.out.println((int)(3*Math.pow(r,2)));
        }
    }
}