// ABC190 C.Bowls and Dishes

// 問題文がよくわからん


// 誰かの答え1 192ms/38,772KB
import java.util.*;
public class Main {

	static int[]count;
	static int[][]arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		arr=new int[m][2];
		count=new int[n+1];
		for(int i=0;i<m;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
			
		}
		int k=sc.nextInt();
		int[][]query=new int[k][2];
		int c=0;
		
		for(int i=0;i<k;i++) {
			query[i][0]=sc.nextInt();
			query[i][1]=sc.nextInt();
		}
		int sol=f(count,query,0);
		System.out.println(sol);
	}
	private static int f(int[] count, int[][] query, int idx) {
		// TODO Auto-generated method stub
		if(idx==query.length) {
			
			return check(count,arr);
		}
		count[query[idx][0]]++;
		int inca=f(count,query,idx+1);
		count[query[idx][0]]--;
		count[query[idx][1]]++;
		int incb=f(count,query,idx+1);
		count[query[idx][1]]--;
		return Math.max(inca, incb);
	}
	private static int check(int[] count, int[][] arr) {
		// TODO Auto-generated method stub
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(count[arr[i][0]]>0 && count[arr[i][1]]>0) {
				c++;
			}
		}
		return c;
	}

}


// 誰かの答え2 197ms/44,984KB

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] cond = new int[2][M];
        
        for(int i=0; i<M; i++) {
        	cond[0][i] = sc.nextInt();
        	cond[1][i] = sc.nextInt();
        }
        
        int K= sc.nextInt();
        int [][] way = new int[2][K];
        
        for(int i=0; i<K; i++) {
        	way[0][i] = sc.nextInt();
        	way[1][i] = sc.nextInt();
        }
        
        sc.close();
        
        
        int max =0;
        
        for(int i=0; i<Math.pow(2,K); i++) {
        	
        	boolean [] dish = new boolean[N];
        	int count =0;
        	for(int j=0; j<K; j++) {
        		int b = (i>>j)&1;
        			dish [way[b][j]-1] = true;
        	}
        	
        	for(int k=0; k<M; k++) {
        		if(dish[ cond[0][k]-1 ]==true && dish[ cond[1][k]-1 ] == true) {
        			count++;
        		}
        	}
        	
        	max = Math.max(max, count);
        	
        }
        
        System.out.println(max);
        
	}

}
