package basic;

//ī��Ʈ(Count)

public class Count {

	public static void main(String args[]) {

		// [1] Input

		int[] data = { 10, 8, 7, 3, 5 };

		int count = 0; // ī��Ʈ ������ ����

		// [2] Process : COUNT

		for (int i = 0; i < data.length; i++) {

			if (data[i] % 2 == 0) {

				count++; // ¦���̸� 1����

			}

		}

		// [3] Output

		System.out.println("¦���� �Ǽ� : " + count); // 2

	}

}
