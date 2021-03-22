// ABC165 A.We Love Golf

//実行時エラー
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String str = br.readLine();

			String chr[] = str.split(" ");
			int k = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);

            for(int i=a; i<=b; i++){
            	if(i%k == 0){
                	System.out.println("OK");   
                } 	
            }
            for(int j=a; j<=b; j++){
            	if(j%k != 0){
                	System.out.println("NG");         
                } 
            }
          
          
        }
    }
}



//わからん！！
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String str = br.readLine();

			String chr[] = str.split(" ");
			int k = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);

            for(int i=a; i<=b; i++){
              for(int j=a; j<=b; j++){
            	if(i%k == 0){
                	System.out.println("OK");   
                } else {
                  System.out.println("NG");
                }
              }
            }
            
          
          
        }
    }
}


//答えパクったけど実行時エラー…何故？
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String str = br.readLine();

			String chr[] = str.split(" ");
			int k = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
			int b = Integer.parseInt(chr[2]);

            boolean ans = false;
          
            for(int i=a; i<=b; i++){
            	if(i%k == 0){
                	ans = true;
                } 	
            }
          
           if(ans){
           		System.out.println("OK");
           } else {
           		System.out.println("NG");
           }
          
          
        }
    }
}












//誰かの答え
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
 
		boolean flag = false;
		for(int i = a; i <= b; i++) {
			if(i % k == 0) {
				flag = true;
			}
		}
 
		if(flag){
			System.out.println("OK");
		}else{
			System.out.println("NG");
		}
	}
}