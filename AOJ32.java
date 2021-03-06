//分かりそうでわからん
//append()とtoString()使うんやろうなあと思ったけどそっからよおわからんくなったorz

import java.util.Scanner;

public class Main{
    public static void mai(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String p = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length; i++){
            for(int j=0; j<p.length; j++){
                   char now = s.charAt(i);
                   if(now.)
            }
        }
    }
}


//s += s(s = s+s)がよくわからん
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        String p=scan.next();
        s+=s;
        if(s.indexOf(p)>=0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}










//誰かの答え
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        String s1=s+s;
        String check=in.nextLine();
        if(s1.contains(check)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}




import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        String p=scan.next();
        s+=s;
        if(s.indexOf(p)>=0)System.out.println("Yes");
        else System.out.println("No");
        scan.close();
    }
}