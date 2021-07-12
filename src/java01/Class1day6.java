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
		
		// 변수 -변하는 수 
		// 변수 선언 - 데이터타입 변수명
		//class 명은 대문자, 변수나 메서드는 소문자
		// java는 필요할 때 변수 선언가능, c언어 같은 예전 언어는 무조건 맨 위에 선언해야함 
		
		//프로그램 실행중에 데이터를 키보드로부터 입력받을 준비 
		Scanner sc = new Scanner(System.in);
		
		int input = 12; 
		int output = 0; 
		
		System.out.println("숫자를 입력하세요");
		input = sc.nextInt();
		output = input/4*10+input%4; 
		
		System.out.println("Input : "+input);
		System.out.println("Output : "+output);
		
		//Github 사용하기
		//Code 추가
		//새로운 코드가 추가
	}
	
	
}
