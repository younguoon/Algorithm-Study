package basic;

//����(Near) : ���̰��� ���밪�� �ּҰ�..

public class Near {

	public static void main(String[] args) {

		// [1] �Է�

		int[] data = { 10, 20, 30, 27, 17 };

		int target = 25; // ã������ ����

		int near = 0; // ������ ������ ����

		int min = Integer.MAX_VALUE; // ���̰��� ���밪�� �ּҰ��� �����Һ���

		// �ʱⰪ�� ���������� �ִ밪;

		// [2] ó��

		for (int i = 0; i < data.length; i++) {

			int a = Math.abs((data[i] - target)); // Math.abs(��) : ���밪 ���ϴ� �Լ�

			// int a = Abs((data[i] - target));

			if (min > a) {

				min = a; // �ּҰ� �˰���

				near = data[i]; // ���������� ����

			}

		}

		// [3] ���

		System.out.println(target + "�� ����� �� : " + near); // 27

	}

	// ���밪 ���ϴ� �޼ҵ�

	public static int Abs(int num) {

		return (num < 0) ? -num : num; // �Ѱܹ��� num�� 0���� ������ -��ȣ�� �ٿ� +�� �ٲ۴�.

		// ex) (-1 < 0) �̸� -(-1) �� �Ǿ� 1�� ���ȴ�.

	}

}
