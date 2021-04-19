// ABC74 A.Bichrome Cells

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
          
            System.out.println(n*n - a);
          
        }
    }
}


// 誰　115ms/35,512KB
import java.util.*;

class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(n * n - a);
    }
}
