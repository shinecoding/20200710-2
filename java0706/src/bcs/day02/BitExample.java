package bcs.day02;

public class BitExample {

	public static void main(String[] args) {
		byte a = 5; // 00000101
		byte b = 3; // 00000011
		System.out.println(a & b);	// 00000001
		System.out.println(a | b);  	// 00000111
		System.out.println(a ^ b);	// 00000110
	}

}
