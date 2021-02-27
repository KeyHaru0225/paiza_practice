//ほんまに問題文からしてわからんwww
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
    }
}










import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int num[][][]=new int[5][4][11];
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int b=scan.nextInt(),f=scan.nextInt(),r=scan.nextInt(),v=scan.nextInt();
            num[b][f][r]+=v;
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=3;j++){
                for(int k=1;k<=10;k++){
                    System.out.print(" "+num[i][j][k]);
                }
                System.out.println();
            }
            if(i<4){
                for(int j=0;j<20;j++)System.out.print('#');
                System.out.println();
            }
        }
        scan.close();
    }
} 


import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[][][] data = new int[4][3][10];
		
		for(int i = 0; i < n; i++) {
			int b = stdIn.nextInt();
			int f = stdIn.nextInt();
			int r = stdIn.nextInt();
			int v = stdIn.nextInt();
			
			data[b-1][f-1][r-1] += v;
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 10; k++) {
					System.out.print(" " + data[i][j][k]);
				}
				System.out.println();
			}
			if(i != 3) {
			System.out.println("####################");
			}
		}
	}

}