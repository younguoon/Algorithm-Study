package backjoon;

import java.util.Scanner;

public class D0114_N2985_ThreeNumbers {
	public static void main(String[] args) {

		int a = 0, b = 0, c = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("a b c를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if ((0<a || 0<b || 0<c) && (a <= 100 || b <= 100 || c <= 100) && (a + b == c || a - b == c || a * b == c || a / b == c)) {
			if (a + b == c) {
				System.out.println(a + "+" + b + "=" + c);
			} else if (a - b == c) {
				System.out.println(a + "-" + b + "=" + c);
			} else if (a * b == c) {
				System.out.println(a + "*" + b + "=" + c);
			} else if (a / b == c) {
				System.out.println(a + "/" + b + "=" + c);
			}
		}
	}
}

// while (true) {
// System.out.println("a b c를 입력하세요 : ");
// a = sc.nextInt();
// b = sc.nextInt();
// c = sc.nextInt();
// if (a > 100 || b>100 || c>100)
// sc.reset();
// if(a+b!=c && a-b!=c && a*b!=c && a/b!=c)
// sc.reset();
// if (a + b == c) {
// System.out.println(a + "+" + b + "=" + c);
// } else if (a - b == c) {
// System.out.println(a + "-" + b + "=" + c);
// } else if (a * b == c) {
// System.out.println(a + "*" + b + "=" + c);
// } else if (a / b == c) {
// System.out.println(a + "/" + b + "=" + c);
// }
// else
// System.out.println("다시 입력하세요");
// }
// }
// }
// while (true) {
// try {
// System.out.println("a b c를 입력하세요 : ");
// a = sc.nextInt();
// b = sc.nextInt();
// c = sc.nextInt();
// } catch (Exception e) {
// sc.reset();
// }
