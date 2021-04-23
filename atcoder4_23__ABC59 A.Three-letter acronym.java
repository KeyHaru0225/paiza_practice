// ABC59 A.Three-letter acronym

// CE
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
      
        String ans1 = s1.charAt(s1.substring(0).toUpperCase);
        String ans2 = s2.charAt(s2.substring(0).toUpperCase);
        String ans3 = s3.charAt(s3.substring(0).toUpperCase);
      
        System.out.println(ans1 + ans2 + ans3);
    }
}

// CE
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String s1 = sc.next().toUpperCase;
        String s2 = sc.next().toUpperCase;
        String s3 = sc.next().toUpperCase;
      
        String ans1 = s1.charAt(s1.substring(0));
        String ans2 = s2.charAt(s2.substring(0));
        String ans3 = s3.charAt(s3.substring(0));
      
        System.out.println(ans1 + ans2 + ans3);
    }
}

// 1 153ms/38,936KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		String[] array = new String[]{s1,s2,s3};
		String ans = "";

		for(int i = 0; i < array.length; i++) {
			ans += array[i].charAt(0);
		}
		ans = ans.toUpperCase();
		System.out.println(ans);
	}	
}

// 2 170ms/38,912KB
import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String[] S = sr.nextLine().split(" ");
        System.out.println(S[0].substring(0,1).toUpperCase() + S[1].substring(0,1).toUpperCase() + S[2].substring(0,1).toUpperCase());
    }
}
