package javapractice;

import java.util.Scanner;

public class ex2_10 {

	public static void main(String[] args) {
		// 입력값 받기
		Scanner scanner = new Scanner(System.in);

		System.out.print("점수를 입력하시오:");
		// 출력
		int score = scanner.nextInt();
		// 입력받은 값을 스코어에 담기
		if (score >= 80)
			// 조건문

			System.out.println("축하합니다! 합격입니다.");
//출력
		scanner.close();
		// TODO Auto-generated method stub

	}

}
