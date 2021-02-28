import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        
        int m,f <= 50;
        
    }
    if(m + f <= 80){
        System.out.println("A");
    } else if(m + f <=65 && m + f < 80){
        System.out.println("B");
    } else if(m + f <=50 && m + f < 65 || r <= 50){
        System.out.println("C");
    } else if(m + f <=30 && m + f < 50){
        System.out.println("D");
    } else(m + f < 30){
        System.out.println("F")
    }
    
    if(m == -1 && f == -1 && r == -1){
        System.out.println();
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buffer[] = new String[3];
		int array[] = new int[3];
		String ans;

		while(true){


			try {
				buffer = br.readLine().split("\\s+");
				for(int i = 0; i < buffer.length; i++){
					array[i] = Integer.parseInt(buffer[i]);
				}
				if(array[0] == -1 && array[1] == -1 && array[2] == -1)break;

				if(array[0] == -1 || array[1] == -1){
					ans = "F";
				}else if(array[0]+array[1] >= 80){
					ans = "A";
				}else if(array[0]+array[1] >= 65){
					ans = "B";
				}else if(array[0]+array[1] >= 50){
					ans = "C";
				}else if(array[0]+array[1] >= 30){
					if(array[2] >= 50){
						ans = "C";
					}else{
						ans = "D";
					}
				}else{
					ans = "F";
				}

				System.out.printf("%s\n", ans);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
            int m=scan.nextInt();
            int f=scan.nextInt();
            int r=scan.nextInt();
            if(m<0&&f<0&&r<0)break;
            String ans;
            if(m<0||f<0)ans="F";
            else if(m+f>=80)ans="A";
            else if(m+f>=65)ans="B";
            else if(m+f>=50)ans="C";
            else if(m+f>=30){
                if(r>=50)ans="C";
                else ans="D";
            }
            else ans="F";
            System.out.println(ans);
        }
        scan.close();
    }
}


