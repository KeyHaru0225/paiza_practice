// ABC207 A.Repression

// 70ms,25292KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String in = br.readLine();
			
			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
			int c = Integer.parseInt(chr[2]);
			
			int ab = a + b;
			int bc = b + c;
			int ca = c + a;
			
			System.out.println(Math.max(ab, Math.max(bc,  ca)));
			}
		}
	}
