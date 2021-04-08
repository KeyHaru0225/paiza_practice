// ABC121 A.White Cells

// RE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int H = Integer.parseInt(chr[0]);
			int W = Integer.parseInt(chr[1]);
			int h = Integer.parseInt(chr[2]);
                        int w = Integer.parseInt(chr[3]);
          
          　int total = H * W;
           
            System.out.println(total - (H*w + h*(W-w)));
          
        }
    }
}

// RE いみふ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int H = Integer.parseInt(chr[0]);
			int W = Integer.parseInt(chr[1]);
			int h = Integer.parseInt(chr[2]);
            　　　　　　int w = Integer.parseInt(chr[3]);

            System.out.println((H-h) * (W-w));
          
        }
    }
}


// 誰かの答え 99ms/27,052KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		System.out.println((h - x) * (w - y));
	}
}
