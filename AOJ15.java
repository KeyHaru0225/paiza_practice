import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.printf()

       
    }
}




import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    　　
    　　while(true){
    　　    int a = sc.nextInt();
    　　  int b = sc.nextInt();
    　　  String op = sc.next();
    　　  
    　　  if(op.equals("?"))break;
    　　  
    　　  int ans = 0;
    　　  
    　　  switch(op){
             case"+":
                 ans = a + b;
                 break;
             case"-":
                 ans = a - b;
                 break;
             case"*":
                 ans = a * b;
                 break;
             case"/":
                 ans = a / b;
                 break;
    　　  }
    　　  
    　　  System.out.println(ans);
    　　  
    　　}
    }
}







import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true){

			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

			if(op.equals("?"))break;

			int ans = 0;

			switch(op){
			case "+":
				ans = a+b;
				break;
			case "-":
				ans = a-b;
				break;
			case "*":
				ans = a*b;
				break;
			case "/":
				ans = a/b;
				break;
			}

			System.out.println(ans);
		}
	}
}


