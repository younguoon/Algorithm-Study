package basic;

/*


 * �Ʒ� ������ ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.


 *  1/2 - 2/3 + 3/4 - .... 98/99 + 99/100 = ?


 */

public class Sequence2 {

	public static void main(String[] args) {

		// [1] �Է�

		double sum = 0.0;

		// [2] ó��

		for (int i = 0; i <= 99; i++) {

			if (i % 2 != 0) { // Ȧ�����

				sum += i / (double) (i + 1);

			} else {

				sum -= i / (double) (i + 1);

			}

		}

		// [3] ���

		System.out.println("Result : " + sum); // 0.688......

	}

}
