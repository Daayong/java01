package java01;

import java.util.Scanner;

public class Class1day6 {

	public static void main(String [] args) {
		
		System.out.println("=== Test10 Start ===");
		
		//0 -> 0
		//1 -> 1
		//2 -> 2
		//3 -> 3
		//4 -> 10
		//5 -> 11
		//6 -> 12
		//7 -> 13
		//8 -> 20
		//12 -> 30
		//13 -> 31
		//17 -> 41
		
		// ���� -���ϴ� �� 
		// ���� ���� - ������Ÿ�� ������
		//class ���� �빮��, ������ �޼���� �ҹ���
		// java�� �ʿ��� �� ���� ���𰡴�, c��� ���� ���� ���� ������ �� ���� �����ؾ��� 
		
		//���α׷� �����߿� �����͸� Ű����κ��� �Է¹��� �غ� 
		Scanner sc = new Scanner(System.in);
		
		int input = 12; 
		int output = 0; 
		
		System.out.println("���ڸ� �Է��ϼ���");
		input = sc.nextInt();
		output = input/4*10+input%4; 
		
		System.out.println("Input : "+input);
		System.out.println("Output : "+output);
		
	}
	
	
}
