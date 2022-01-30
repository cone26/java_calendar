package siwon.calendar;

import java.util.Scanner;

public class New_Calendar {
	public static void main(String[] args) {
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		while(true) {
			// 사용자 질문
			System.out.println("달을 입력하세요.");
			System.out.print("> ");
			int month = scanner.nextInt();
			if(0 > month  || month > 12) {
				break;
			}
			// 요일과 구분선 출력
			System.out.println("  일   월   화   수   목   금   토");
			System.out.println("----------------------");
			// 반복문으로 숫자 출력
			for (int i = 1; i <= monthDays[month - 1]; i++) {
				System.out.printf("%3d", i);
				if (i % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}
		System.out.println("끝났습니다.");
	
	}
}
