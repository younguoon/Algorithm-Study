package basic;

/*


 * �Ʒ� ������ ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.


 * 1 - 2 + 3 - 4 + 5 - ..... + 99 - 100 = ?


 * ���� : Ȧ���� + , ¦����  -


 */

public class Sequence {

	public static void main(String[] args) {

		// [1] �Է�

		int sum = 0;

		// [2] ó��

		for (int i = 0; i <= 100; i++) {

			if (i % 2 != 0) { // Ȧ���̸�

				sum += i;

			} else {

				sum -= i;

			}

		}

		// [3] ���

		System.out.println("Result : " + sum); // -50

	}

}
