package bcs.day01;

public class LogicalTest {

	public static void main(String[] args) {
		int charCode = '0';

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("�빮�ڱ���");
		}

		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("�ҹ��ڱ���");
		}

		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9���ڱ���");
		}

		int value = 9;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� ����α���");
		}

		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� ����̱���");
		}

	}

}
