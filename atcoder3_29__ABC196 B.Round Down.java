// ABC196 B.Round Down

// 不正解
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
          	String in = br.readLine();
          
            String chr[] = in.split(" ");
            double x = Integer.parseDouble(chr[0]);
          
            System.out.println((int)Math.floor(x));
          
        }
    }
}


// WA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
          	String in = br.readLine();
          
            String chr[] = in.split(" ");
            double x = Double.parseDouble(chr[0]);
          
            System.out.println((int)Math.floor(x));
          
        }
    }
}

// WA　わからん！無理！！
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
          	String in = br.readLine();
          
            String chr[] = in.split(" ");
            double x = Double.parseDouble(chr[0]);
            BigDecimal bd = new BigDecimal(String.valueOf(x));
            BigDecimal bd1 = bd.setScale(0, RoundingMode.DOWN);
                  
            System.out.println(bd1.toPlainString());
          
        }
    }
}


// 誰かの答え1
import java.math.BigDecimal;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        BigDecimal x = new BigDecimal(s);
        System.out.println(x.setScale(0, BigDecimal.ROUND_DOWN));
    }
}


// 誰かの答え2
import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
		String x = sc.next();
 
		if(x.indexOf(".") == -1){
			System.out.println(x);
		}else{
			System.out.println(x.substring(0, x.indexOf(".")));
		}
	}
}