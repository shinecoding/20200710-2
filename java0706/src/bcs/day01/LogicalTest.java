package bcs.day01;

public class LogicalTest {

	public static void main(String[] args) {
		int charCode = '0';

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요");
		}

		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자군요");
		}

		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9숫자군요");
		}

		int value = 9;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수인구요");
		}

		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수이군요");
		}

	}

}
