package javapractice;

public class ex3_1 {

	public static void main(String[] args) {
		int sum = 0, i; // sum�̶�� ������ 0���� �ʱ�ȭ

		for (i = 1; i <= 10; i++) // 1���� 10���� i�� ������Ű�� �ݺ�
			sum += i;
		System.out.println(i);
		System.out.print(sum);

		sum = 0;

		for (i = 1; i <= 10; i++) { // 1~10���� �ݺ�
			sum += i;
			System.out.print(i); // ���ϴ� �� ���

			if (i <= 9) // 1~9������ '+' ���
				System.out.print("+");
			else { // i�� 10�� ���
				System.out.print("="); // '=' ����ϰ�
				System.out.print(sum); // ���� ��� ���
			}
		}
	}

	// TODO Auto-generated method stub

}
