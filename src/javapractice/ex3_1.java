package javapractice;

public class ex3_1 {

	public static void main(String[] args) {
		int sum = 0, i; // sum이라는 변수에 0으로 초기화

		for (i = 1; i <= 10; i++) // 1부터 10까지 i를 증가시키며 반복
			sum += i;
		System.out.println(i);
		System.out.print(sum);

		sum = 0;

		for (i = 1; i <= 10; i++) { // 1~10까지 반복
			sum += i;
			System.out.print(i); // 더하는 수 출력

			if (i <= 9) // 1~9까지는 '+' 출력
				System.out.print("+");
			else { // i가 10인 경우
				System.out.print("="); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}
		}
	}

	// TODO Auto-generated method stub

}
