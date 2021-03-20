// ABC178 A.Not

//正解
//三項条件演算子使ってみた☆

//Integer～使ったら実行時間は112ms→108msになったけどメモリ数が+120KB

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      
    int x = sc.nextInt();
      
    System.out.println(x == 0 ? "1" : "0");
    
    }
}


//誰かの答え1
//やっぱりInteger～使った方が実行時間短い&メモリ消費量も抑えられている
import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = Integer.parseInt(scan.next());
 
		if (X == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
 
}

//誰かの答え2
//メモリ消費量少ない、実行時間は↑とほぼ同じ
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int x = sc.nextInt();
 
        if(x==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}