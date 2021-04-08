// ABC192 B.uNrEaDaBIE sTrInG

// わかるようなわからんような…
// 答え見たらまだ分かりやすい問題やってわかった
import java.util.Scanner;
import java.io.StringBuilder;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	StringBuilder result = new StringBuilder();
      
      if(){
        for(int i = 0; i < sc.length(); i += 2){
        	result.append(sc.charAt(i));
   　　 }
      }
    }
}


// 誰かの答え1
import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); 
		int ErrorNum = 0;
		
		if(S.length() > 1000){

			System.out.println("Error!");
		}else{

			for(int i = 0 ; i < S.length() ; i++){
			
				if(i % 2 != 0){
					if(Character.isUpperCase(S.charAt(i)) == false){			

						ErrorNum ++;
					}

				}else if(i % 2 == 0 ){
					if(Character.isUpperCase(S.charAt(i)) == true){

						ErrorNum ++;
					}

				}else{
				}
			}

			if(ErrorNum == 0){

				System.out.println("Yes");

			}else{
			
				System.out.println("No");

			}
		}

	}
}


// 誰かの答え2
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = bf.readLine();
            for(int i = 0; i < line.length(); i++){
                if((i+1)%2 == 0 && !Character.isUpperCase(line.charAt(i))){
                    System.out.println("No");
                    return;
                }
                else if((i+1)%2 != 0 && Character.isUpperCase(line.charAt(i))){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
