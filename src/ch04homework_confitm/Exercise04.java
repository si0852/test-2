package ch04homework_confitm;

public class Exercise04 {

	public static void main(String[] args) {
		
		while(true) {
			int x = (int) ((Math.random()*5) + 1);
			int y = (int) ((Math.random()*5) + 1);
			
			int sum = x + y;
			
			if(sum == 5) {
				break;
			}else {
				System.out.println("("+x+"," +y +")");
			}
		}
		
	}

}
