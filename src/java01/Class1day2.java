package java01;

public class Class1day2 {

	public static void main(String [] args) {
		System.out.println("=== Test6 start ===");

		// 5 = int 4����Ʈ
		// 3.12 = double   8����Ʈ 
		// 5+3.12 = double (�ڵ�����ȯ) 
		
		int num = 5; 
		double num2 = 3.12; 
		num = (int)(num + num2); 
		
		System.out.println("NUM :" +num);
		
		//������ -> 0~100��
		int kor = 63; 
		int eng = 35;
		int math = 53; 
		// ������ ����ؼ� ���� ��� 
		
		int total = kor + eng + math;
		System.out.println("Total : "+ total);
		
		//����� ����ؼ� ��� ���
		//50.0 ����
		double avg = (double)total / 3;  //�ڵ�����ȯ
		System.out.println("Avg :"+ avg);
		
		double num3 = 5.124; 
		int result = (int)num3 ; 
		
		System.out.println(result);

		
	}
	
}
