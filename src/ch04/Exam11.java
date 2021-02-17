package ch04;

public class Exam11 {

	public static void main(String[] args) {
		
		
		int count = 0;
		
		while(true) {
			count++;
			System.out.println(count);
			if(count > 10) {
				System.out.println("stop!!");
				break;
				//return; //메소드 자체를 종료해라!!, main메서드 안의 내용을 다실행시키고 끝나야되지만, return을 사용하게 되면 그 시점에서 종료된다 아래의 출력문에 에러나는 이유이다.
			
			}
		
		System.out.println ("프로그램 마무리 내용 실행");
	}
	}
}
