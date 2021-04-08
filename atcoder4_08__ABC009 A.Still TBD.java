// ABC009 A.Still TBD

// CE
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws Exception{
    	SimpleDateFormat f = new SimpleDateFormat("yyy/mm/dd");
        Date d = f.parse("2019/04/30");
      
        if(f.before(d) || f.equals(d)){
        	System.out.println("Heisei");
        } else {
        	System.out.println("TBD");
        }
      
    }
}


// WA
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws Exception{
        Date now = new Date();
    	SimpleDateFormat f = new SimpleDateFormat("yyy/mm/dd");
        Date d = f.parse("2019/04/30");
      
        if(now.before(d) || now.equals(d)){
        	System.out.println("Heisei");
        } else {
        	System.out.println("TBD");
        }
      
    }
}

// WA
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws Exception{
        Date now = new Date();
    	SimpleDateFormat f = new SimpleDateFormat("yyy/mm/dd");
        Date d = f.parse("2019/04/30");
      
        if(now.before(d) || now.equals(d)){
        	System.out.println("Heisei");
        } else if(now.after(d)) {
        	System.out.println("TBD");
        } else {
        	System.out.println("");
        }
      
    }
}


// 誰かの答え1 157ms/37,528KB
// これが私の考え方に近いかも
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Main{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  String s = scan.nextLine();
  String criteria = "2019/04/30";
  
  try{
   SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
   Date sdate = sdFormat.parse(s);
   Date scri = sdFormat.parse(criteria);
  
   if(sdate.after(scri)){
    System.out.println("TBD");
   } else {
    System.out.println("Heisei");
   }
  } catch (ParseException e) {
            e.printStackTrace();
  }
 }
}


// WA
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

public class Main{
	public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String criteria = "2019/04/30";
      
      try{
    	SimpleDateFormat f = new SimpleDateFormat("yyy/mm/dd");
        Date d = f.parse(s);
        Date d_1 = f.parse(criteria);
      
        if(d.after(d_1)){
        	System.out.println("TBD");
        } else {
        	System.out.println("Heisei");
        }
        
        } catch (ParseException e) {
            e.printStackTrace();
      }
      
    }
}

// 誰かの答え2 112ms/35,496KB
import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    String [] s = sc.next().split("/");

      if (Integer.parseInt(s[0]) >= 2019 && Integer.parseInt(s[1]) <= 04 && Integer.parseInt(s[2]) <= 30) {
        System.out.println("Heisei");
      } else {
        System.out.println("TBD");
      }
    sc.close();
    }
  }
