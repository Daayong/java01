package java01;

public class Class1day3 {

	public static void main(String[] args) {
		
		
		System.out.println("=== Test7 Start ===");
		
		int kor = 56; 
		int eng = 65; 
		int math = 49; 
		
		//ÃÑÁ¡ 
		int total = kor + eng + math ; 
		//Æò±Õ
		double avg = total / 3.0;
		
		System.out.println("Total :" + total);
		System.out.println("Avg :" + avg); //56.666664
		
		avg = avg*100;
		int result = (int)avg;
		
		avg = result/100.0;
		
		
		kor = 100;
	
		System.out.println("Avg :" + avg); //56.66
		
	} 
}
