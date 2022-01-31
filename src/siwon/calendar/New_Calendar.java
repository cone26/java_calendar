package siwon.calendar;

import java.util.Scanner;

public class New_Calendar {
	public static void main(String[] args) {
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 스캐너 열기
		Scanner scanner = new Scanner(System.in);
		outer: while (true) {
			// 사용자 질문
			System.out.println("달을 입력하세요.");
			System.out.print("> ");
			int month = scanner.nextInt();
			if (0 > month || month > 12) {
				break;
			}
			//버그 잇어여 날짜 줄바꿈이 이상함 ~~
			System.out.println("첫번째 요일을 입력하세요.(SU,MO,TU,WE,TH,FR,SA)");
			System.out.print("> ");
			String day = scanner.next();

			// 요일과 구분선 출력
			String dayPrint = " SU MO TU WE TH FR SA";
			// 요일의 index찾기
			if (dayPrint.indexOf(day) == -1) {
				break outer;
			}
			System.out.println(dayPrint);
			System.out.println("----------------------");
			int dayIndex = dayPrint.indexOf(day) - 1;
			System.out.println(dayIndex);
			for (int i = 1; i <= dayIndex; i++) {
				System.out.print(" ");
			}
			// 반복문으로 숫자 출력
			for (int i = 1; i <= monthDays[month - 1]; i++) {

				System.out.printf("%3d", i);
				if ((i + dayIndex / 2) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}
		System.out.println("끝났습니다.");

	}
}
