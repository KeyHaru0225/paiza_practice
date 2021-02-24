import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Main{
    public static void main(Strign[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Map<String, Integer> card = new HashMap<String, Integer>();
        for(int i = 0; i<n; i++){
            int S = sc.nextInt();
            int H = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            card.put("S", S);
            card.put("H", H);
            card.put("C", C);
            card.put("D", D);
        }
    }
}





import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String suit ="SHDC";
        boolean[][] exist = new boolean[4][14];
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            String s = sc.next();
            int num = sc.nextInt();
            exist[suit.indexOf(s)][num] = true;
        }
        for(int i=0; i<4; i++){
            for(int j=1; j<=13; j++){
                if(!exist[i][j]){
                    System.out.println(suit.charAt(i) + " " + j);
                }
            }
        }
    }
}






