// ABC96 A.Day of Takahashi


// わからんくなった
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
          
            int count = 0;
          
            for(int i=1; i<13; i++){
            	for(int j=1; j<32; j++){
                	if()
                }
            }
        }
    }
}


// 誰2を参考にしたら正解　79ms/32,424KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int a = Integer.parseInt(chr[0]);
			int b = Integer.parseInt(chr[1]);
          
            if(a > b){
            	System.out.println(a - 1);
            } else {
            	System.out.println(a);
            }
          
        }
    }
}



// 誰1 93ms/27,016KB
import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		do {
			a = input.nextInt();
			b = input.nextInt();
		}while(a < 1 || a > 12 || b < 1 || b > 31);
		if(a <= b) {
			System.out.println(a);
		}else {
			System.out.println(a - 1);
		}
	}
}


// 誰2 119ms/35,212KB
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}