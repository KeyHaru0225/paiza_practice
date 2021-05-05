// ABC19 A.高橋くんと年齢

// CE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);
          
            int[] array = {a, b, c};
            Arrays.sort(array);
            int num[] = Arrays.toString(array).;
            
            System.out.println(num[1]);
            
        }
    }
}

// 85ms/32,332KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);
          
            int[] array = new int[]{a, b, c};
            Arrays.sort(array);
            
            System.out.println(array[1]);
            
        }
    }
}



// 1 122ms/35,688KB
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int[] array = new int[]{a,b,c};
		Arrays.sort(array);

		System.out.println(array[1]);
	}
}