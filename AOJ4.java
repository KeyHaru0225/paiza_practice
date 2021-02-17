import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		System.out.println(S / 3600 + ":" + (S / 60) % 60 + ":" + S % 60);
	}
}






import java.lang. *;
import java.util. *;
import java.math. *;
import java.io. *;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int h = S/3600;
        int m = S%3600/60;
        int s = S%3600%60;
        
        System.out.println(h + ":" + m + ":" + s);
    }
}