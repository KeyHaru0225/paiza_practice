// forからnをどう使えばよいかわからんくなった
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ansH = 0;
        int ansT = 0;　　//ここまであってた
        
        while(true){
            for(i=0; i<n; i++){
                String cardH = sc.next();
                String cardT = sc.next();
                
                if( cardH.indexOf(0) > cardT.indexOf(0) ) {
                    ansH += 3;
                    
                } else {
                    ansH ++;
                    ansT ++;
                }
                
            }
        }
    }

//誰かの答え
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int taro=0,hanako=0;
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            String s=scan.next(),t=scan.next();
            int val=s.compareTo(t);
            if(val>0)taro+=3;
            else if(val<0)hanako+=3;
            else{
                taro+=1;hanako+=1;
            }
        }
        System.out.println(taro+" "+hanako);
        scan.close();
    }
}


