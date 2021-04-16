// ABC93 A.abc of ABC


//　文字列だる。わかんね。
//  誰1真似た　112ms/35,408KB
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
      
        Set<Character> set = new HashSet<>();
        set.add(s[0]);
        set.add(s[1]);
        set.add(s[2]);
      
        if(set.size() == 3) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}

// 誰1 118ms/35,452KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		
		Set<Character> set = new HashSet<>();
		set.add(s[0]);
		set.add(s[1]);
		set.add(s[2]);
		
		if (set.size() == 3) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}


// 誰2 88ms/26,952KB
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String S = null;
		boolean judgh = true;
		boolean judgha;
		boolean judghb;
		boolean judghc;
		do {
			S = input.next();
			for(int i = 0; i < 3; i++) {
				if(S.charAt(i) == 'a' || S.charAt(i) == 'b' || S.charAt(i) == 'c') {
					judgh = true;
				}else {
					judgh = false;
				}
			}
		}while(S.length() != 3 || judgh == false);
		judgha = S.contains("a");
		judghb = S.contains("b");
		judghc = S.contains("c");
		if(judgha && judghb && judghc) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
