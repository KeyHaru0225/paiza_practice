//たぶんきちんと考えたら解けたと思うけど、今日はすごいしんどい(風邪？)で頭が回らなくて無理…
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int P_2 [][] = sc.nextInt();
        int P_1 [][] = sc.nextInt();
    }
}



//誰かの答え
import java.util.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
		System.out.printf("%.9f\n", Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
	}
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Double x1,y1,x2,y2;
        x1=scan.nextDouble();
        y1=scan.nextDouble();
        x2=scan.nextDouble();
        y2=scan.nextDouble();
        Double dx=x2-x1;
        Double dy=y2-y1;
        Double ans=Math.sqrt(dx*dx+dy*dy);
        System.out.printf("%.5f\n",ans);
        scan.close();
    }
}

