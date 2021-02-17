package ch04;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		//키보드로 입력한 내용을 받기 위해 Scanner 생성
		Scanner scanner = new Scanner(System.in);
		
		//키보드에서 입력한 내용을 data변수에 저장
		System.out.print("압력 : ");
		String data = scanner.nextLine(); // 엔터키를 쳐야지만 입력을 받아들인다.
		
		//data 변수의 값을 출력 
		System.out.println("출력 : " + data);
	}
}
