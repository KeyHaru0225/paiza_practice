// ABC73 A.September 9

// WA
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        for(int i=0; i<2; i++){
        	if(str.charAt(i) == '9'){
            	count ++;
            } 
          if(count >= 1){
          	System.out.println("Yes");
          } else {
          	System.out.println("No");
          }
          
        }
    }
}

//　誰1改良したら正解　85ms/32,432KB
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
          
              if(n / 10 == 9 || n % 10 == 9) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}


// 誰1 114ms/35,732KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if(n / 10 == 9 || n % 10 == 9) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}	

// 誰2 111ms/35,588KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		if (n.indexOf("9") >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}