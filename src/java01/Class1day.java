package java01;

public class Class1day {

	public static void main(String[] args) {
		
		//����ȯ ����
		
		int num1 = 3; 
		long num2 = 9L;
		
		System.out.println(num1);
		
		
		num1 = (int)num2;  //��������ȯ
		
		System.out.println(num1);
		
		
		num1=3;
		
		//num2 = (long)num1;
		num2 = num1;   //�ڵ�����ȯ
		System.out.println(num2);
		
		/*
		 * �ڵ�����ȯ
		 * - �����Ϳ��� ū������ ��ȯ
		 * - ����ȯ�� ������ Ÿ�Ը��� �������� 
		 * - ��ȯ ������ �����Ͱ��� ��ȯ�� ����
		 * */
		
		/*
		 * ��������ȯ
		 * - ū������ ���������� ��ȯ
		 * - ����ȯ �� ������ Ÿ�Ը��� ���� �Ұ���
		 * - ��ȯ ���� �� ������ ���� ��ȯ�� ������ ����
		 * */
		
		char ch = 'a';
		int num3 = ch;  // int�� 4����Ʈ , char�� 2����Ʈ �׷��� �ڵ�����ȯ
		
		System.out.println("num3 :" + num3); //�ƽ�Ű�ڵ� ǥ Ȱ���Ͽ� ���� 1�� 10������ ������ 49�� ���� 
		
		ch = (char)(num3+25);
		
		System.out.println("ch :" +ch);
		
		long num4 = 10L;
		float f1 = num4;  // long�� 8����Ʈ, float�� 4����Ʈ �̳� float�� �Ҽ��� ��� �����Ͽ� , ǥ���� �� �ִ� ���� ������ �� ����.
		
		// byte < char,short < int < long < float < double
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
