//大学数学ってか、高校数学からやり直さなあかんなこりゃ
//まず与えられた公式を読み解く事すらできんかったで

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            int n = sc.nextInt();
            int[] x = new [n]; //←↓int書いてねえ！型宣言！
            int[] y = new [n];
            
            for(i=0; i<n; i++){
                
            }
        }
    }
}


//やってる計算式は意味分からんけどなんか出来た
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            y[i] = sc.nextInt();
        }
        
        Double d1=0.0, d2=0.0, d3=0.0, dinf=0.0;
        for(int i=0; i<n; i++){
            Double dif = (double)Math.abs(y[i]-x[i]);
            d1 += dif;
            d2 += Math.pow(dif,2);
            d3 += Math.pow(dif,3);
            dinf = Math.max(dinf,dif);
        }
        
        d2 = Math.pow(d2,1/2.0);
        d3 = Math.pow(d3,1/3.0);
        System.out.printf("%.6f\n%.6f\n%.6f\n%.6f\n",d1,d2,d3,dinf);
        
    }
}





//誰かの答え
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        for(int i=0;i<n;i++)x[i]=scan.nextInt();
        for(int i=0;i<n;i++)y[i]=scan.nextInt();
        Double d1=0.0,d2=0.0,d3=0.0,dinf=0.0;
        for(int i=0;i<n;i++){
            Double dif=(double)Math.abs(y[i]-x[i]);
            d1+=dif;
            d2+=Math.pow(dif,2);
            d3+=Math.pow(dif,3);
            dinf=Math.max(dinf,dif);
        }
        d2=Math.pow(d2,1/2.0);
        d3=Math.pow(d3,1/3.0);
        System.out.printf("%.6f\n%.6f\n%.6f\n%.6f\n",d1,d2,d3,dinf);
        scan.close();
    }
}