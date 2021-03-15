// 問題C-Conmma

//わからん！
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
          
        //n=999以下の場合
        if(n <= 999){
        	System.out.println(n);
        }
      　
        for(i=1000; i<=n; n++){
          //n=1000以上999,999以下の場合
          if(1000<= i <=999_999){
        	count ++;
            return count;
          }
        　//n=1,000,000以上999,999,999以下の場合
          if(1_000_000 <= n <= 999_999_999){
             count ++;
             return count;
          }
        }
    }
}


//誰かの答え
import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
		long calc = 1;
		
		while(true) {
			calc *= 1000;
			
			if(calc <= n) {
				ans += n - calc + 1;
			}else {
				break;
			}
		}
 
		System.out.print(ans);
		sc.close();
	}
}

//誰かの答え2
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String n = sc.next();
			int keta = n.length();
			long nLong = Long.parseLong(n);
 
			long total = 0;
 
			for (int i = 6; i < keta; i += 3) {
				total += ((long) Math.pow(10, i) - (long) Math.pow(10, i - 3)) * ((i - 1) / 3);
			}
 
			total += (nLong - ((long) Math.pow(10, ((keta - 1) / 3) * 3) - 1)) * ((keta - 1) / 3);
 
			System.out.println(total);
 
		}
	}
}