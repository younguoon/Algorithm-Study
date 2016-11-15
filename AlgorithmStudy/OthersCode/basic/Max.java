package basic;

//��� (AVG)

public class Max {

	public static void main(String[] args) {

		// [0] Init

		int max = Integer.MIN_VALUE; // ������ ������ �� ���� ���� ������ �ʱ�ȭ

		int min = Integer.MAX_VALUE; // ������ ������ �� ���� ū������ �ʱ�ȭ

		// Field descriptor #68 I

		// public static final int MIN_VALUE = -2147483648;

		// Field descriptor #68 I

		// public static final int MAX_VALUE = 2147483647;

		// [1] Input

		int[] data = { -2, -5, -3, -7, -1 };

		// [2] Process : MAX & MIN

		for (int i = 0; i < data.length; i++) {

			// [-] �ִ� (MAX)

			if (data[i] > max) { // data[i]���� max���� ũ��

				max = data[i]; // data[i]�� ���� max�� ����

			}

			// [-] �ּڰ� (MIN)

			if (data[i] < min) { // data[i]���� min���� ������

				min = data[i]; // data[i]�� ���� min�� ����

			}

		}

		// [3] Output

		System.out.println("�ִ� : " + max); // -1

		System.out.println("�ּڰ� : " + min); // -7

	}

}
