package basic;

//�հ�(SUM)

public class Sum {

	public static void main(String args[]) {

		// [1] Input : 5���� ���� ����

		int[] score = { 75, 50, 37, 90, 95 };

		int sum = 0; // ���� : �������� ������ ����

		int sumCondition = 0; // �������� : Ư�������� �´� �л��� ������ ������ ����

		// [2] Process :SUM

		for (int i = 0; i < score.length; i++) {

			// [-] ��ü ����

			// sum = sum + score[i];

			sum += score[i];

			// [-] 80�� �̻��� ����

			if (score[i] >= 80) {

				sumCondition += score[i];

			}

		}

		// [3] Output

		System.out.println(score.length + "���� ���� : " + sum); // 347

		System.out.println(score.length + "���� ������ 80�� �̻��� ���� : " + sumCondition); // 185

	}

}
