package bcs.day03;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//Ű����� ���ڸ� ���ڸ� �Է¹޾Ƽ� ������ ����� ����� ������. ��) 347 -> 743
		//while���� ����Ͽ� �ϼ��ϼ���.
		//��Ʈ: 347�� 10���� ���� �������� '7' �Դϴ�. 
		int a, cnt = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� ���ڸ� �Է��ϼ���:");
		int su = scan.nextInt();
        
		//�̰��� while�� �ۼ�
		int res;
		String added = "";
		scan.close();
		int num = su;
		
		while(num>0) {
			res = num%10;
			added +=String.valueOf(res);
			num/=10;
		}
		int ans = Integer.parseInt(added);
		System.out.print(ans);
	}// main end

}// class end
