// ABC60 A.Shiritori

// たぶん考えたらわかるけどお腹空いて無理
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
      
        for()
    }
}

// 誰 114ms/35,504KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		if(a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}	
}