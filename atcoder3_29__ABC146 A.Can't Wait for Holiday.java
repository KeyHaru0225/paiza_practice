// ABC146 A.Can't Wait for Holiday

//正解
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String s = br.readLine();
          
            switch(s) {
              case "SUN":
                System.out.println(7);
                break;
              case "MON":
                System.out.println(6);
                break;
              case "TUE":
                System.out.println(5);
                break;
              case "WED":
                System.out.println(4);
                break;
              case "THU":
                System.out.println(3);
                break;
              case "FRI":
                System.out.println(2);
                break;
              case "SAT":
                System.out.println(1);
                break;
            }
          
        }
    }
}


// 誰かの答え1
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
 
class Main {
 
	public static void main(String[] args) throws Exception {
		
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
			
		String day = br.readLine();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("MON", 6);
		map.put("TUE", 5);
		map.put("WED", 4);
		map.put("THU", 3);
		map.put("FRI", 2);
		map.put("SAT", 1);
		map.put("SUN", 7);
		
		System.out.println(map.get(day));
			
	}
	
}



// 誰かの答え2
import java.io.BufferedReader;
 
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] dayy) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String day= br.readLine();
		
		
		int rsp=-1;
		
		 String []S= {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		
		
		int index=-1;
				for (int i = 0; i < S.length; i++) {
					
					if(S[i].equals(day)) {
						index=i;
						rsp=7-index-1;}
					if(day.contentEquals("SUN"))
						rsp=7;
							
				           }
				
		System.out.println(rsp);
		
	}
 
}