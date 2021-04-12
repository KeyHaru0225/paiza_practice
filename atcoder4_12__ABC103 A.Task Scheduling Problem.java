// ABC103 A.Task Scheduling Problem


// 何か眠くてわからんくなった…
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a1 = Integer.parseInt(chr[0]);
			int a2 = Integer.parseInt(chr[1]);
			int a3 = Integer.parseInt(chr[2]);
          
            if(ai == a2 && a2 == a3){
            	System.out.println(0);
            } else if(){
            
            }
        }
    }
}


// 下の人の答えまねしたら正解　76ms/32,528KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a1 = Integer.parseInt(chr[0]);
			int a2 = Integer.parseInt(chr[1]);
			int a3 = Integer.parseInt(chr[2]);
          
            System.out.println(Math.max(a1,Math.max(a2,a3))-Math.min(a1, Math.min(a2,a3)));
        }
    }
}

// 誰1  114ms/35,624KB
import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		System.out.println(Math.max(A,Math.max(B,C))-Math.min(A, Math.min(B,C)));
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}
}


// 誰2 112ms/35,552KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
      
		int max = Math.max(a1, Math.max(a2, a3));
		int min = Math.min(a1, Math.min(a2, a3));
		System.out.println(max - min);
	}
}	