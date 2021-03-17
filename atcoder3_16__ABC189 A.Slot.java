// ABC189 A.Slot


//不正解
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      
        String C_1 = sc.next();
        String C_2 = sc.next();
        String C_3 = sc.next();
      
      if(C_1.equals(C_2) && C_2.equals(C_3)){
        System.out.println("Won");
      }else{
        System.out.println("Lost");
      }
      
    }  
}



//誰かの答え
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		sc.close();
 
		if (c[0] == c[1] && c[1] == c[2]) {
			System.out.println("Won");
		} else {
			System.out.println("Lost");
		}
	}
}

//誰かの答え2
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
 
		String[] array = c.split("");
 
		if(array[0].equals(array[1]) && array[1].equals(array[2])) {
			System.out.println("Won");
		} else {
			System.out.println("Lost");
		}
	}
}