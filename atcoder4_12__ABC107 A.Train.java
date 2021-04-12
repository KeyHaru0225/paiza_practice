// ABC107 A.Train


// 78ms/32,336KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
            int i = Integer.parseInt(chr[1]);
          
            System.out.println(n-i+1);
        }
    }
}


// 誰かの答え　108ms/35,796KB
import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i = sc.nextInt();
		System.out.println((N-i)+1);
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}
}