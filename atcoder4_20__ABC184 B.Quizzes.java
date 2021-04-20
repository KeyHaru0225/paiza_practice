// ABC184 B.Quizzes

//　頑張ってみた
/*
./Main.java:14: error: ']' expected
            String s[n] = br.readLine().split(" ");
                     ^
./Main.java:14: error: ';' expected
            String s[n] = br.readLine().split(" ");
                      ^
2 errors
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            int x = Integer.parseInt(chr[1]);
            String s[n] = br.readLine().split(" ");
            
            int count = x;
		
          for(int i=0; i<n; i++){
            if(s[i].equals == "o"){
            	count ++;
            } else if(s[i].equals == "x" && count != 0){
                  count --;
            } else {
                  count = count;
            }
          }
          
          System.out.println(count);
            
        }
    }
}


// 誰1真似てもCE
/*
./Main.java:17: error: cannot find symbol
            if(s[i].equals == ("o")){
                   ^
  symbol:   variable equals
  location: class String
1 error
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            int x = Integer.parseInt(chr[1]);
            String[] s = br.readLine().split(" ");

          for(int i=0; i<n; i++){
            if(s[i].equals == ("o")){
            	x ++;
            } else {
              if(x > 0){
                x --;
              }
            }
          }
          
          System.out.println(x);
            
        }
    }
}
             

//　誰1 315ms/55,516KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		String s = sc.next();
		String[] ss = s.split("");

		for (int i = 0; i < n; i++) {
			if (ss[i].equals("o")) {
				x++;
			} else {
				if (x > 0) {
					x--;
				}
			}
		}
		System.out.println(x);

		sc.close();
	}
}

// 誰2 239ms/40,348KB
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        String S = sc.next();

        for(int i = 0;i < N;i++){
            char judge = S.charAt(i);
            if(judge == 'x' && X != 0){
                X = X - 1;
            }else if(judge == 'o'){
                X = X + 1;
            }
        }
        System.out.println(X);
    }
}

