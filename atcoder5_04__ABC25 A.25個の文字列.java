// ABC25 A.25個の文字列

// 問題文は分かったけど、コードがわからん。
import util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        int n = sc.nextInt();
      
        String[] array = {aa, ab, ac, ad, ae, ba, bb, bc, bd, be, ca, cb, cc, cd, ce, 
                          da, db, dc, dd, de, ea, eb, ec, ed, ee};
      
        if(s.substring(0).equals(array(n - 1))) {
        	System.out.println();
        }
    }
}

// 1 179ms/39,184KB
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();

		String[] array = s.split("");
		List<String> list = new ArrayList<>();

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				list.add(array[i] + array[j]);
			}
		}
		String ans = list.get(n - 1);
		System.out.println(ans);
	}
}

// 2 181ms/39,320KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int n = sc.nextInt()-1;
		
		String t = String.valueOf(s[n/5]) + String.valueOf(s[n%5]);
		
		System.out.println(t);
	}
}