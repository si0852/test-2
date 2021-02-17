package ch04;

public class Exam05 {

	public static void main(String[] args) {
		//주사위를 던져 나오는 수 얻기 (1,2,3,4,5,6)	
		
		double temp =Math.random();
		
		System.out.println(temp);// [0,1) 0과1사이의 실수 ,  1은 포함x
		System.out.println(temp * 6);// [0,6) 0과1사이의 실수 ,  6은 포함x 
		System.out.println((int)(temp * 6) + 1);// 1,2,3,4,5,6 // [0,6) 0과1사이의 정수 ,  6은 포함x
		
		int value = (int) (temp * 6) + 1;
		
		if(value % 2 == 0) {
			//짝수 
			System.out.println("짝수");
		}else {
			//홀수 
			System.out.println("홀수");
		}
	}

}
