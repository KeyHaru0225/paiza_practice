//問題文がよくわからんかった



import java.util.Scanner;

public class Main{
    public static void main(Strin[] args){
        Scanner sc = new Scanner(System.in){
            
            while(true){
                int n = sc.nextInt();
                
                if(n % 3 != 0){
                    break;
                }
                
                for(int i =0; i <= n; i++){
                    System.out.print(" " + i);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}

import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i=1,n=sc.nextInt();
		while(i<=n){
			int x=i;
			if(x%3==0){
				System.out.printf(" %d",i);
			}else{
				while(x>=1){
					if(x%10==3){
						System.out.printf(" %d",i);
						break;
					}
					x/=10;
				}
			}
			i++;
		}
		System.out.printf("\n");
	}
};


















import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		do{
			int x = i;
			if(x%3 == 0){
				System.out.printf(" %d", i);
				continue;
			}
			do{
				if(x%10 == 3){
					System.out.printf(" %d", i);
					break;
				}
				x /= 10;
			}while(x > 0);
		}while( ++i <= n );
		System.out.printf("\n");
	}
}