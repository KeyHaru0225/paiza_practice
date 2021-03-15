// 問題D-ShippingCenter




//誰かの答え
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		List<Integer[]> wv = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			Integer[] luggage = new Integer[2];
			luggage[0] = sc.nextInt();
			luggage[1] = sc.nextInt();
			wv.add(luggage);
		}
 
		wv.sort((a, b) -> b[1] - a[1]);
		
		int[] boxes = new int[m];
		for(int i = 0; i < m; i++) {
			boxes[i] = sc.nextInt();
		}
		
		for(int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
		
			//利用できない箱に0を入れる
			int[] availableBoxes = boxes.clone();
			for(int j = l; j <= r; j++) {
				availableBoxes[j - 1] = 0;
			}
			
			//小さい箱から並べる
			Arrays.sort(availableBoxes);
			
				
			//箱に入る荷物でもっとも価値が高い荷物を入れる
			boolean[] usedBox = new boolean[m];
			int ans = 0;
			for(int x = 0; x < n; x++) {
				for(int y = 0; y < availableBoxes.length; y++) {
					if(wv.get(x)[0] <= availableBoxes[y] && !usedBox[y]) {
						ans += wv.get(x)[1]; 
						usedBox[y] = true;
						break;
					}
				}
			}
			System.out.println(ans);
		
		}
		
		sc.close();
	}
}