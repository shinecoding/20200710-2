package bcs.day02;

public class IfTest {

	public static void main(String[] args) {
		//kor: �����, eng: �����, sum: �����հ�, avg: �������
		int kor=70, eng=71 , sum=0;
		double avg=0.0;
		String name="ȫ�浿";
		//���� 1. ������ �հ� ����� ���ϴ� ���� �ϼ��Ͻÿ�.
		sum=(kor+eng);
		avg=(double)sum/2;
		
		//����2. if���� ����ؼ� ����� 70�� �̻��̸� '���հ�', 0~69���� '�����'�̶�� �ȳ� �޽����� 
		// ����� ����ϼ���.  
		String msg = "�ȳ����� ���⿡ �ۼ�";
		//if...
		
//		if (avg >= 70) {
//			msg = "���հ�";
//		} else {
//			msg = "�����";
//		}
		msg =  (avg > 70)  ? "���հ�" : "�����" ; //3�׿����� ( ���ǽ� ) ? �� : ����;
		
		System.out.println("�̸�="+name);
		System.out.println("�հ�="+sum);
		System.out.println("���="+avg);
		System.out.println("���="+msg); //�հ�, ���հ� �ȳ� �޽��� ���
		
		
		

	}

}
