// ABC162 A.Lucky 7

//不正解。ですよねーって感じ。
//正解4、不正解7
import java.io.BufferdReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
            
            if(Pattern.matches("[7]",in)){
            	System.out.println("Yes");
            } else {
            	System.out.println("No");
            }
          
            
          
        }
      
        
    }
}

//下の人の真似たら正解した
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        	String in = br.readLine();
            
            String ans = "No";
            for(int i=0; i < 3; i++){
            	if(String.valueOf(in).substring(i, i + 1).equals("7")){
                	ans = "Yes";
                    break;
                }
            }
            System.out.println(ans);    
        }
  
    }
}




//誰かの答え1
import java.util.Scanner;
 
public class Main {
    // A - Lucky 7
    // https://atcoder.jp/contests/abc162/tasks/abc162_a
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        String answer = "No";
        for(int i = 0; i < 3; i++) {
            if(String.valueOf(num).substring(i, i + 1).equals("7")) {
                answer = "Yes";
                break;
            }
        }
        System.out.println(answer);
    }
}


//誰かの答え2
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] n = sc.next().toCharArray();
		String ans = "";
		for (int i = 0; i < n.length; i++){
			if( n[i] == '7' ){
				ans = "Yes";
				break;
			} else {
				ans = "No";
		}
	}
	System.out.println(ans);
	sc.close();
	}
}