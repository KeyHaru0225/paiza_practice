// ABC158 A.Station and Bus

//全部不正解
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			String s_1 = chr[0];
            String s_2 = chr[1];
            String s_3 = chr[2];
          
           if(s_1 == s_2 && s_2 == s_3){
           		System.out.println("No");
           } else {
           		System.out.println("Yes");
           }
          
        }
    }
}


//下の人の答えを参考にして正解
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String s = br.readLine();
          
           if(s.equals("AAA") || s.equals("BBB")){
           		System.out.println("No");
           } else {
           		System.out.println("Yes");
           }
          
        }
    }
}





///誰かの答え
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
        if(s.equals("AAA") || s.equals("BBB")){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}