// ABC136 A.Transfer

// WA1つ　たぶん負の数を考慮してなかったから
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
            int c = Integer.parseInt(chr[2]);
           
            System.out.println(c+b-a);
        }
    }
}


// 正解　87ms/32,432KB
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
            int c = Integer.parseInt(chr[2]);
           
            int ans = c+b-a;
          
            if(ans>0){
            	System.out.println(ans);
            } else {
                System.out.println(0);
　　　　　　}
           
        }
    }
}


// 誰かの答え1 77ms/32,396KB

//stan hu tao
//join nct ridin by first year culture reps
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;

public class Main
{
    public static void main(String hi[]) throws Exception
    {
        BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(infile.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int res = C-(N-M);
        System.out.println(max(res, 0));
    }
    public static int[] readArr(int N, BufferedReader infile, StringTokenizer st) throws Exception
    {
        int[] arr = new int[N];
        st = new StringTokenizer(infile.readLine());
        for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        return arr;
    }
}