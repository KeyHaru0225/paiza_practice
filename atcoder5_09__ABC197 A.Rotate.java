// ABC197 A.Rotate

//　文字列わからーーーーーーーーん！！
import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      
        String s = sc.next();
        char[] c = s.toCharArray();
        
        char[0] esc = char[0];
        char[0] = char[2];
        
    }
}


// 1 113ms/35,728KB
import java.util.*;
public class Main 
{
 	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.substring(1, s.length()).concat(s.substring(0, 1)));
    }
}






// 2 73ms/25,312KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
 
/**
 *
 * @author music
 */
public class Main {
 
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     * https://atcoder.jp/contests/abc199/tasks/abc199_c
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder( br.readLine());
        char first =sb.charAt(0);
        sb.delete(0,1);
        sb.append(first);
        System.out.println(sb);
    }
}


// 3 134ms/37,408KB
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str=br.readLine();
        str=str.substring(1,3)+str.substring(0,1);

        System.out.println(str);

    }    
}