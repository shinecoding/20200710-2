package bcs.day04;

import java.util.ArrayList;

public class TryArray01 {

	public static void main(String[] args) {
		
		String[] city = new String[5];
		 city[0] = "서울";
		 city[1] = "도쿄";
		 city[2]= "베이징";
		 city[3]="뉴욕";
		 city[4]="하노이";
		 for(String a: city) {
			 System.out.print(a + " ");
		 }
		 
		 for(int i=0; i<city.length; i++) {
			 System.out.print(city[i] + " ");
		 }
		 
		System.out.println();
		
		 ArrayList<String> city2 = new ArrayList<String>();
		 city2.add("서울"); city2.add("도쿄"); city2.add("베이징"); city2.add("뉴욕"); city2.add("하노이");
		 for(String one: city2) {
		System.out.print(one + " ");	 
		 }
		 
		//문제1) city라는 이름의 크기 5짜리 배열을 생성하여, 
		//도시 이름으로 값을 넣어주고 (예: "서울", "도쿄", "베이징", "뉴욕", "하노이") 
		//for문과 for~each문을 각각 사용하여 배열을 출력하세요. 
		
	}//main end

}//class end
