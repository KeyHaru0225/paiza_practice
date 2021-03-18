// ABC181 A.Heavy Rotation

//正解
// int n = Integer.parseInt(sc.next());で高速化してみた。
//実行時間も10s速く、メモリも100KB抑えられている。

import java.util.Scanner;

public class Main{
	public static void main(String[] arg){
    	Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        
        if(n%2 == 0){
        	System.out.println("White");
        } else {
        	System.out.println("Black");
        }
      
    }
}

//誰かの答え
//実行速度　83ms
//メモリ消費量はこちらの方が多い

import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
 
　　　　//　↓BufferedReader～　で高速化できそう

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N= Integer.parseInt(br.readLine());
        
        if(N%2 == 0){
        	System.out.println("White");
        }else{
            System.out.println("Black");
        }
 
    }
}

