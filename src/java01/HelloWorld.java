package java01;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// #���� 1
		/*	int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age +2000;
		age = age +1;
		
		System.out.println(year);
		System.out.println(age);
		*/
	// #����2
		/* int x=10, y=20;
		int tmp = 0;

		System.out.println("x:" + x + " y:" + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:"+ x + " y:" +y );
		*/
	// #���� 3
	/*	String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
		*/
	// #���� 4
	/*	byte b = 1;
		short s = 2; 
		char c = 'A';
		
		int finger = 10; 
		long big = 100_000_000_000L; //long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; // 8���� 10, 10�����δ� 8
		int hexNum = 0x10; // 16������ 10, 10�����δ� 16
		int binNum = 0b10; // 2���� 10, 10�����δ� 2 
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n",finger);
		System.out.printf("big=%d%n",big);
		System.out.printf("hex=%#x%n",hex); //'#'�� ���λ� (16���� 0x , 8���� 0)
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		*/
		
	// # ���� 5 
		String url = "www.codechobo.com";
		
		float f1 = .10f; //0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0el , 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n, d", d); //��ü 14�ڸ� �� �Ҽ��� 10�ڸ� 
		
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);  //��������
		System.out.printf("[%.8s]%n", url); // ���ʿ��� 8���ڸ� ��� 
		
		
		
		
		

	}

}
