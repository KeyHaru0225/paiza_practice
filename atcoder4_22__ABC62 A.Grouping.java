// ABC62 A.Grouping

//　こっからどうしよ…
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int x = Integer.parseInt(chr[0]);
			int y = Integer.parseInt(chr[1]);
          
            int[] A = {1, 3, 5, 7, 8, 10, 12};
            int[] B = {4, 6, 9, 11};
            int[] C = {2};
        }
    }
}

// 誰1 119ms/35,680KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Integer[] group = {1,3,1,2,1,2,1,1,2,1,2,1};
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(group[a - 1] == group[b - 1]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

// 誰2 114ms/35,764KB
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
    }

    public void main(Scanner sc) {
        int[] g = {0, 2, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0}; // /2したやつかなあ
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(g[x - 1] == g[y - 1] ? "Yes" : "No");
    }
}

// 誰3 123ms/35,456KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Set<Integer> g1 = new HashSet<>();
		Set<Integer> g2 = new HashSet<>();
		Set<Integer> g3 = new HashSet<>();
		
		g1.add(1);
		g1.add(3);
		g1.add(5);
		g1.add(7);
		g1.add(8);
		g1.add(10);
		g1.add(12);
		
		g2.add(4);
		g2.add(6);
		g2.add(9);
		g2.add(11);
		
		g3.add(2);
		
		if ((g1.contains(x) && g1.contains(y))
			|| (g2.contains(x) && g2.contains(y))
			|| (g3.contains(x) && g3.contains(y))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
