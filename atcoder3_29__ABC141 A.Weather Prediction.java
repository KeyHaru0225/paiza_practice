// ABC141 A.Weather Prediction

// 正解 85ms/32,368KB
// 下の人のif文を使ったら、74ms/32,112KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String s = br.readLine();
          
            switch(s){
              case "Sunny":
                System.out.println("Cloudy");
                break;
                
              case "Cloudy":
                System.out.println("Rainy");
                break;
                
              case "Rainy":
                System.out.println("Sunny");
                break;
            }
          
           
        }
    }
}


// 誰かの答え1 95ms/26,684KB
import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
 
          if(s.equals("Sunny")){
              System.out.println("Cloudy");
          }else if(s.equals("Cloudy")){
              System.out.println("Rainy");
          }else{
            System.out.println("Sunny");
          }
    }
}


// 誰かの答え2 122ms/35,632KB
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> datas = new HashMap<String, String>();
		
		datas.put("Sunny", "Cloudy");
		datas.put("Cloudy", "Rainy");
		datas.put("Rainy", "Sunny");
		
		String today = scan.nextLine();
		System.out.println(datas.get(today));
	}
	
}