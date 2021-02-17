package ch03;

public class Exam02 {

	public static void main(String[] args) {
		
		//연산 결과가 boolean 타입으로 나오는 연산기호
		
		int var1 = 2;
		int var2 =3;
				
		boolean var3 = var1 == var2;
		boolean var4 = var1 != var2;
		boolean var5 = var1 > var2;
		boolean var6 = var1 < var2;
		boolean var7 = var1 < var2;
		boolean var8 = var1 <= var2;
		boolean var9 = !(var1 == var2);
		boolean var10 = (var1 == var2) || (var1 < var2); 
		boolean var11 = (var1 == var2) && (var1 < var2); 
		
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);
		System.out.println("var10 : " + var10);
		System.out.println("var11 : " + var11);
		System.out.println((var2>var1) ? "good" : "bad");

	}

}
