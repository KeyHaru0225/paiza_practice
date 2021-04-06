// ABC126 A.Changing a Character

// わからんくなった。配列と文字列がようわからんのじゃ
import java.util.Scanner;

public class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        int k = sc.nextInt() - 1;
        char[n+1] s = sc.next().toCharArray();
      
        for(int i=0; i<n; i++){
        	char[] ans = char[i];
          		if(char[i] == char[k]){
                	
                }
        }
    }
}


// 誰かの答え1 117ms/35,412KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		String st[] = S.split("");
		
		for(int i = 0; i<N; i++){
			if(i==K-1)
				System.out.print(st[i].toLowerCase());
			else
				System.out.print(st[i]);
			
		}
	

	}
}