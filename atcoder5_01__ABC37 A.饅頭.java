// ABC37 A.饅頭

//　わからんかったから下の人の真似た　82ms/32,604KB
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
          
            System.out.println(c / Math.min(a,b));
        }
    }
}


// 1 174ms/35,648KB
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = Math.min(a, b);
        int ans = c / min;
        System.out.println(ans);
    }
}