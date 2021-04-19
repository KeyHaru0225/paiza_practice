// ABC185 C.Duodecim Ferra

// まず問題文がよくわからん

// 誰1 124ms/35,556KB
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    //int m = sc.nextInt();
    //int t = sc.nextInt();
    //int a = sc.nextInt();
    //int b = sc.nextInt();
    //int c = sc.nextInt();
    //int d = sc.nextInt();
    long l = sc.nextLong()-1;
    long n;
    long ans=1;
    long m;
    //int min=a;
    //int max=n;
    if(l<22) {
    	n=l-11;
    	for(long i=0;i<n;i++) {
    		ans=ans*(l-i);
    		ans=ans/(i+1);
    	}
    }else {
    	for(long i=0;i<11;i++) {
    		ans=ans*(l-i);
    		ans=ans/(i+1);
    	}
    }
	//int a[] = new int[m];
    //int b[] = new int[m];
    //int c[] = new int[n];
    System.out.println(ans);
    
    
  }
}


// 誰2 122ms/35,616KB
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        sc.close();
        long ans = 1;
        for(int i = 1; i <= 11; i++){
            ans *= (L-i);
            ans /= i;
        }
        System.out.println(ans);
    }
}