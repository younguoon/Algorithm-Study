package basic;

//����(Rank) �˰��� : ������ ������������ ���(����)�� ���ϴ� ����

//-> ���� �迭�� 1������ �ʱ�ȭ ���ѳ��� ��,

//-> �ݺ��ϸ鼭, ������ ū ������ ������ ���� ������ 1���� (ī��Ʈ)

public class Rank {

	public static void main(String[] args) {

		// [1] �Է�

		int[] score = { 90, 87, 100, 95, 80 };

		int[] rank = { 1, 1, 1, 1, 1 };

		// [2] ó��

		for (int i = 0; i < score.length; i++) {

			rank[i] = 1; // 1������ �ʱ�ȭ

			for (int j = 0; j < score.length; j++) { // ���ص����Ϳ� �����������ͺ�

				if (score[i] < score[j]) { // ���ص����Ͱ� �����������Ͷ� �������� ������ rank[i]
											// ī��Ʈ

					rank[i]++; // COUNT

				}

			}

		}

		// [3] ���

		for (int i = 0; i < score.length; i++) {

			System.out.println(score[i] + "�� : " + rank[i] + "��");

		}

	}

}
