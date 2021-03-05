import java.util.Scanner;
import java.lang.Character;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine;
        
        switch(str) {
            case Character.toUpperCase(str):
                System.out.println(Character.toLowerCase(str));
                break;
            
            case Character.toLowerCase(str):
                System.out.println(Character.toUpperCase(str));
                break;

        }
    }
}


//wrong answer
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i < line.length(); i++) {
            char now = line.charAt(i);
            if(Character.isUpperCase(now)) {
                sb.append(Character.toLowerCase(now));
            } else if(Character.isLowerCase(now)) {
                sb.append(Character.toUpperCase(now));
            } else {
                sb.append(now);
            }
            System.out.println(sb);
        }
    }
}













import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < line.length() ; i++){
            char now = line.charAt(i);
            if(Character.isUpperCase(now))      sb.append(Character.toLowerCase(now));
            else if(Character.isLowerCase(now)) sb.append(Character.toUpperCase(now));
            else                                sb.append(now);
        }

        System.out.println(sb);

    }
}














import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if('a'<=c&&c<='z'){
                c+='A'-'a';
            }
            else if('A'<=c&&c<='Z'){
                c+='a'-'A';
            }
            ans+=String.valueOf(c);
        }
        System.out.println(ans);
        scan.close();
    }
}