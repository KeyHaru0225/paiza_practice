// ABC88 A.Infinite Coins


// RE 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
          
            if(a == 0 && n%500 != 0){
            	System.out.println("No");
            } else {
            	System.out.println("Yes");
            }
          
        }
    }
}

// 誰3真似てもREいみふ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
          
            　　　　　　int ans = n % 500;
          
            　　　　　　if(ans <= a){
            	　　　　　　System.out.println("Yes");
           　　　　　　 } else {
            	　　　　　　System.out.println("No");
           　　　　　　 }
          
        }
    }
}



// 誰1 119ms/35,712KB
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        String ANS = N % 500 <= A ? "Yes" : "No";
       System.out.println(ANS);
    }
}

// 誰2 121ms/35,340KB
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()%500;
        int a = sc.nextInt();
        System.out.println(n<=a ? "Yes" : "No");
    }
}

// 誰3 117ms/35,568KB
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		
		int rest = n % 500;
		if (rest <= a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}