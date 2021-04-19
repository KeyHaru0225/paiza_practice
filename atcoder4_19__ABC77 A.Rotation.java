// ABC77 A.Rotation

// CE
/*
./Main.java:8: error: cannot find symbol
        String c1 = c.reverse().toString();
                     ^
  symbol:   method reverse()
  location: variable c of type String
1 error
*/
import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        String c;
      
        c = sc.nextLine();
        String c1 = c.reverse().toString();
      
        if(c.equals(c1)){
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
      
    }
}


// 誰1 115ms/35,648KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String c1 = sc.next();
		String c2 = sc.next();

		if(c1.charAt(0) == c2.charAt(2) && c1.charAt(1) == c2.charAt(1) && c1.charAt(2) == c2.charAt(0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}	

// 誰2 156ms/35,524KB
import java.util.*;

class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // write here
        String first = sc.next();
        String second = sc.next();
        for (int i = 0; i < first.length(); i++) {
            if (first.toCharArray()[i] != second.toCharArray()[first.length() - i - 1]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        return;

    }
}

// 誰3 112ms/35,440KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c1 = sc.next().toCharArray();
		char[] c2 = sc.next().toCharArray();
		
		boolean f = true;
		
		for (int i=0; i<3; i++) {
			if (c1[i] != c2[2-i]) {
				f = false;
				break;
			}
		}
		
		if (f) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}

// 誰4 104ms/27,024KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[][] s = new char[2][3];
		s[0] = sc.next().toCharArray();
		s[1] = sc.next().toCharArray();
		sc.close();

		if (s[0][0] == s[1][2] && s[0][1] == s[1][1] && s[0][2] == s[1][0]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
