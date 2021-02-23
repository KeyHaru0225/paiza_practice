import java.util.Scanner;

public class Main{
    public static void main(String[] argas){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            
            if(H == 0 && W == 0){
                break;
            }
            
            for(i =0; i < H-1; i++){
                for(j =0; j < W-1; j++){
                    System.int.print((i%2==0 || i == H-1 || j%2==0 || j == W-1 ? "#" : "." ));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}




import java.util.Scanner;

public class Main{
    public static void main(String[] argas){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            
            if(H == 0 && W == 0){
                break;
            }
            
            for(int i =0; i < H; i++){
                for(int j =0; j < W; j++){
                    System.out.print((i + j) % 2 == 0 ? "#" : "." );
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}










import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0) {
				break;
			}
			for(int i = 0; i < H; ++i) {
				for(int j = 0; j < W; ++j) {
					System.out.print((i + j) % 2 == 0 ? "#" : ".");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}




