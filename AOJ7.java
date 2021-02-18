import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}


















import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		Arrays.sort(a);
		System.out.println(a[0] + " " + a[1] + " " + a[2]);
	}
}