package basic;

/*


 * �Ʒ� ������ ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.


 *  1+2+4+7+11+16+22+... +


 *  �����ϴ�� 20�� �ݺ����� ���� ������� ? ��?


 */

public class Sequence3 {

	public static void main(String[] args) {

		// [1] �Է�

		int sum = 0;

		int data = 1;

		// [2] ó��

		for (int i = 0; i < 20; i++) { // 20�� �ݺ�

			if (i != 19)
				System.out.print(data + "+");

			else
				System.out.print(data + "\n");

			sum += data; // ����

			data = data + (i + 1); // ������ �ε����� ������.

		}

		// [3] ���

		System.out.println("Result : " + sum); // 1350

	}

}
