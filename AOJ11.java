import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        while(x != 0 && y != 0){
            if(x > y){
                System.out.println(y + " " + x);
            } else {
                
            }
        }
    }
}


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a == 0 && b == 0)break;

			System.out.printf("%d %d\n", Math.min(a, b),Math.max(a, b));
		}

	}
}

















import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a,b;

		while(true){
			a = sc.nextInt();
			b = sc.nextInt();

			if(a == 0 && b == 0)break;

			System.out.printf("%d %d\n", Math.min(a, b),Math.max(a, b));
		}

	}
}










