package bcs.day04;

import java.util.ArrayList;

public class TryArray06 {

	public static void main(String[] args) {
		//문제) 오늘 저녁에는 치킨, 족발, 피자, 짜장면, 보쌈 중에 하나를 배달시킬 예정입니다.
		//	      그런데 선택장애가 있어서 랜덤으로 메뉴를 정하는 프로그램을 짜보려고 해요.
		//	   menu 라는 배열을 하나 만들어서 위의 메뉴를 넣은 후,
		//	   Math.random으로 0~4 사이의 임의의 숫자를 발생시켜서
		//	   실행시켰을 때 랜덤으로 메뉴 하나를 출력시키도록 작성해 보세요.
		
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("치킨");
		menu.add("족발");
		menu.add("피자");
		menu.add("짜장면");
		menu.add("보쌈");
		int rand = (int) (Math.random()* 5);
		String meal = menu.get(rand);
		
//		String[] menu = {"치킨", "족발", "피자", "짜장면", "보쌈"};
//		int rand = (int) (Math.random()* 5);
//		String meal = menu[rand];
		System.out.println("오늘 저녁 메뉴는 "+ meal +"입니다." );
		
	}//main end

}//class end
