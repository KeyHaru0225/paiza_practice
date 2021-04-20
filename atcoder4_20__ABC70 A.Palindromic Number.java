// ABC70 A.Palindromic Number

//RE 118ms/35,560KB
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
      
        String n1 = sc.next();
        String n2 = sc.next();
      
        if(n1.charAt(0) == n2.charAt(0) && n1.charAt(1) == n2.charAt(1) 
           && n1.charAt(2) == n2.charAt(2)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
      
    }
}

// 誰1 94ms/26,944KB
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,B,sum =0;
		N=sc.nextInt();
		B=N;
		while(N>0) {
			sum*=10;
			sum+=N%10;
			N = N/10;
		}
		if(sum == B) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}

}

// 誰2 107ms/35,764KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		if(n.charAt(0)  == n.charAt(2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

// 誰3 113ms/35,656KB
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 10 == n / 100) System.out.println("Yes");
        else System.out.println("No");
    }
}

	