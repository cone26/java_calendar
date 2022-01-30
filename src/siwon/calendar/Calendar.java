package siwon.calendar;

import java.util.Scanner;

public class Calendar {
	int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

//	System.out.println("일   월   화   수   목   금   토");
//	System.out.println("--------------------");
//	System.out.println(" 1  2  3  4  5  6  7");
//	System.out.println(" 8  9 10 11 12 13 14");
//	System.out.println("15 16 17 18 19 20 21");
//	System.out.println("22 23 24 25 26 27 28");
//
	public int maxDaysOfMonth(int month) {
		return monthDays[month - 1];
	}

	public static void main(String[] args) {

		String PROMPT = "> ";
		// 입력받은 달의 최대 일수 출력
		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		// 입력받은 숫자 변수에 담기
		int repeat = scanner.nextInt();
		// 최대 일수 배열 만들기
		while (true) {
			System.out.println("달을 입력하세요. ");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if( month <= 0) {
				break;
			}else if(month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.%n", month, cal.maxDaysOfMonth(month));

		}
		System.out.println("끝났습니다.");

	}
}
