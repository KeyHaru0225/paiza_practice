// ABC38 A.お茶

// CE
import java.util.Scanner;
import java.lang.StringBuilder;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in){
        	String s = sc.next();
            StringBuilder str = new StringBuilder(s);
            String s = str.reverse().toString();
            
            if(s.substring(0) = "T"){
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
          
        }
    }
}


// 1 164ms/35,580KB
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.endsWith("T")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

// 2 180ms/32,884KB
import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		if (str[str.length - 1].equals("T")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
