// ABC79 A.Good Integer

// 81真似ようとしてわからんくなった
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    
    for(int i=0; i<4; i++){
    	if(str.charAt(i) == str.charAt(i+1) &&){
        	
        }
    }
    

    System.out.println(ans);
    sc.close();
  }
}

// 誰1 109ms/35240KB
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)
				|| s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3))

			System.out.println("Yes");

		else
			System.out.println("No");

	}
}

// 誰2 116ms/35,580KB
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        int i = 0;
        String ans = "No";

        if(x.substring(1,2).equals(x.substring(2,3))){
            if(x.substring(1,2).equals(x.substring(0,1)) || x.substring(1,2).equals(x.substring(3,4))){
                ans = "Yes";
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
