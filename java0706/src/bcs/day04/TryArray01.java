package bcs.day04;

import java.util.ArrayList;

public class TryArray01 {

	public static void main(String[] args) {
		
		String[] city = new String[5];
		 city[0] = "����";
		 city[1] = "����";
		 city[2]= "����¡";
		 city[3]="����";
		 city[4]="�ϳ���";
		 for(String a: city) {
			 System.out.print(a + " ");
		 }
		 
		 for(int i=0; i<city.length; i++) {
			 System.out.print(city[i] + " ");
		 }
		 
		System.out.println();
		
		 ArrayList<String> city2 = new ArrayList<String>();
		 city2.add("����"); city2.add("����"); city2.add("����¡"); city2.add("����"); city2.add("�ϳ���");
		 for(String one: city2) {
		System.out.print(one + " ");	 
		 }
		 
		//����1) city��� �̸��� ũ�� 5¥�� �迭�� �����Ͽ�, 
		//���� �̸����� ���� �־��ְ� (��: "����", "����", "����¡", "����", "�ϳ���") 
		//for���� for~each���� ���� ����Ͽ� �迭�� ����ϼ���. 
		
	}//main end

}//class end
