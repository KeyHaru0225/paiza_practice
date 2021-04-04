// ABC132 A.Fifty-Fifty

// 文字列わからんのじゃ！(大吾風)
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String s[4] = new  
    }
}


// 誰かの答え1　115ms/35,724KB
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();
        int count = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 1; j < 4; j++){
                if(S[i] == S[j]){
                    count++;
                }
            }
        }
        if(count == 6){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


// 誰かの答え2 196ms/35,860KB
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		String[] chars = str.split("");
		
		Set<String> syurui = Arrays.asList(chars).stream().collect(Collectors.toSet());
		
		String  _chr = syurui.iterator().next();
		long num = Arrays.asList(chars).stream().filter(chr->chr.equals(_chr)).count();

		if(syurui.size() != 2 || num != 2) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}


// 誰かの答え3 150ms/35,624KB
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char[]chars = s.toCharArray();
		
		Arrays.sort(chars);
		
		if(chars[0]==chars[1]&&chars[1]!=chars[2]&&chars[2]==chars[3]) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
