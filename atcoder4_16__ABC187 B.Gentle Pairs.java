// ABC187 B.Gentle Pairs
 

// RE 84ms/32,720KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
                        String[] X = br.readLine().split(" ");
                        String[] Y = br.readLine().split(" ");
                        int count = 0;
          
            for(int i=0; i<n; i++){
            	int x = Integer.parseInt(X[i]);
                int x1 = Integer.parseInt(X[i+1]);
                int y = Integer.parseInt(Y[i]);
                int y1 = Integer.parseInt(Y[i+1]);
              if( -1 <= (double) (y1-y)/(x1-x) && (double) (y1-y)/(x1-x) <= 1) {
              	count ++;
              } else {
              	continue;
              }
            }
          
          System.out.println(count);
          
        }
    }
}


// 誰1 216ms/38,388KB
import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double x[] = new double[N];
    double y[] = new double[N];

    for (int i=0;i<N;i++) {
      x[i]=sc.nextDouble();
      y[i]=sc.nextDouble();
    }

    int count = 0;

    for (int i=0;i<N-1;i++) {
      for (int j=i+1;j<N;j++) {
        double kata = (y[j]-y[i])/(x[j]-x[i]);
        if(kata>=-1 && kata<=1){
          count++;
        }
      }
    }

    System.out.println(count);
  }
}


// 誰1真似ようとして分からんくなったorz
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
                        String[] X = br.readLine().split(" ");
                        String[] Y = br.readLine().split(" ");

                        int count = 0;
          
            for(int i=0; i<n; i++){
            	double x = Integer.parseDouble(X[i]);
                double y = Integer.parseDouble(Y[i]);
            }

            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                double kata = 
            }
              
for (int i=0;i<N-1;i++) {
      for (int j=i+1;j<N;j++) {
        double kata = (y[j]-y[i])/(x[j]-x[i]);
        if(kata>=-1 && kata<=1){
          count++;
             
            }
          
          System.out.println(count);
          
        }
    }
}


// 誰2 89ms/26,716KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;


public class Main {


	public static void main(String[]args) {
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int [][] points = new int[n][2];
		for (int i = 0; i < n; i++) {
			points[i][0] = sc.nextInt();
			points[i][1] = sc.nextInt();
		}

		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				double slope = (double)(points[j][1] - points[i][1]) / (points[j][0] - points[i][0]);
				if (slope >= -1 && slope <= 1)
					count++;
			}
		}
		out.println(count);
		out.flush();

	}


}



class FastReader {

	BufferedReader br;
	StringTokenizer st;

	public FastReader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {
		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException  e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {
		return Integer.parseInt(next());
	}

	long nextLong() {
		return Long.parseLong(next());
	}

	double nextDouble() {
		return Double.parseDouble(next());
	}

	String nextLine() {
		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

}


// 誰3 98ms/26,980KB
import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	int[] x, y;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		x = new int[N];
		y = new int[N];
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			x[i] = Integer.parseInt(tokens[0]);
			y[i] = Integer.parseInt(tokens[1]);
		}
	}

	void calc() {
		int count = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				if (Math.abs(y[j] - y[i]) <= Math.abs(x[j] - x[i])) {
					++count;
				}
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}
}

