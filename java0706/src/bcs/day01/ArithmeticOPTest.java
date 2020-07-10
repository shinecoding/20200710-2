package bcs.day01;

public class ArithmeticOPTest {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("(++a + ++a)의 결과는 : " + (++a + ++a));
		a = 10;
		System.out.println(("(++a - ++a)의 결과는 : " + (++a - ++a)));
		a = 10;
		System.out.println("(a++ + a++)의 결과는 : " + (a++ + a++));
		a = 10;
		System.out.println("(a++ - a++)의 결과는 : " + (a++ - a++));
		a = 10;
		System.out.println("(++a + a++)의 결과는 : " + (++a + a++));
		a = 10;
		System.out.println("(++a + a++)의 결과는 : " + (++a - a++));
		a = 10;
		System.out.println("(a++ + ++a)의 결과는 : " + (a++ + ++a));
		a = 10;
		System.out.println("(a++ - ++a)의 결과는 : " + (a++ - ++a));
		
	}
}
