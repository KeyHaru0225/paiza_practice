// ABC27 A.長方形

// 文字列使うべきなんやろなあ　char型とか
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int l1 = Integer.parseInt(chr[0]);
			int l2 = Integer.parseInt(chr[1]);
			int l3 = Integer.parseInt(chr[2]);
          
            if(l1 == l2 && l2 == l3) {
              System.out.println(l1);
            } 
          
            int sort = Math.max(Math.max())
        }
    }
}

// 85ms/32,572KB  下の人の真似た
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int l1 = Integer.parseInt(chr[0]);
			int l2 = Integer.parseInt(chr[1]);
			int l3 = Integer.parseInt(chr[2]);
          
            if (l1 == l2) {
                System.out.println(l3);
            } else if (l2 == l3) {
                System.out.println(l1);
            } else {
                System.out.println(l2);
            }
          
        }
    }
}



// 1 121ms/35,552KB
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int l1 = sc.nextInt();
		int l2 = sc.nextInt();
		int l3 = sc.nextInt();
		
		if (l1 == l2) {
			System.out.println(l3);
		} else if (l2 == l3) {
			System.out.println(l1);
		} else {
			System.out.println(l2);
		}
	}
}

// 2 121ms/35,684KB
import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 3; i++){
            a[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(a);
        if(a[0] == a[1]){
            System.out.println(a[2]);
        } else {
            System.out.println(a[0]);
        }
    }
}