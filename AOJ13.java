import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int d = a / b;
        int r = a % b;
        float f = a / b;
        
       
       System.out.printf("%d %d %f", d, r, f);
    }
}


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       System.out.printf("%d %d %.10f\n", a/b, a%b, (double)a/(double)b);
    }
}










import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.printf("%d %d %.10f\n", a/b,a%b,(double)a/(double)b);
	}
}