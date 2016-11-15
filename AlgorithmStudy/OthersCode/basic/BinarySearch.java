package basic;

import java.util.Scanner;

//�����˻�(BinarySearch) �Ǵ� �̺а˻� :

//���ĵ� ���� ���� ���ϴ� ���Ҹ� ã�� �˰���

//�߾��� ���Ҹ� ���������ؼ� ã�°��� �� ũ�� �������� Ž���ϰ� �� ������ ������ Ž����

//( �����̵������Ƿ� �߾��� �������� ������ ������ �������ִ� �� �̴�.)

public class BinarySearch {

	public static void main(String[] args) {

		// [1] �Է�

		int[] data = { 1, 2, 4, 5, 7, 8, 9 }; // ������������ ���ĵǾ��ٰ� ����

		System.out.print("ã�� ������ : ");

		Scanner scn = new Scanner(System.in);

		int search = scn.nextInt(); // ã�� ���� �Է¹���

		boolean flag = false; // ã������ true , �׷��� ������ false

		int index = -1; // ã�� ��ġ

		// ����Ž�� ���� ����

		int low = 0;

		int mid = 0;

		int high = data.length - 1; // data �迭�� ������ �ε�����

		// [2] ó��

		while (low <= high) {

			mid = (low + high) / 2; // �߰��� (�˻��� ������)

			System.out
					.println("mid = (low+high)/2 = (" + low + "+" + high + ")/2 =" + mid + " => ����ִ°� : " + data[mid]);

			if (data[mid] == search) {

				flag = true; // ã������ ǥ��

				index = mid; // ���� ��ġ�� ����

				break; // ���ϴ� ���� ã������ �ݺ��� ����

			}

			// ���ϴ� ����� ã�� ���Ͽ������ ������ ���̱� ���� �۾�

			if (data[mid] < search) {

				low = mid + 1;

			} else {

				high = mid - 1;

			}

		}

		// [3] ���

		if (flag) {

			System.out.println(search + "�� " + (index + 1) + "��° ��ġ���� ã�ҽ��ϴ�.");

		} else {

			System.out.println("ã�� ���߽��ϴ�.");

		}

	}

}
