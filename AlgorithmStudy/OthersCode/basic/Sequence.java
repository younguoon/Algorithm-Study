package basic;

/*


 * 아래 수열의 결과값을 구하는 프로그램을 작성하시오.


 * 1 - 2 + 3 - 4 + 5 - ..... + 99 - 100 = ?


 * 패턴 : 홀수는 + , 짝수는  -


 */

public class Sequence {

	public static void main(String[] args) {

		// [1] 입력

		int sum = 0;

		// [2] 처리

		for (int i = 0; i <= 100; i++) {

			if (i % 2 != 0) { // 홀수이면

				sum += i;

			} else {

				sum -= i;

			}

		}

		// [3] 출력

		System.out.println("Result : " + sum); // -50

	}

}
