package bcs.day05;

import java.util.Scanner;

public class Method04 {

	public static int add(int x, int y) {
		int result;
		result = x+y;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ΰ��� �Է��ϼ���: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = add(a,b);
		System.out.println(a + "+" + b + "=" + c);
		sc.close();
		
	}//main end

}//class end
