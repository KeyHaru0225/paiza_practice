// ABC122 A.Double Helix

// わからんくなった…]
// 無理にHashMaoに拘らんでも良かったみたい
import java.util.Scanner;
import java.util.HashMap;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        String[] b = {"A","C","G","T"};
       
        Map<String, String> helix = new HashMap<String, String>();
        helix.put("A", "T");
        helix.put("C", "G");
      
        String ans_1 = helix.get("A");
        String ans_2 = helix.get("T");
      
        if(String[0] || helix.get("T")){
          System.out.println()
        }
    }
}


// 誰かの答え1 94ms/26,936KB
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String b = sc.next();

        if(b.equals("A")){
            System.out.println("T");
        }else if(b.equals("T")){
            System.out.println("A");
        }else if(b.equals("G")){
            System.out.println("C");
        }else{
            System.out.println("G");
        }
    }
}


// 誰かの答え2 96ms/26,940KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		String ans = "";
		if (s[0] == 'A') ans = "T";
		if (s[0] == 'T') ans = "A";
		if (s[0] == 'C') ans = "G";
		if (s[0] == 'G') ans = "C";
		System.out.println(ans);
	}
}
