

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int tmp, k;
		
		for(int i = 1; i < N; i++) {
			for(int j = 0; j < N - 1; j++) {
				System.out.print(A[j] + " ");
			}
			System.out.println(A[N - 1]);
			
			tmp = A[i];
			k = i - 1;
			
			while(k >= 0 && A[k] > tmp) {
				A[k + 1] = A[k];
				k--;
			}
			
			A[k + 1] = tmp;
		}
		
		for(int i = 0; i < N - 1; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println(A[N - 1]);
	}
}






public class ArgoSortInsert {
	public static void main(String[] args) {
		int[] data = { 30, 60, 70, 90, 20 };
		sort(data);
		for(int element : data){
			System.out.print(element + " ");
		}
	}
	public static void sort(int[] data) {
		for(int i = 1; i < data.length; i++){
			int tmp = data[i];
			int j = i;
			while(j > 0 && tmp < data[j - 1]){
				data[j] = data[j - 1];
				j--;
			}
			data[j] = tmp;
		}
	}
}





public class ArgoSortInsert {
	public static void main(String[] args) {
		int[] data = { 30, 60, 70, 90, 20 };
		sort(data);
		for(int element : data){
			System.out.print(element + " ");
		}
	}
	public static void sort(int[] data) {
		for(int i = 1; i < data.length; i++){
			int tmp = data[i];
			int j = i;
			while(j > 0 && tmp < data[j - 1]){
				data[j] = data[j - 1];
				j--;
			}
			data[j] = tmp;
		}
	}
}

























import java.util Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        //配列に値を格納していく
        //iが配列の添え字
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        
        sort(array);
        for(int element : array){
            System.out.print(element + " ");
        }
    }
    
  　//昇順にソートしていく
  　//intxは値の待避場所
  　//intkは配列array[]の空き要素の添え字
  　//array[0]は整列済みとして始めているのでi=1以降の未整列の配列を整列していく
  　public static void sort(int[] array){
  　    for(int i=1; i<array.length; i++){
  　        //intXに待避させる
  　        int X = array[i];
  　        //要素iが空き要素となったのでｋにiの添え字を代入(添え字kが空き要素を指す)
  　        int k = i;
  　        //待避させていたXの値とarray[k-1]の大小を比較
  　        while(k>0 && X<array[k-1]{
  　          　// Yes:昇順ソートなのでarray[k-1]とarray[i]の入れ替えを行う
  　            array[i] = array[k-1];
  　            //kの値を1減らし前方の配列も同様に整列していく
  　            //kが0になった場合は、array[0]まで整列済みなので、26行目for文に戻りi++して配列最後尾まで同様に繰り返す
  　            k--;
  　        }
  　       // No:Ｘの値の方が大きかったので、元あったarray[k]の位置に戻す。26行目for文に戻りi++して配列最後尾まで繰り返す 
  　       array[k] = X;
  　    }
  　}
    
}




10行目   for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }