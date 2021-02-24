import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n]
    }
}



import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            a.add(x);
        }
        Collections.reverse(a);
        for(int i = 0; i<n; i++){
            System.out.print(a.get(i));
            if(i < n-1)System.out.print(' ');
        }
        System.out.println();
   
    }
}









import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; ++i) {
			A[i] = sc.nextInt();
		}
		for(int i = N - 1; i >= 0; --i) {
			System.out.print(A[i]);
			if(i != 0) System.out.print(" ");
		}
		System.out.println();
	}
}


import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int x=scan.nextInt();
            a.add(x);
        }
        Collections.reverse(a);
        for(int i=0;i<n;i++){
            System.out.print(a.get(i));
            if(i<n-1)System.out.print(' ');
        }
        System.out.println();
        scan.close();
    }
} 