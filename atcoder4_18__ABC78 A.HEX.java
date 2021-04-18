// ABC78 A.HEX

// 16進数に変換すると思ったらそうでもないみたい

// 誰1 111ms/35,656KB
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		char[] b = sc.next().toCharArray();
		
		
		if (a[0] > b[0]) {
			System.out.println(">");
		} else if (a[0] < b[0]) {
			System.out.println("<");
		} else {
			System.out.println("=");
		}
	}
}


// 誰2 109ms/35,584KB
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();

		Map<String ,Integer> map = new HashMap();
		map.put("A", 10);
		map.put("B", 11);
		map.put("C", 12);
		map.put("D", 13);
		map.put("E", 14);
		map.put("F", 15);

		if(map.get(x) < map.get(y)) {
			System.out.println("<");
		} else if (map.get(x) > map.get(y)) {
			System.out.println(">");
		} else {
			System.out.println("=");
		}
	}
}	