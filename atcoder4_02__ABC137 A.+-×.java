// ABC137 A.+-×

// 正解(ちょっと検索して調べたりはした)
// 79ms/32,684KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
          
            int ans_1 = a+b;
            int ans_2 = a-b;
            int ans_3 = a*b;
          
            int max = ans_1;
           
            if(max<ans_2){
            	max = ans_2;
            }
            if(max<ans_3){
            	max = ans_3;
            }
           
            System.out.println(max);
          
        }
    }
}


// 誰かの答え1 125ms/35,948KB
import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int plus = a + b;
		int minus = a - b;
		int multi = a * b;
		
		System.out.println(max(plus, minus, multi));
		
	}
	
	private static int max(int... datas) {
		return IntStream.of(datas).max().getAsInt();
	}
}


// 誰かの答え2 116ms/35,568KB
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Math.max(Math.max(a + b, a - b), a * b));
		sc.close();
	}
}