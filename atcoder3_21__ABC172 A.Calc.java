// ABC172 A.Calc

//不正解
import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        int a = Integer.parseInt(br.readLine());
      
        System.out.println(a + Math.pow(a,2) + Math.pow(a,3));
    }
}


//不正解
import java.util.Scanner;
import java.math.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
 
        System.out.println(a + Math.pow(a,2) + Math.pow(a,3));
    }
}


//誰かの答え
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
 
        System.out.println(a + a*a + a*a*a);
    }
}