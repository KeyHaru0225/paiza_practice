//ABC190 A.Very Very Primitive Game

//./Main.java:22: error: break outside switch or loop
// break; ってコンパイルエラー

import java.util.Scanner;
import java.util.Random;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = rand.nextInt(2);
      
        if(A > B){
          System.out.println("Takahashi");
        }else if(A == B && C == 0){
          System.out.println("Aoki");
        }else if(A == B && C == 1){
          System.out.println("Takahashi");
        }else if(B > A){
          System.out.println("Aoki");
        }else{
          break;
        }
    }
}

//何か間違えたいみわからん
import java.util.Scanner;
import java.util.Random;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = rand.nextInt(2);
      //たぶんまとめて書いてないからかなあ
        if(A > B){
          System.out.println("Takahashi");
        }else if(A == B && C == 0){
          System.out.println("Aoki");
        }else if(A == B && C == 1){
          System.out.println("Takahashi");
        }else if(B > A){
          System.out.println("Aoki");
        }else{
          System.out.println("");
        }
    }
}



//誰かの答え
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
 
        if(C == 0){
            if(A <= B){
                System.out.println("Aoki");
            }else{
                System.out.println("Takahashi");
            }
        }else{
            if(B <= A){
                System.out.println("Takahashi");
            }else{
                System.out.println("Aoki");
            }
        }
    }
}