// ABC.75 One out of Three

// int ans;　消したらACになった。たぶん「int ans = 0」だったらACだったかも。
// 81ms/32,560KB
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
          
          
            if(a == b && b != c) {
                int ans = c;
            	System.out.println(ans);
            }
            if(a != b && b == c){
                int ans = a;
                System.out.println(ans);
            }
            if(a == c && a != b){
               int ans = b;
               System.out.println(ans);
            }
          
        }
    }
}

// 誰　116ms/35,640KB
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a == b) System.out.println(c);
        else if(b == c) System.out.println(a);
        else System.out.println(b);
    }
}
