// ABC 123 A.Five Antennas


/*
./Main.java:25: error: incompatible types: String cannot be converted to int
            	if(k < (int)chr[j]-(int)chr[i]) {
            	               ^
./Main.java:25: error: incompatible types: String cannot be converted to int
            	if(k < (int)chr[j]-(int)chr[i]) {
            	                           ^
2 errors
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
            int c = Integer.parseInt(chr[2]);
            int d = Integer.parseInt(chr[3]);
            int e = Integer.parseInt(chr[4]);
            int k = Integer.parseInt(chr[5]);
          
            int ans = 0;
            int count = 0;
          
            for(int i=0; i<5; i++){
              for(int j=1; j<5; j++){
                
            	if(k < (int)chr[j]-(int)chr[i]) {
                	 ans ++;
                } else {
            	     count ++;
                }
                
              }
            }
              
          if(ans>=1){
          	System.out.println(":(");
          } else if(count>=1) {
            System.out.println("Yay!");
          } else {
          	System.out.println("");
          }
            
          
        }
    }
}


// RE いみふ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
            int c = Integer.parseInt(chr[2]);
            int d = Integer.parseInt(chr[3]);
            int e = Integer.parseInt(chr[4]);
            int k = Integer.parseInt(chr[5]);
          
            int min = 0;
            int max = 0;
          
            int[] num = {a,b,c,d,e};
            min = num[0];
            max = num[0];
          
            for(int i=1; i<num.length; i++){
            	min = Math.min(min,num[i]);
                max = Math.max(max,num[i]);
            }
            
            int diff = max - min;
            if(diff <= k){
            	System.out.println("Yay!");
            } else {
            	System.out.println(":(");
            }
            
        }
    }
}


// 誰かの答え1 125ms/35,612KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		int min;
		int max;
		
		int[] num = {a,b,c,d,e};
		min = num[0];
		max = num[0];
		
		for(int i = 1; i < num.length; i++) {
			min = Math.min(min, num[i]);
			max = Math.max(max, num[i]);
		}
		
		int diff = max - min;
		if(diff <= k) { 
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}


// 誰かの答え2 113ms/35,508KB
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int k = sc.nextInt();
    String ans = ":(";
    while (true) {
      if (b - a > k) break;
      if (c - a > k) break;
      if (d - a > k) break;
      if (e - a > k) break;
      if (c - b > k) break;
      if (d - b > k) break;
      if (e - b > k) break;
      if (d - c > k) break;
      if (e - c > k) break;
      if (e - d > k) break;
      ans = "Yay!";
      break;
    }
    System.out.println(ans);
		sc.close();
    }
}

// RE いみふ、もうわかんねえな、これ
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
            int c = Integer.parseInt(chr[2]);
            int d = Integer.parseInt(chr[3]);
            int e = Integer.parseInt(chr[4]);
            int k = Integer.parseInt(chr[5]);
          
          String ans = ":(";
            while (true) {
              if (b - a > k) break;
              if (c - a > k) break;
              if (d - a > k) break;
              if (e - a > k) break;
              if (c - b > k) break;
              if (d - b > k) break;
              if (e - b > k) break;
              if (d - c > k) break;
              if (e - c > k) break;
              if (e - d > k) break;
              ans = "Yay!";
              break;
            }
            System.out.println(ans);
          
         
        }
    }
}