


import java.util. Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a > b){
            System.out.println("a > b");
        } else if (a < b){
            System.out.println("a < b");
        } else {
            System.out.println("a == b");
        }
    }
}



























import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner( System.in ) ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( a > b ) {
            System.out.println("a > b");
        }
        else if ( a < b ) {
            System.out.println("a < b");
        }
        else  {
            System.out.println("a == b");
        }
	}
}


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		String relation;

		if(a > b){
			relation = ">";
		}else if(a < b){
			relation = "<";
		}else{
			relation = "==";
		}

		System.out.printf("a %s b\n", relation);
	}
}