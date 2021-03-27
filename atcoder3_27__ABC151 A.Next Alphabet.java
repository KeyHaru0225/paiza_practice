// ABC151 A.Next Alphabet

// 頭痛が酷くて頭が回らん…無理



// 誰かの答え1
import java.util.Scanner;
 
/**
 *
 * @author ITAGE-202101
 */
public class Main {
         public static void main(String[] args) {
        // TODO code application logic here
        String all = "abcdefghizklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int i = all.indexOf(a);
        System.out.println(all.charAt(i+1));
//        System.out.println(all[i+1].toString);
    }
}


//誰かの答え2
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0); //英小文字 C
        char ans = (char) (C + 1);
 
        System.out.println(ans);
    }
}