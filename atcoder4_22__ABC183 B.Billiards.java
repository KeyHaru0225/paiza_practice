// ABC183 B.Billiards

// 答え見ても分からん。疲れた。

//　誰　109ms/27,148KB
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int gx = sc.nextInt();
		int gy = sc.nextInt();
		sc.close();

		sy = -sy;
		int dy = gy - sy;
		double ans = sx + (double) (gx - sx) * -sy / dy;
		System.out.println(ans);
	}
}

// 誰
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float sx = sc.nextFloat();
        float sy = sc.nextFloat();
        float gx = sc.nextFloat();
        float gy = sc.nextFloat();
        
        System.out.println(sx - sy * (gx - sx)/(-gy - sy));
    }
}