package ch05;

import java.util.Arrays;

public class Exam5 {

	public static void main(String[] args) {
			
		// 배열을 생성
		int [] arr1 = new int[3];
		
		//배열 항목의 값을 읽고 출력
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		// 배열 항목의 값을 변경
		arr1[0] = 90;
		arr1[1] = 80;
		arr1[2] = 95;
		
		//배열 항목의 값을 읽고 출력
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println(arr1[0] == 90);
		System.out.println(arr1[1] != 80);
	}
}
	
	

