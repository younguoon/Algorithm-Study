package backjoon;

import java.util.Scanner;

public class D1113_N1759_Security {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String numL, numC;
		System.out.println("�ΰ��� ���ڸ� �Է��ϼ���. [��, L, C ������, (3<= L,C <=15)]");

		while (true) {
			numL = scan.next();
			numC = scan.next();
				System.out.println("�Է��� ����  L : " + numL + " C : " + numC);
				System.out.println("�ΰ��� ���ڸ� �Է��ϼ���. [��, L, C ������, (3<= L,C <=15)]");
				if (Integer.parseInt(numL) < 3 && Integer.parseInt(numL) > 15 && Integer.parseInt(numC) < 3
						&& Integer.parseInt(numL) > 15) {
					System.out.println("���ڸ� �ٽ� �Է��ϼ���");
					
					
				} else {

				}
			
		}

	}
}
