// ABC200 A.Century

// WA
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.sp;it(" ");
            int n = Integer.parseInt(chr[0]);
          
            System.out.println(n/100);
          
        }
    }
}

// 82ms/32,408KB
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
    	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
            String chr[] = in.split(" ");
            int n = Integer.parseInt(chr[0]);
          
            if(n % 100 == 0){
            	System.out.println(n / 100);
            } else {
            	System.out.println(n / 100 + 1);
            }
          
        }
    }
}
 
// 1 125ms/35,752KB
By Vikas Chhonkar
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%100==0){
            System.out.println(n/100);
        }
        else{
            System.out.println(n/100+1);
        }
        sc.close();
    }
}


// 2 77ms/32,744KB
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String year = br.readLine().trim();
		int century = 0;
		
		if(year.length()<3) {
			century = 1;
		} else if (year.length()==3) {
			century = Integer.parseInt(year.substring(0, 1));
			if(!year.substring(2).equals("0")) {
				century ++;
			}
		} else {
			century = Integer.parseInt(year.substring(0, 2));
			if(!year.substring(2).equals("00")) {
				century ++;
			}
		}
		
		pw.print(century);
		
		br.close();
		pw.close();
	}

}