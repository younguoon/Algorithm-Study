package basic;

import java.util.Scanner;

//�����˻�

public class SeqSearch {

	public static void main(String[] args) {

		// [1] �Է�

		int[] data = { 1, 2, 4, 5, 7, 8, 9 };

		System.out.print("ã�� ������ : ");

		Scanner scn = new Scanner(System.in);

		int search = scn.nextInt(); // ã�� ���� �Է¹���

		boolean flag = false; // ã������ true , �׷��� ������ false

		int index = -1; // ã�� ��ġ�� �����Һ���

		// [2] ó��

		for (int i = 0; i < data.length; i++) {

			if (data[i] == search) {

				flag = true; // ã������ ǥ��

				index = i; // ���� ��ġ(�迭�� �ε���)�� ����

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
