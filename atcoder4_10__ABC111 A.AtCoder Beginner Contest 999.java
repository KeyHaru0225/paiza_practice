// ABC111 A.AtCoder Beginner Contest 999


// わからんくなったorz
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n[] = new Integer.parseInt(chr[0]);
          
            for(int i = 0; i<n.length; i++){
            	if(n[i].substring(i) == 9 || n[i].substring(i) == 1){
                	n[i] = 1;
                    System.out.print( )
                }
            }
          
        }
    }
}

// WAになった
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {
 
			String in = br.readLine();
          
            String[] s = in.split(" ");
          
            for(int i = 0; i<s.length; i++){
              
              if(s[i].contains("1")){
            	System.out.print(s[i].replace("1","9"));
              } else if(s[i].contains("9")) {
              	System.out.println(s[i].replace("9","1"));
              }
              
            }
              
        }
    }
}


// 誰かの答え1  122ms/35,504KB
import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String [] s = sc.next().split("");
    for (int i = 0; i < s.length; i++) {
      if (s[i].contains("1")) System.out.print(s[i].replace("1","9"));
      else if (s[i].contains("9")) System.out.print(s[i].replace("9","1"));
    } 
    sc.close();
    }
  }
 

// 誰かの答え2  106ms/35,604KB
import java.util.*;

public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		StringBuilder t = new StringBuilder();
		String n = sc.next();
		for (char ch : n.toCharArray()) {
			if (ch=='1') t.append('9');
			else if (ch=='9') t.append('1');
			else t.append(ch);
		}
		System.out.println(t);
		sc.close();
	}

	public static void main(String[] args) {
		solve();
	}

}

        