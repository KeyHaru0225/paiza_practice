// ABC201 A.Tiny Arithmetic Sequence

// わかるようでわからん
import java.io.BuffredReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[]) throws IOException {
    	try(BufferedReader br = new BuffeReader(new InputStreamReader(System.in))) {
        	String in = br.readLine();
          
          String chr[] = in.split(" ");
          int a1 = Integer.parseInt(chr[0]);
          int a2 = Integer.parseInt(chr[1]);
          int a3 = Integer.parseInt(chr[2]);
          
          if()
        }
    }
}




// 誰かの答え1  106ms
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        if (list.get(1) * 2 == list.get(0) + list.get(2)) {
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}