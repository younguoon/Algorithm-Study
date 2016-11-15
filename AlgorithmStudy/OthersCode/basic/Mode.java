package basic;

/*


    �ֺ� (MODE) : ���� ���� ��Ÿ�� �� 


    -> �������� �ε����� ī��Ʈ(count) ���� �ִ밪(Max)


*/

public class Mode {

	public static void main(String[] args) {

		// [1] �Է� : ���� : 0���� 5������ ���� ���´ٰ� ����

		int[] data = { 1, 3, 4, 3, 5 };

		int mode = 0; // �ֺ��� ��� �׸�

		int[] index = new int[6]; // 0~5���� : �ε����� ī����

		int max = Integer.MIN_VALUE; // �ִ밪�� �����ϱ����� ���� ; �ʱⰪ�� �������� �ּҰ�����

		// [2] ó��

		for (int i = 0; i < data.length; i++) {

			index[data[i]]++; // COUNT

		}

		for (int i = 0; i < index.length; i++) {

			if (max < index[i]) {

				max = index[i]; // MAX

				mode = i; // �ֺ� : MODE

			}

		}

		// [3] ���

		System.out.println("�ֺ� : " + mode + " , " + max + "��"); // 3, 2��

	}

}
