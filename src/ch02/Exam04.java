package ch02;

public class Exam04 {
	public static void main(String[] args) {
		
		//문자열 => 숫자(정수, 실수)
		
		//문자열은 String 타입 변수에 저장한다.
		String var1 = "10";
		System.out.println("var1 : " + var1);
		
		String var2 = var1 + 5;
		System.out.println("var2 : " + var2); // 문자열과 숫자가 +되면 연산이되는게 아니라 결합이된다.
		
		//문자열을 숫자로 변경해서 연산
		int var3 = Integer.parseInt(var1) + 5;
		System.out.println("Var3 : " + var3);
		
		//문자열을 실수로 변경해서 연산
		String var4 = "10.5";
		double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println("var5 : " + var5);
		
		//숫자 => 문자열
		int var6 = 3;
		//방법1
		String var7 = String.valueOf(var6) + "0";
		System.out.println("var7 : " + var7);
		
		//방법2
		String var8 = String.valueOf(var6);
	}

}
