package java01;

public class Class1dat4 {

	public static void main(String [] args) {
		
		System.out.println("=== Test8 Start ===");
		
		//���ǰ��� �հ�
		int price;
		//�մ��� �� ��
		int money; 
		//�Ž�����
		int don;
		
		price = 65780;
		money = 78900;
		
		don = money-price;
		
		//���� ���� �հ躸�� �մ��� �� ���� �� ���ٴ� ����. 
		//1.���� ���� �հ�, �մ��� �� �� ,  �Ž����� ���
		
		System.out.println("Price :" + price);
		System.out.println("Money :" + money);
		System.out.println("�Ž����� :" + don);
		
		//����¥�� ������ ���� ����
		int man;
		//1õ�� ¥�� ������ ���� ����
		int cheon;
		//1��� ¥�� ������ ���� ����
		int back;
		//�ʿ�¥�� ������ ���� ���� 
		int sip;
		
		man = don/10000;
		/* �̰� �� ���
		 * cheon = don/1000-man*10;
		back = don/100 - cheon*10-man*100;
		sip = don/10 - back*10 - cheon*100-man*1000;
		*/
		
		/* ������ ���1
		cheon = (don-(man*10000))/1000;
		back = (don-(man*10000)-(cheon*1000))/100;
		sip = (don-(man*10000)-(cheon*1000)-(back*100))/10;
		*/
		
		cheon=(don % 10000)/1000;
		back=(don % 1000)/100;
		sip=(don % 100)/10;
		
		System.out.println("���� :" + man + "��");
		System.out.println("õ�� :" + cheon + "��");
		System.out.println("��� :" + back + "��");
		System.out.println("�ʿ� :" + sip + "��");
		
		
		
		
	}
	
	
}
