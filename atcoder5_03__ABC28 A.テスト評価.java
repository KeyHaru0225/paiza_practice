// ABC28 A.テスト評価

// 91ms/32,388KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
          
            if(n <= 59) {
            	System.out.println("Bad");
            } else if(n >= 60 && n <= 89) {
            	System.out.println("Good");
            } else if(n >= 90 && n <= 99) {
            	System.out.println("Great");
            } else {
            	System.out.println("Perfect");
            }
          
        }
    }
}

// 1 119ms/35,596KB
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String msg = "";
		if (n>=100) {
			msg = "Perfect";
		} else if (n>=90){
			msg = "Great";
		} else if (n>=60){
			msg = "Good";
		} else {
			msg = "Bad";
		}
		System.out.println(msg);
		
	}

}
