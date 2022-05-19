// AOJ 5

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
			
			if (a < b) {
				System.out.println("a < b");
			} else if(a == b) {
				System.out.println("a == b");
			} else {
				System.out.println("a > b");
			}
		}
	}
}