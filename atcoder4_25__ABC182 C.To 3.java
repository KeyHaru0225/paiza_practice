// ABC182 C.To 3

// 問題文はわかった、答え見てもわからん。むずい。

// 1 120ms/35,748KB
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[]s=sc.nextLine().toCharArray();
		int[]arr=new int[3];
		for(char ch:s) {
			int val=(ch-'0')%3;
			arr[val]++;
		}
		int min=Math.min(arr[1], arr[2]);
		int m1=(arr[1]-min)%3;
		int m2=(arr[2]-min)%3;
		int s1=m1+m2;
		
		int v1=arr[1]%3;
		int v2=arr[2]%3;
		min=Math.min(v1, v2);
		v1=v1-min;
		v2=v2-min;
		int s2=v1+v2;
		
		int sol=Math.min(s1, s2);
		if(sol>=s.length)sol=-1;
		System.out.println(sol);

	}

}


// 2 186ms/53,036KB
import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
 
public class Main {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      String N = scan.next();
      int l = N.length();
      
      int ans = 18;
      for (int i = 1; i < 1 << l; i++) {
        int sum = 0;
        int cnt = 0; // 消した桁数
        for (int j = 0; j < l; j++) {
          if ((1 & i >> j) == 1) {
            // 1だったらその桁を足す。
            sum += Integer.parseInt(N.substring(j, j + 1));
          } else {
            ++cnt;
          }
        }
        if (sum % 3 == 0 && ans > cnt) ans = cnt;
      }

      System.out.println(ans == 18 ? -1 : ans);

    }

}