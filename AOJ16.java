import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new sc.nextInt();
        int []a = new int[n]
        
    }
}









import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	private static final int BIG_NUM  = 2000000000;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long sum = 0;
		int minimum = BIG_NUM,maximum = -BIG_NUM;

		try {

			int N = Integer.parseInt(br.readLine());

			String first[] = br.readLine().split("[\\s]+");
			int array[] = new int[first.length];

			for(int i = 0; i < first.length; i++){

				array[i] = Integer.parseInt(first[i]);
				minimum = Math.min(minimum, array[i]);
				maximum = Math.max(maximum, array[i]);
				sum += array[i];
			}

			System.out.printf("%d %d %d\n",minimum,maximum,sum);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}



import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Main{

    public static void main(String[] args) throws java.lang.Exception  {
    Scanner sc = new Scanner (System.in);

    long sum=0 ;
    int max = 0, min = 0;    
    int n = sc.nextInt();
    
    for (int x=0 ; x<n ; x++){
     int a = sc.nextInt();
      if (x==0){
         max = a;
         min = a;
     }
         
        else if (a>max){
            max =a;
        }
        else if (a<min){
            min =a;
        }
        
       sum += a; 
    }
    
    System.out.println( min + " " + max + " " +sum);
    
    }
    
}

import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int MIN = 1000001, MAX = -1000001; long SUM = 0;
		for(int i = 0; i < N; ++i) {
			int a = sc.nextInt();
			MIN = Math.min(MIN, a);
			MAX = Math.max(MAX, a);
			SUM += a;
		}
		System.out.println(MIN + " " + MAX + " " + SUM);
	}
}






