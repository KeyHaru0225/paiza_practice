import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();

       System.out.printf("%.10f %.10f\n", r*r*3.14, 2 * 3.14 *r);
    }
}


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

       System.out.printf("%.10f %.10f\n", r*r*Math.PI, (2*r)*Math.PI);
    }
}







import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();

		System.out.printf("%.10f %.10f\n",r*r*Math.PI,(2*r)*Math.PI);
	}
}