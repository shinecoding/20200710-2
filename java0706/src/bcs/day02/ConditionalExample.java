package bcs.day02;

public class ConditionalExample {

	public static void main(String[] args) {

		int a = 5 - (int) (Math.random() * 10); // 0.0000<math.random()<0.99999
		if (args.length   > 0) {
			a = Integer.parseInt(args[0]);
		}

		int abs = (a >= 0) ? a : -a;
		System.out.println(a + "�� ���밪�� : " + abs);
	}

}
