import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int num[][] = new int[r][c];
        
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(" " + num[r+1][c+1]);
            }
        }
        
    }
}

//微妙に理解が出来ていない
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        int c=scan.nextInt();
        int[][] a=new int[r][c];
        int[][] ans=new int[r+1][c+1];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=scan.nextInt();
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            ans[i][j]+=a[i][j];
            ans[i][c]+=a[i][j];
            ans[r][j]+=a[i][j];
            ans[r][c]+=a[i][j];
            }
        }
        for(int i=0;i<r+1;i++){
            for(int j=0;j<c+1;j++){
                if(j>0)System.out.print(" ");
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}










import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        int c=scan.nextInt();
        int[][] a=new int[r][c];
        int[][] ans=new int[r+1][c+1];
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)a[i][j]=scan.nextInt();

        for(int i=0;i<r;i++)for(int j=0;j<c;j++){
            ans[i][j]+=a[i][j];
            ans[i][c]+=a[i][j];
            ans[r][j]+=a[i][j];
            ans[r][c]+=a[i][j];
        }
        for(int i=0;i<r+1;i++){
            for(int j=0;j<c+1;j++){
                if(j>0)System.out.print(" ");
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}