package ch02;

public class Exam03 {

	public static void main(String[] args) {
		//int 타입 이하의 피연산자 연산은 결과가 integer 이다.
		byte var1 = 10;
		byte var2 = 20;
		int var3 = var1 + var2; 
		byte var =(byte) (var1 + var2);
		
		//int 타입보다 큰 타입이 연산이 되면 큰 타입으로 결과가 된다.
		int var4 = 10;
		int var5 = 20; //long으로 바꾸면 아래 var6를 long으로 바꿔야한다. (long var5 =20)
		int var6 = var4 + var5; // long var6 = var4 + var5;
		
		int var7 = 10;
		double var8 = 1.5;
		double var9 = var7 + var8; //double이 더크기 때문에 double로 설정해야한다.
		
	}

}
