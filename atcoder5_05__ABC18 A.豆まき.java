// ABC18 A.豆まき

//　わかんね
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);
          
            int[] array = new int[]{a, b, c};
            Arrays.sort(array);
          
            Map<Integer, Integer> num = new HashMap<Integer, Integer>();
            num.put()
          
          
        }
    }
}

// RE　なんでや
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);
          
            if(a > b && a > c) {
                System.out.println(1);
            } else if(a > b && a < c || a < b && a > c) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }

            if(b > a && b > c) {
                System.out.println(1);
            } else if(b > a && b < c || b < a && b > c) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }

            if(c > a && c > b) {
                System.out.println(1);
            } else if(c > a && c < b || c < a && c > b) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
          
          
        }
    }
}


// 1 124ms/35,748KB
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a > b && a > c) {
			System.out.println(1);
		} else if(a > b && a < c || a < b && a > c) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}

		if(b > a && b > c) {
			System.out.println(1);
		} else if(b > a && b < c || b < a && b > c) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}

		if(c > a && c > b) {
			System.out.println(1);
		} else if(c > a && c < b || c < a && c > b) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
	}
}

// 2 124ms/35,932KB
import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] g = new int[3];
        for(int i = 0; i < 3; i++){
            g[i] = sc.nextInt();
        }
        sc.close();
        int p1 = Arrays.stream(g).max().getAsInt();
        int p3 = Arrays.stream(g).min().getAsInt();
        for(int i = 0; i < 3; i++){
            System.out.println(g[i] == p1? 1: g[i] == p3? 3:2);
        }
    }
}