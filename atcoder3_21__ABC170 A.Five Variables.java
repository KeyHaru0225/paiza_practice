// ABC170 A.Five Variables

//もうわかんねえな、これ
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        char[5] x = sc.next().toCharArray();
        char ans;  
      
        for(i<0; i<4; i++){
          	char ans = x.charAt(i);
          		if(char[i] == 0){
          			System.out.println(i+1);
                } 
        }
      
      
    }
}


//誰かの答え
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int x[] = new int[5];
        int j = 1;
        for(int i = 0; i<5; i++){
            x[i] = sc.nextInt();
            if(x[i]==0){
                System.out.println(j);
                break;
            }
　　　　　　//++して配列回すん頭から抜けてた…
            j++;
        }
    }
}


//誰かの答え2
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        int x5 = sc.nextInt();
 
        int[] array = {x1, x2, x3, x4, x5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == 0) {
                System.out.println(count);
            }
        }
    }
}