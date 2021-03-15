// C084
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        for(int i=0; i<S.length(); i++){
            System.out.print("+");
        }
        System.out.print("+"+"+");
        System.out.println();
        
        System.out.println("+" + S + "+");
        
        for(int j=0; j<S.length(); j++){
            System.out.print("+");
        }
        System.out.print("+"+"+");
        
    }
}

//B055
//　コンパイルエラー
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int P_1 = 0;
        int P_2 = 0;
        int ans = 0;
        
        for(i=0; i<=N; i++){
            if(a<=X){
            int P_1 = a;
            }else if(X>a){
                int ans = b+(c*d);
                int P_2 = Math.max(ans,P_2);
            }else{
                break;
            }
          }
           System.out.printf("%d %d\n",int P_1,int P_2);
        }
        
        
    }

//誰かの答え
import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] values = line.split("\\s");
        
        int numOfTaxi = Integer.parseInt(values[0]);
        int distance = Integer.parseInt(values[1]);
        int minCharge = 0;
        int maxCharge = 0;
        
        for (int i = 0; i < numOfTaxi; i++) {
            String[] taxiInfo = sc.nextLine().split("\\s");
            
            // <<-- default -->>
            int defaultDistance = Integer.parseInt(taxiInfo[0]);
            int defaultCharge = Integer.parseInt(taxiInfo[1]);
            
            // <<-- addition -->>
            int additionDistance = Integer.parseInt(taxiInfo[2]);
            int additionCharge = Integer.parseInt(taxiInfo[3]);
            
            // <<-- result -->>
            int additionResult = 0;
            int chargeResult = 0;
            
            // check distance
            if (distance >= defaultDistance) {
                int remainDistance = distance - defaultDistance;
                int additionCount = (remainDistance + additionDistance) / additionDistance;
                additionResult = additionCount * additionCharge;
            }
            
            chargeResult = defaultCharge + additionResult;
            
            // <<-- minCharge -->>
            if (minCharge == 0) {
                minCharge = chargeResult;
            } else if (minCharge > chargeResult) {
                minCharge = chargeResult;
            }
            
            // <<-- maxCharge -->>
            if (maxCharge == 0) {
                maxCharge = chargeResult;
            } else if (maxCharge < chargeResult) {
                maxCharge = chargeResult;
            }
        }
        System.out.println(minCharge + " " + maxCharge);
    }
}