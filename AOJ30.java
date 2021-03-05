//わかるようでわからん
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n == 0) break;
        int ans;
    }
}


import java.util.Scanner;

public class Main{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String x = sc.next();
            if(x.equals("0")) break;
            
            int ans = 0;
            for(int i=0; i<x.length(); i++){
                char c = x.charAt(i);
                ans += c-'0';
            }
            System.out.println(ans);
        }
        sc.close();
    }
}










import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
            String x =scan.next();
            if(x.equals("0"))break;
            int ans=0;
            for(int i=0;i<x.length();i++){
                char c=x.charAt(i);
                ans+=c-'0';
            }
            System.out.println(ans);
        }
        scan.close();
    }
}