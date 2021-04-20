// ABC184 C.Supper Ryuma

// 問題文はわかった

//　誰1 116ms/35,572KB
import java.util.Scanner;

public class Main{
 
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = Math.abs(a - x);
		int c = Math.abs(b - y);
		int ans;
		
		if(r==0 && c==0) ans =0;
		  else if(r==c) ans =1;
		    else if(r + c <= 3) ans =1;
		      else if((r+c)%2== 0) ans =2;
		        else if(r+c <= 6) ans =2;
		          else if(r+c <= 3 || Math.abs(r-c) <= 3) ans =2;
			        else ans =3;
		
		System.out.println(ans);
  
	}
}

// 誰2 116ms/35,572KB
import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		if(a==c && b==d) {
			System.out.println("0");
		//| a - c | + | b - d | �� 3
		}else if(Math.abs(a-c) + Math.abs(b-d) <= 3) {
			System.out.println("1");
		}else {
			//a + b = c + d
			//a - b = c - d
			int dif1 = Math.abs((a+b) - (c+d));
			int dif2 = Math.abs((a-b) - (c-d));
			int minDif = Math.min(dif1, dif2);
			
			if(minDif == 0) {
				//�����ΐ���ɂ���a + b = c + d
				System.out.println("1");
			}else if(Math.abs(a-c) + Math.abs(b-d) <= 6) {
				//3�}�X�ȓ��̈ړ��@2��
				System.out.println("2");
			}else if(minDif <= 3) {
				//�����ΐ���ɂȂ��ꍇ
				//2��ɕ����ă}�X1����2
				//��������2�ׂ̗̃}�X�ɂ���
				System.out.println("2");
			}else if(minDif % 2 == 0) {
				System.out.println("2");
			}else {
				//����ȊO�̎�
				System.out.println("3");
			}
		}
	}
}