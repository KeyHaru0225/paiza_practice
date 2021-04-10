// ABC190 B.Magic 3

// わかんね。なんとなく頑張ったら解けそう感はある…
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
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);
          
          String[n-1] s
          HashMap?
          
        }
    }
}


// 誰かの答え2をまねしたら出来た　76ms/32,724KB
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
			int s = Integer.parseInt(chr[1]);
			int d = Integer.parseInt(chr[2]);
          
            for(int i=0; i<n; i++){
            	String  str[] = br.readLine().split(" ");
                int x = Integer.parseInt(str[0]);
                int y = Integer.parseInt(str[1]);
              		if(x<s && y>d){
                    	System.out.println("Yes");
                        return;
                    }
            }
          
           System.out.println("No");
        }
    }
}


// 誰かの答え1 127ms/35,940KB
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt(), d = sc.nextInt();
        String ans = "No";
        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt(), y = sc.nextInt();
            if (x < s && y > d)
                ans = "Yes";
        }
        sc.close();
        System.out.println(ans);
    }
}


// 誰かの答え2 84ms/32,656KB
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] NSD = br.readLine().split(" ");
        int N = Integer.parseInt(NSD[0]);
        int S = Integer.parseInt(NSD[1]);
        int D = Integer.parseInt(NSD[2]);
        
        for(int n=0; n<N; n++){
        	String[] in = br.readLine().split(" ");
        	int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);
        	if(x<S && y>D){
        	    System.out.println("Yes");
        	    return;
        	}
        }
        
        System.out.println("No");

    }
}
