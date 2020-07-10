package bcs.day04;

import java.util.ArrayList;

public class TryArray07 {

	public static void main(String[] args) {
		//문제) 로또 번호 추첨기를 만들려고 합니다. 
		//	   정수 6개가 들어가는 lotto라는 이름의 배열을 생성하고
		//	  Math.random으로 1~45 사이의 숫자를 랜덤으로 발생시켜 차례로 배열에 넣고 
		//    탭만큼 띄워서 출력하세요. 
		//	  예: 20		5		1		18		32		30   
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i=0; i<7; i++) {
			int rand = (int) (Math.random() * 45 + 1);
			lotto.add(rand);
			System.out.print(lotto.get(i) + "\t");
		}

		
	}//main end

}//class end
