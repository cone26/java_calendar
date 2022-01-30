package siwon.calendar;

import java.util.Scanner;

public class Sum {
	public static void main (String[] args) {
		//사용자에게 질문하기
		System.out.println("정수 두개를 입력하세요.> ");
		// 스캐너 열어~!
		Scanner scanner = new Scanner(System.in);
		// 입력받은 숫자 변수에 담기 (2개)
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		// 값 계산 (더하기)

	System.out.printf("%d + %d = %d%n",num1, num2, num1+num2);
	}
}
