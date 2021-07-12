package java01;

public class Class1dat4 {

	public static void main(String [] args) {
		
		System.out.println("=== Test8 Start ===");
		
		//물건값의 합계
		int price;
		//손님이 낸 돈
		int money; 
		//거스름돈
		int don;
		
		price = 65780;
		money = 78900;
		
		don = money-price;
		
		//물건 값의 합계보다 손님이 낸 돈이 더 많다는 가정. 
		//1.물건 값의 합계, 손님이 낸 돈 ,  거스름돈 출력
		
		System.out.println("Price :" + price);
		System.out.println("Money :" + money);
		System.out.println("거스름돈 :" + don);
		
		//만원짜리 갯수를 담을 변수
		int man;
		//1천원 짜리 갯수를 담을 변수
		int cheon;
		//1백원 짜리 갯수를 담을 변수
		int back;
		//십원짜리 갯수를 담을 변수 
		int sip;
		
		man = don/10000;
		/* 이건 내 방법
		 * cheon = don/1000-man*10;
		back = don/100 - cheon*10-man*100;
		sip = don/10 - back*10 - cheon*100-man*1000;
		*/
		
		/* 선생님 방법1
		cheon = (don-(man*10000))/1000;
		back = (don-(man*10000)-(cheon*1000))/100;
		sip = (don-(man*10000)-(cheon*1000)-(back*100))/10;
		*/
		
		cheon=(don % 10000)/1000;
		back=(don % 1000)/100;
		sip=(don % 100)/10;
		
		System.out.println("만원 :" + man + "장");
		System.out.println("천원 :" + cheon + "장");
		System.out.println("백원 :" + back + "개");
		System.out.println("십원 :" + sip + "개");
		
		
		
		
	}
	
	
}
