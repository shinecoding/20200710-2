package bcs.day04;

import java.util.Arrays;

public class TryArray02 {

	public static void main(String[] args) {
		
		//����2) lotto��� �̸��� ������ �迭(ũ��=6)�� �����Ͽ� 
		//for~each������ ���� ����ϰ�,
		//java.util.Arrays Ŭ������ parallelSort��� �޼ҵ带 Ȱ���Ͽ�
		//�迭�� ������ �� �Ŀ� �ٽ� for~each������ ���� ����Ͽ� �������� �����ĸ� ���� ������.
		//��: 25 33 45 27 9 12 (������) 
		//    9 12 25 27 33 45 (������)
		int[] lotto = {25,33,45,27,9,12};
		for(int lo: lotto) {
			System.out.print(lo + " ");
		}
		System.out.println();
		Arrays.parallelSort(lotto);
		for(int lo: lotto) {
			System.out.print(lo + " ");
		}
	
	}//main end

}//class end
