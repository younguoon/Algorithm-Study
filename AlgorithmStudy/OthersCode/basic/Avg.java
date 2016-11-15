package basic;

//��� (AVG)

public class Avg {

	public static void main(String[] args) {

		// [1] Input

		int[] data = { 50, 65, 78, 90, 95 };

		int count = 0;

		int sum = 0; // �հ踦 ������ ����

		double avg = 0.0; // ����� ����� ����

		// [2] Process : AVG

		for (int i = 0; i < data.length; i++) {

			if (data[i] >= 80 && data[i] <= 95) {

				count++; // 80�� �̻� 95�� ������ �ڷᰡ ������ ī��Ʈ����

				sum += data[i];

			}

		}

		avg = sum / (double) count;

		// ���� : int�� ������ int���� ����� int���̴�. ���� �ݵ�� ĳ����(���ĺ�ȯ) �ʿ�

		// [3] Output

		System.out.println("80�� �̻� 95�� ������ �ڷ��� ��� " + avg);

		System.out.println("80~95 ��� => (double)�� ����ȯ���� �ʾ������ " + (sum / count));

	}

}
