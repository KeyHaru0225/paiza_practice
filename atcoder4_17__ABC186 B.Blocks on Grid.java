// ABC186 B.Blocks on Grid


// ここまでは頑張った
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int h = Integer.parseInt(chr[0]);
            int w = Integer.parseInt(chr[1]);
            String[] A = br.readLine().split(" ");
            
          
            for(int i=0; i<h; i++){
              int line = Integer.parseInt(A[i]);
            	for(int j=0; j<w; j++){
                	int column = Integer.parseInt(A[j]);
                }
            }
          
            if()
        }
    }
}


// 誰1 298ms/57,164KB
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String str  = scan.nextLine();
      String[] num = str.split(" ");
        int H = Integer.parseInt(num[0]);
        int W = Integer.parseInt(num[1]);
      String[] data = new String[H];
      for(int i=0; i<H; i++){
        data[i] = scan.nextLine();
      }
      int min = 101;
      int[][] box = new int[H][W];
      for(int i=0; i<H; i++){
        for(int j=0; j<W; j++){
          String[] temp = data[i].split(" ");
          box[i][j] = Integer.parseInt(temp[j]);
          if(box[i][j]<min){
            min = box[i][j];
          }
        }
      }
// minが確定して、これから全部引き算する
      int result = 0;
      for(int i=0; i<H; i++){
          for(int j=0; j<W; j++){
            result = result + (box[i][j]-min);
          }
        }
      System.out.println(result);
  }
}



// 誰2 191ms/46,244KB
import java.util.*;
 
class Main{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int h = sc.nextInt();
      	int w = sc.nextInt();
      
      	int cnt = h * w;
      	int a[] = new int[cnt];
      	int min = 100, i;
      	for(i=0; i<cnt; i++) {
        	a[i] = sc.nextInt();
          	if(min > a[i]) {
              min = a[i];
            }
        }
      	int total = 0;
      	for(i=0; i<cnt; i++) {
        	if(a[i] == min) {
              continue;
            }else {
              total += a[i] - min;
            }
        }
      	System.out.println(total);
    }
}


// 誰3 188ms/45,768KB
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][]arr=new int[n][m];
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
				min=Math.min(min,arr[i][j]);
			}
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum=sum+arr[i][j]-min;
			}
		}
		System.out.println(sum);
	}

}
