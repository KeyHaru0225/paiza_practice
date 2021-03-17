//ABC191 A-Vanishing Pitch

//コンパイルエラー　バイナリ演算子の不正なオペランドタイプ
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
         
        int V = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
        int D = sc.nextInt();
        
        int B_Time = D/V;
        
        if(T <= B_Time <= S){　//ここがおかしいらしい
　　　　　　　　　　　　　　　 //　かつ、またはとかしか使ったらあかんのかなあ
        	System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}


import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int T = sc.nextInt();
		int S = sc.nextInt();
		int D = sc.nextInt();
 
                //距離で場合分けをしている(Dが閾値)↓
		if(V * T > D || D > V * S) {
			System.out.println("Yes");
        }else{
			System.out.println("No");
        }
　　}
}


//誰かの答え
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int t = sc.nextInt();
		int s = sc.nextInt();
		int d = sc.nextInt();
 
		if(v * t > d || d > v * s)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}