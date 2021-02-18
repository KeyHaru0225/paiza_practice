import java.lang.*;
import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i <1000; i++) {
            sb.append("Hello World\n");
        }
        String s = sb.toString();
    }
}



import java.lang.*;


public class Main{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i <1000; i++) {
            sb.append("Hello World\n");
        }
        System.out.print(sb.toString());
    }
}






public class Main {

	public static final int BIG_NUM  = 2000000000;
	public static final int MOD  = 1000000007;

	public static void main(String[] args) {

		StringBuilder ans = new StringBuilder();

		for(int i = 0; i < 1000; i++){
            ans.append("Hello World\n");
        }
		System.out.print(ans.toString());
	}
}