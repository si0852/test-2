package ch03;

public class Exam01 {

	public static void main(String[] args) {
		// 연산의 다양한형태
		int var1 = 1;
		var1 = var1 + 1;
		var1 +=1;
		var1++;
		System.out.println("var1 : " + var1);
		
		int var2 = 10;
		var2 = var2 - 1;
		var2 -= 1;
		var2--;
		System.out.println("var2 : " + var2);
		
		int var3 = 16;
		var3 = var3/2;
		var3 /= 2;
		System.out.println("var3 : " + var3);
		
		// 자바는 정수 / (나눗셈)의 결과는 정수 입니다.
		int var4 = 11;
		int var5 = 4;
		double var6 = var4 / var5;
		System.out.println("var6 : " + var6);
		
		double var7 = 1.0 * var4 / var5;
		System.out.println("var7 : " + var7);
		
		double var8 = (double) var4 / var5;
		System.out.println("var8 : " + var8);
		
		//나머지 구하기
		int var9 = var4 % var5;
		System.out.println("var9 : " + var9);

	}

}
