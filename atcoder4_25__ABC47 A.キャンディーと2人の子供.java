// ABC47 A.キャンディーと2人の子供

//　たぶん配列使うんやろうなあ  82ms/32,580KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
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
          
            if (array[0] + array[1] == array[2]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
          
            
        }
    }
}

// 1 124ms/35,616KB
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] array = new int[]{a, b, c};
        Arrays.sort(array);

        if (array[0] + array[1] == array[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

// 2 114ms/35,600KB
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
 
		if (a + b == c || a + c == b || b + c == a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
 
}