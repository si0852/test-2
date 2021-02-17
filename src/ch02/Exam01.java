package ch02;

public class Exam01 {
	//
	public static void main(String[] args) {
		// 정수 타입의 변수 선언과 값 저
		byte var1 = 100; // ~128 ~ 127
		short var2 = 10000;
		int var3 = 2000000000;
		long var4 = 200000000000L;
		
		//문자 타입의 변수 선언과 값 저장
		char var9 = 65;
		//''와 "" 안에 내용의 차이점? 문자열이냐 문자를 하나쓰냐, byte 차이가 있기 때문
		char var10 = 'A';
		
		//System.out.println("Var9 : " + var9);
		//System.out.println("Var10 : " + var10);
		
		//실수 타입의 변수 선언과 값 저장
		float var5 = 0.123456789123456789f;
		double var6 = 0.123456789123456789;
		//정밀도 float 과 double(float보다 더정밀하게)
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		
		//논리 타입의 변수 선언과 값 저장
		boolean var7 = true;
		boolean var8 = false;
		
		
		
		
	}

}
