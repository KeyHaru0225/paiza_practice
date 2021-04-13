// ABC188 B.Orthogonality


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
            int count = 0;
		
          for(int i=0; i<n; i++){
          	String str[] = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            count += a*b; 
          }
            
            if(count == 0){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
          
          
        }
    }
}


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
            int count = 0;
		
          for(int i=0; i<n; i++){
          	String str[] = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            count += a*b; 
            
            if(count == 0){
            	System.out.println("Yes");
                break;
            }
          }
            if(count != 0){
            	System.out.println("No");
            }
          
          
        }
    }
}


// 誰1真似たら正解した　270ms/62,432KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            String[] A = br.readLine().split(" ");
            String[] B = br.readLine().split(" ");
            int count = 0;
		
          for(int i=0; i<n; i++){
            int a = Integer.parseInt(A[i]);
            int b = Integer.parseInt(B[i]);
            count += a*b; 
          }
            
            if(count == 0){
            	System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
          
          
        }
    }
}



// 誰1　269ms/62,040KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) throws IOException {

    	InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line = in.readLine();
	    int N = Integer.parseInt(line);
	    String[] strAArray = in.readLine().split(" ");
	    String[] strBArray = in.readLine().split(" ");
	    int total = 0;

	    for(int i = 0; i < N; i++) {
	    	int A = Integer.parseInt(strAArray[i]);
	    	int B = Integer.parseInt(strBArray[i]);

	    	total += A*B;
	    }

	    if(total == 0) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
    }

}


// 誰2 460ms/50,332KB
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[]  = new int[n];
        int B[] = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            ans += A[i]*B[i];
        }
        if(ans == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
