// ABC13 A.A

//　わかると思うけどほんまに眠すぎてパス

// 1 117ms/35,580KB
import java.util.*;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char[]chars=s.toCharArray();
		System.out.println(chars[0]-'A'+1);
		
	}

}

// 2 111ms/35,496KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		switch(a) {
		case "A":
			System.out.println(1);
			break;
		case "B":
			System.out.println(2);
			break;
		case "C":
			System.out.println(3);
			break;
		case "D":
			System.out.println(4);
			break;
		case "E":
			System.out.println(5);
			break;
		}
	}
}
