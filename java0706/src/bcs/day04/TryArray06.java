package bcs.day04;

import java.util.ArrayList;

public class TryArray06 {

	public static void main(String[] args) {
		//����) ���� ���ῡ�� ġŲ, ����, ����, ¥���, ���� �߿� �ϳ��� ��޽�ų �����Դϴ�.
		//	      �׷��� ������ְ� �־ �������� �޴��� ���ϴ� ���α׷��� ¥������ �ؿ�.
		//	   menu ��� �迭�� �ϳ� ���� ���� �޴��� ���� ��,
		//	   Math.random���� 0~4 ������ ������ ���ڸ� �߻����Ѽ�
		//	   ��������� �� �������� �޴� �ϳ��� ��½�Ű���� �ۼ��� ������.
		
		ArrayList<String> menu = new ArrayList<String>();
		menu.add("ġŲ");
		menu.add("����");
		menu.add("����");
		menu.add("¥���");
		menu.add("����");
		int rand = (int) (Math.random()* 5);
		String meal = menu.get(rand);
		
//		String[] menu = {"ġŲ", "����", "����", "¥���", "����"};
//		int rand = (int) (Math.random()* 5);
//		String meal = menu[rand];
		System.out.println("���� ���� �޴��� "+ meal +"�Դϴ�." );
		
	}//main end

}//class end
