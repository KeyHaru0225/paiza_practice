// ABC198 C.ABC Tournament


// 問題文は分かった


// よくわからんけど、誰2のまねしたら正解した 195ms/43,192KB
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
 
			String in = br.readLine();

			String chr[] = in.split(" ");
			int n = Integer.parseInt(chr[0]);
            int people = (int) Math.pow(2,n);
            String[] strArray = br.readLine().split(" ");
            int[] intArray = new int[people];
           
            int max = 0;
            int second_max = 0;
            int maxIndex = 0;
            int second_maxIndex = 0;
            int halfIndex = people/2;
		
          for(int i=0; i<people; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
            if(max < intArray[i]){
            	max = intArray[i];
                maxIndex = i;
            }
          }
            
            if(maxIndex < halfIndex){
            	for(int i=halfIndex; i < people; i++){
                	if(second_max < intArray[i]){
                    	second_max = intArray[i];
                        second_maxIndex = i;
                    }
                }
            } else {
            	for(int i=0; i<halfIndex; i++){
                	if(second_max < intArray[i]) {
                    	second_max = intArray[i];
                        second_maxIndex = i;
                    }
                }
            }
          
          System.out.println(second_maxIndex + 1);
          
          
        }
    }
}


// 誰1　372ms/57,184KB
import java.util.Scanner;
import java.util.*;

class Main
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num = (int)Math.pow(2,n);
        int a[] = new int[num]; 

        for(int i=0; i<num; i++){
            a[i] = scan.nextInt();
        }
        int r = 0;
        int l = num/2;

        for(int i=0; i<num/2; i++){
            r = (a[i]>a[r]) ? i : r;
            l = (a[num/2+i]>a[l]) ? num/2+i : l;
        }
        int ans = (a[r]>a[l]) ? l+1 : r+1;
        System.out.println(ans);
    }
}

// 誰2　201ms/43,036KB

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) throws IOException {

    	InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
	    String line = in.readLine();
	    int N = Integer.parseInt(line);
	    int peple = (int) Math.pow(2, N);
	    String[] strArray = in.readLine().split(" ");
	    int[] intArray = new int[peple];
	    int max = 0;
	    int secndMax = 0;
	    int maxIndex = 0;
	    int secndMaxIndex = 0;
	    int halfIndex = peple/2;

	    for(int i = 0; i < peple; i++) {
	    	intArray[i] = Integer.parseInt(strArray[i]);
	    	if(max < intArray[i]) {
	    		max = intArray[i];
	    		maxIndex = i;
	    	}
	    }

	    if(maxIndex <  halfIndex) {
	    	for(int i = halfIndex; i < peple; i++) {
		    	if(secndMax < intArray[i]) {
		    		secndMax = intArray[i];
		    		secndMaxIndex = i;
		    	}
		    }
	    } else {
	    	for(int i = 0; i < halfIndex; i++) {
		    	if(secndMax < intArray[i]) {
		    		secndMax = intArray[i];
		    		secndMaxIndex = i;
		    	}
	    	}
	    }

	    System.out.println(secndMaxIndex + 1);
    }
}