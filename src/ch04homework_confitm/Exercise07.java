package ch04homework_confitm;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			int input = scanner.nextInt();
			if(input == 1) {
				System.out.print("예금액>");
				balance += scanner.nextInt();
				
			}else if(input == 2) {
				int a = scanner.nextInt();
				if(balance < a) {
					System.out.println("한도초과");
					continue;
				}else {
					balance -= a;
				}
			}else if(input == 3) {
				System.out.println("잔고>" +balance);
			}else if(input == 4) {
				break;
			}else {
				continue;
			}
		}
		System.out.println("프로그램 종료");
		
		
	}

}
