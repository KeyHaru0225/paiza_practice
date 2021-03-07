//charAtを使って検索回して、ansに格納出力って考えたけどどう書けばよいか分からんかった…

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        String T = sc.nextLine();
        
        int ans = 0;
        while(true){
        if(T.indexOf(W)>=0){
            for(int i=0; i<T.length(); i++){
                char c = T.
            }
            ans += ans;
          }        
        }
   
        
    }
}


//わかった！！
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        W = W.toLowerCase();
        
        int ans = 0;
        while(true){
            String T = sc.next();
            
            if(T.equals("END_OF_TEXT")) break;
            T = T.toLowerCase();
            if(T.equals(W)) ans++;
        }
        System.out.println(ans);
    }
}











//誰かの答え
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String W=scan.next();
        W=W.toLowerCase();
        int ans=0;
        while(true){
            String T=scan.next();
            if(T.equals("END_OF_TEXT"))break;
            T=T.toLowerCase();
            if(T.equals(W))ans++;
        }
        System.out.println(ans);
        scan.close();
    }
}