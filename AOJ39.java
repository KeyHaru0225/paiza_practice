import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scannner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n == 0) break;
        for(i=0; i<n.length; i++){
            
        }
    }
}

//一行for文の時だけforの隣に{}なしでそのまま記述するのか←誰かの答えに対して
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
            int n=scan.nextInt();
            if(n==0)break;
            int[] s=new int[n];
            
            for(int i=0;i<n;i++){
            s[i]=scan.nextInt();
            }
            
            Double m=0.0;
            for(int i=0;i<n;i++){
            m+=s[i];
            }
            
            m/=n;
            Double a=0.0;
            
            for(int i=0;i<n;i++){
                Double dif=s[i]-m;
                a+=dif*dif;
            }
            a/=n;
            a=Math.sqrt(a);
            System.out.printf("%.5f\n",a);
        }
        scan.close();
    }
}





//誰かの答え
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
            int n=scan.nextInt();
            if(n==0)break;
            int[] s=new int[n];
            for(int i=0;i<n;i++)s[i]=scan.nextInt();
            Double m=0.0;
            for(int i=0;i<n;i++)m+=s[i];
            m/=n;
            Double a=0.0;
            for(int i=0;i<n;i++){
                Double dif=s[i]-m;
                a+=dif*dif;
            }
            a/=n;
            a=Math.sqrt(a);
            System.out.printf("%.5f\n",a);
        }
        scan.close();
    }
}