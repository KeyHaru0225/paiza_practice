// ABC186 C.Unlucky 7


//　途中でわからんくなった
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            　　　　　　int n1 = Integer.toOctalString(n);
          
            
        }
    }
}


// 誰1 151ms/38,568KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int ans = 0;
		for (int i = 1; i <= n; i++) {
			String a = Integer.toOctalString(i);
			String b = String.valueOf(i);
			if (a.indexOf("7") == -1 && b.indexOf("7") == -1) {  // 「-1」は出現しない場合って意味らしい(indexOfブクマ参照)
				ans++;
			}
		}
		System.out.println(ans);
	}
}
