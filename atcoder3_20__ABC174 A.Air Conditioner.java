// ABC174 A.Air Conditioner

//正解(何回か修正はした)
//やっぱBufferedReader～速いし、メモリ消費も抑えられる
// io系は「throws IOException」入れないとコンパイルエラーになって処理してくれない
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int x = Integer.parseInt(br.readLine());
          
        if(x>=30){
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
    }
}


// 誰かの答え
import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
        if (sc.nextInt() < 30) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
	}
}