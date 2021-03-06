//コードがいまいち理解できていない
//while～がよくわからん

import java.util.Scanner;

public class Main{
    public static main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuiler();
        
        for(i=0; i<line.length(); i++) {
            char now = line.charAt(i);
            if(now.matches("[A-Z]" || "[a-z]")){
                System.out.printf("")
            }
        }
        
    }
}




import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int alf[]=new int[26];
        while(scan.hasNext()){
            String str=scan.next().toLowerCase();
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
                if('a'<=c&&c<='z'){
                    alf[str.charAt(i)-'a']++;
                }
            }
        }
        for(int i=0;i<26;i++)System.out.println((char)('a'+i)+" : "+alf[i]);
        scan.close();
    }
}



import java.util.Scanner;

public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int table[] = new int[128];

		for(int i = 0; i < table.length; i++){
			table[i] = 0;
		}

		StringBuilder sb = new StringBuilder();

		while(scanner.hasNext()){
			sb.append(scanner.nextLine());
		}

		String line = sb.toString();

		for(int i = 0; i < line.length(); i++){
			table[line.charAt(i)]++;
		}

		for(int i = 0; i < 26; i++){
			System.out.printf("%c : %d\n", 'a'+i,table['a'+i]+table['a'+i-32]);
		}
	}
}