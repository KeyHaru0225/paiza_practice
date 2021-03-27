// ABC148 A.Round One

//試しても全部RE出る。謎
//実行時エラー
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
       		String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
            int ans = Integer.parseInt(chr[2]);
          
            if(a != b && b != ans){
            	System.out.println(ans);
            }
          
          
        }
    }
}


// 実行時エラー
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
       		String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
  
            System.out.println(6-a-b);

        }
    }
}


//実行時エラーいみわからん
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
       		String in = br.readLine();
          
            String chr[] = in.split(" ");
            int a = Integer.parseInt(chr[0]);
            int b = Integer.parseInt(chr[1]);
          
            if(a == 2 && b == 3 || a == 3 && b == 2){
				System.out.println(1);
            }
		    if(a == 1 && b == 3 || a == 3 && b == 1){
				System.out.println(2);
            }
		    if(a == 1 && b == 2 || a == 2 && b == 1){
				System.out.println(3);
            }
          
        }
    }
}


// 誰かの答え1
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        System.out.println(6-a-b);
    }
}

//誰かの答え2
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a =sc.next(); 
		String b =sc.next(); 
 
		if(!a.equals("1") && !b.equals("1")) {
			System.out.println(1);
		}else if(!a.equals("2") && !b.equals("2")) {
			System.out.println(2);
		}else {
			System.out.println(3);
		}
		}
		
		
}


//誰かの答え3
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
 
		int a = sc.nextInt();
		int b = sc.nextInt();
 
		if(a == 2 && b == 3 || a == 3 && b == 2)
			System.out.println(1);
 
		if(a == 1 && b == 3 || a == 3 && b == 1)
			System.out.println(2);
 
		if(a == 1 && b == 2 || a == 2 && b == 1)
			System.out.println(3);
	}
}