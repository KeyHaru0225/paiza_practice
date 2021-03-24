// ABC159 A.The Number of Even Pairs

//うーん、わからん！
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
          String str = br.readLine();
          
          String chr[] = str.split(" ");
          int n = Integer.parseInt(chr[0]);
          int m = Integer.parseInt(chr[1]);
          
          int[] n_qua = new int[n.length()];
          int[] m_qua = new int[m.length()];
          
          int ans = 0;
          
          for(i=0; i<n.length; i++){
          	
          }
          
        }
    }
}



//正解
//答え2を見ながら
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
          String str = br.readLine();
          
          String chr[] = str.split(" ");
          int n = Integer.parseInt(chr[0]);
          int m = Integer.parseInt(chr[1]);
           
          int n_ans = 0;
          int m_ans = 0;
          
          for(int i=1; i<m; i++){
          	m_ans += i; 
          }
          
          for(int i=1; i<n; i++){
          	n_ans += i;
          }
          
          System.out.println(m_ans + n_ans);
          
        }
    }
}


//誰かの答え1
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(n * (n - 1) / 2 + m * (m - 1) / 2);
	}
}


//誰かの答え2
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
 
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int m_total = 0;
		int n_total = 0;
 
		for(int i = 1; i < m; i++) {
			m_total += i;
		}
 
		for(int i = 1; i < n; i++) {
			n_total += i;
		}
 
		System.out.println(m_total + n_total);
	}
}