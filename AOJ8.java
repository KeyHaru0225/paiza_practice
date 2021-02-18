import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		if(y >= r && y <= H-r && x >=r && x <= W-r){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}



import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        
        if(W-1 && H-1 > x,y){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}












import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		if(y >= r && y <= H-r && x >=r && x <= W-r){
			System.out.printf("Yes\n");
		}else{
			System.out.printf("No\n");
		}
	}
}