//応えにはかすってるきがする



import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int A[][] = new int[n][m];
        int B[][] = new int[m][l];
        int C[][] = new int[n][l];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                A[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<l; j++){
                B[i][j] = sc.nextInt();
            }
        }
        
        int ans;
        for(int i=0; i<n; i++){
            ans = 0;
            for(int j=0; j<l; j++){
                ans += A[i][j] * B[i][j];
            }
	    System.out.printf("%d\n", ans);	
        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int l=scan.nextInt();
        int[][] a=new int[n][m];
        int[][] b=new int[m][l];
        long[][] c=new long[n][l];
        for(int i=0;i<n;i++)for(int j=0;j<m;j++)a[i][j]=scan.nextInt();
        for(int i=0;i<m;i++)for(int j=0;j<l;j++)b[i][j]=scan.nextInt();
        for(int i=0;i<n;i++)for(int j=0;j<l;j++)for(int k=0;k<m;k++)c[i][j]+=a[i][k]*b[k][j];
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                if(j>0)System.out.print(" ");
                System.out.print(c[i][j]);
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
        int n=scan.nextInt();
        int m=scan.nextInt();
        int l=scan.nextInt();
        int[][] a=new int[n][m];
        int[][] b=new int[m][l];
        long[][] c=new long[n][l];
        for(int i=0;i<n;i++)for(int j=0;j<m;j++)a[i][j]=scan.nextInt();
        for(int i=0;i<m;i++)for(int j=0;j<l;j++)b[i][j]=scan.nextInt();
        for(int i=0;i<n;i++)for(int j=0;j<l;j++)for(int k=0;k<m;k++)c[i][j]+=a[i][k]*b[k][j];
        for(int i=0;i<n;i++){
            for(int j=0;j<l;j++){
                if(j>0)System.out.print(" ");
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
        scan.close();
    }
}