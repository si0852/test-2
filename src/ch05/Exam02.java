package ch05;

import java.util.Arrays;

public class Exam02 {

	public static void main(String[] args) {
		// 변수를 선언하면서 갑 목록을 제공할 경
		int[] scores1 = {90, 85, 95};
		System.out.println(scores1[0]);
		System.out.println(scores1[1]);
		System.out.println(scores1[2]);
		
		
		//변수를 선언한 후 값 목록을 제공할 경
		int[] scores2 = null;
		//scores2 = {90, 85, 95}; -> 요건 문법에서 벗어나서 에러뜸
		scores2 = new int[] {90, 85, 95}; //요래 해야한다고 함.
		
		//메소드 호출 
		//add(10); // call by value , 값을 전달하면서 호출하겠따.
		add(scores1);// call bv reference, 값이 아니라 주소를 전달한다.
		add(scores2);
		//add({100, 200m, 300}); // 요케하면 안됨 메서드 매개변수에는 초기화된 배열을 넣어야 되는데 요건 값을 넣어서 매개변수로 전달하기 때문에
		add(new int[] {100,200,300});
	}
	
	//메소드 선언
	public static void add(int[] arr) {
		System.out.println("값 : "+ Arrays.toString(arr));
	}

}
