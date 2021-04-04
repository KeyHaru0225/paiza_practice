// ABC130 A.Rounding

// 正解。三項条件演算子使った。 86ms/32,516KB
// 使わずif文の場合、           84ms/32,572KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
       		String in = br.readLine();
          
            String chr[] = in.split(" ");
            int x = Integer.parseInt(chr[0]);
			int a = Integer.parseInt(chr[1]);
          
          
            System.out.println(x<a ? "0" : "10");
        
        }
    }
}


// 誰かの答え 85ms/34,348KB
import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Main {
	static BufferedReader reader = new BufferedReader (new InputStreamReader (System.in) );

	public static void main(String [] args) throws IOException {
		int [] xa = Arrays.stream(reader.readLine().split(" "))
						   .mapToInt(Integer::parseInt)
						   .toArray();
		String result = (xa[0] < xa[1]) ? "0" : "10";
		System.out.println(result);
	}
}