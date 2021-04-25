// ABC46 A.AtCoDeerくんとペンキ

// 問題文見間違えたorz
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
      
        int count = 0;
      
        if(a.equals(b) && b.equals(c)){
        	count = 3;
        } else if(a.equals(b) || a.equals(c) || b.equals(c)) {
        	count = 2;
        } else {
        	count = 0;
        }
      
      System.out.println(count);
      
    }
}

// 正解　77ms/32,480KB
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
            int c = Integer.parseInt(chr[2]);
          
            if (a == b && b == c) {
                System.out.println(1);
            } else if (a == b || b == c || a == c) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}


// 1 115ms/35,556KB
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println(1);
        } else if (a == b || b == c || a == c) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}