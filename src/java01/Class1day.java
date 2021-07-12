package java01;

public class Class1day {

	public static void main(String[] args) {
		
		//형변환 수업
		
		int num1 = 3; 
		long num2 = 9L;
		
		System.out.println(num1);
		
		
		num1 = (int)num2;  //강제형변환
		
		System.out.println(num1);
		
		
		num1=3;
		
		//num2 = (long)num1;
		num2 = num1;   //자동형변환
		System.out.println(num2);
		
		/*
		 * 자동형변환
		 * - 작은것에서 큰것으로 변환
		 * - 형변환할 데이터 타입명은 생략가능 
		 * - 변환 했을때 데이터값의 변환이 없음
		 * */
		
		/*
		 * 강제형변환
		 * - 큰것으로 작은것으로 변환
		 * - 형변환 할 데이터 타입명은 생략 불가능
		 * - 변환 했을 때 데이터 값의 변환이 있을수 있음
		 * */
		
		char ch = 'a';
		int num3 = ch;  // int는 4바이트 , char는 2바이트 그래서 자동형변환
		
		System.out.println("num3 :" + num3); //아스키코드 표 활용하여 문자 1을 10진수로 변형시 49가 나옴 
		
		ch = (char)(num3+25);
		
		System.out.println("ch :" +ch);
		
		long num4 = 10L;
		float f1 = num4;  // long은 8바이트, float은 4바이트 이나 float은 소수점 사용 가능하여 , 표현할 수 있는 수의 개수가 더 많음.
		
		// byte < char,short < int < long < float < double
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
