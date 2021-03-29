// ABC142 A.Odds of Oddness

//RE
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
          
            int ans[] = new int[n-1];
            for(int i=0; i<n; i++){
            	if(ans[i]%2 != 0){
                  count ++;
                }
              System.out.println((double)count/n);
            }
          
          
        }
    }
}


// 下の人の参考にしたら正解した
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            
                        int num = (n+1)/2;
                        double ans = (double) num/n;
                        System.out.println(ans);
          
        }
    }
}


// 誰かの答え
import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
  	
    int num = (n + 1) / 2;
 
    double ans = (double) num / n;
    
    System.out.println(ans);
  
  }
}