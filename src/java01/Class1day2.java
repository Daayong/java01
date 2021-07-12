package java01;

public class Class1day2 {

	public static void main(String [] args) {
		System.out.println("=== Test6 start ===");

		// 5 = int 4바이트
		// 3.12 = double   8바이트 
		// 5+3.12 = double (자동형변환) 
		
		int num = 5; 
		double num2 = 3.12; 
		num = (int)(num + num2); 
		
		System.out.println("NUM :" +num);
		
		//국영수 -> 0~100점
		int kor = 63; 
		int eng = 35;
		int math = 53; 
		// 총점을 계산해서 총점 출력 
		
		int total = kor + eng + math;
		System.out.println("Total : "+ total);
		
		//평균을 계산해서 평균 출력
		//50.0 이유
		double avg = (double)total / 3;  //자동형변환
		System.out.println("Avg :"+ avg);
		
		double num3 = 5.124; 
		int result = (int)num3 ; 
		
		System.out.println(result);

		
	}
	
}
