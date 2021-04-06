// ABC124 A.Buttons

// 正解　76ms/32,540KB
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
          
            if(a>b){
            	System.out.println(2*a-1);
            } else if(b>a) {
            	System.out.println(2*b-1);
            } else {
            	System.out.println(2*a);
            }
          
          
        }
    }
}


// 誰かの答え1 105ms/27,016KB
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 0;

        for(int i = 0; i<2; i++){
            if(a>=b){
                max = a + max;
                a--;
            }else{
                max = b + max;
                b--;
            }
        }
        System.out.println(max);
    }
}