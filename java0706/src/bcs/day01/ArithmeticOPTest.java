package bcs.day01;

public class ArithmeticOPTest {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("(++a + ++a)�� ����� : " + (++a + ++a));
		a = 10;
		System.out.println(("(++a - ++a)�� ����� : " + (++a - ++a)));
		a = 10;
		System.out.println("(a++ + a++)�� ����� : " + (a++ + a++));
		a = 10;
		System.out.println("(a++ - a++)�� ����� : " + (a++ - a++));
		a = 10;
		System.out.println("(++a + a++)�� ����� : " + (++a + a++));
		a = 10;
		System.out.println("(++a + a++)�� ����� : " + (++a - a++));
		a = 10;
		System.out.println("(a++ + ++a)�� ����� : " + (a++ + ++a));
		a = 10;
		System.out.println("(a++ - ++a)�� ����� : " + (a++ - ++a));
		
	}
}
