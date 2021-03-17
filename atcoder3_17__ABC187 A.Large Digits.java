//ABC187 A.Large Digits

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        
        int a[] = sc.nextInt();
        int b[] = sc.nextInt();
        int ans_1 = 0;
        int ans_2 = 0;
      
        for(i=0; i<a; i++){
        	ans_1 += a[i];
        }
        for(j=0; j<b; j++){
        	ans_2 += a[j];
        }
      
        if(ans_1>=ans_2){
        	System.out.println(ans_1);
        } else {
        	System.out.println(ans_2);
        }
      
        
    }
}


//誰かの答え
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
　　　　　　　　//int型でも良いみたい
		long resA=0;
		long resB=0;
		for(int i = 0;i<A.length();i++) {
　　　　　　　　　　　　//大体のコード見てたらcharAt()使ったら「-'0'」使ってるのは何故…
			resA+=A.charAt(i)-'0';
		}
		for(int i = 0;i<B.length();i++) {
			resB+=B.charAt(i)-'0';
		}
		System.out.println(Math.max(resA, resB));
	}
}