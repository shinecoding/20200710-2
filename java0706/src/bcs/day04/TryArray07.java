package bcs.day04;

import java.util.ArrayList;

public class TryArray07 {

	public static void main(String[] args) {
		//����) �ζ� ��ȣ ��÷�⸦ ������� �մϴ�. 
		//	   ���� 6���� ���� lotto��� �̸��� �迭�� �����ϰ�
		//	  Math.random���� 1~45 ������ ���ڸ� �������� �߻����� ���ʷ� �迭�� �ְ� 
		//    �Ǹ�ŭ ����� ����ϼ���. 
		//	  ��: 20		5		1		18		32		30   
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i=0; i<7; i++) {
			int rand = (int) (Math.random() * 45 + 1);
			lotto.add(rand);
			System.out.print(lotto.get(i) + "\t");
		}

		
	}//main end

}//class end
