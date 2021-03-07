//わかるようでわからん
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        
        List<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<=h; i++){
            
        }
    }
}

//わかった
//substring1の「s」は両方とも小文字注意
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String s = sc.next();
            if(s.equals("-")) break;
            
            int m = sc.nextInt();
            for(int i=0; i<m; i++){
                int h = sc.nextInt();
                String le = s.substring(0,h);
                String ri = s.substring(h,s.length());
                s = ri + le;
            }
            System.out.println(s);
        }
        
        
        
    }
}




//誰かの答え
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
            String s=scan.next();
            if(s.equals("-"))break;
            int m=scan.nextInt();
            for(int i=0;i<m;i++){
                int h=scan.nextInt();
                String le=s.substring(0,h);
                String ri=s.substring(h,s.length());
                s=ri+le;
            }
            System.out.println(s);
        }
        scan.close();
    }
}