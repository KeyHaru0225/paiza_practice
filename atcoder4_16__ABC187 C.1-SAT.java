// ABC187 C.1-SAT

// 問題文は分かった

// 誰1 763ms/82,288KB
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i < n; ++i) {
			s[i] = sc.next();
			map.put(s[i], 1);
		}
		String ans = "satisfiable";
		for(int i = 0; i < n; ++i) {
			if(map.containsKey("!"+s[i])) {
				ans = s[i];
			}
		}
		
		System.out.println(ans);
		
	}
}

// 誰2 695ms/74,252KB
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<String> S = new HashSet<String>();

    for (int i=0;i<N;i++) {
      String s = sc.next();
      S.add(s);
    }

    int count = 0;
    boolean ans = true;

    String s1[] = new String[S.size()];

    for (String a : S ) {
      String t = "!" + a ;
      if(S.contains(t)){
        s1[count] = a;
        count++;
        ans = false;
      }
    }


    if(ans){
      System.out.println("satisfiable");
    }else{
      System.out.println(s1[0]);
    }

  }
}


// 誰3 791ms/88,452KB
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<String> input = new HashSet<>();
		Set<String> copy = new HashSet<>();
		for (int i = 0; i < N; i++) {
			String in = sc.next();
			input.add(in);
			copy.add(in);
		}
		for(String s : input) {
			if(s.charAt(0)!='!') {
				continue;
			}
			int beforeSize = copy.size();
			copy.add(s.substring(1,s.length()));
			if(beforeSize==copy.size()) {
				System.out.println(s.substring(1,s.length()));
				System.exit(0);
			}
		}
		System.out.println("satisfiable");
	}
}