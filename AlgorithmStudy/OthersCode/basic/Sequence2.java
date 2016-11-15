package basic;

/*


 * 아래 수열의 결과값을 구하는 프로그램을 작성하시오.


 *  1/2 - 2/3 + 3/4 - .... 98/99 + 99/100 = ?


 */

public class Sequence2 {

	public static void main(String[] args) {

		// [1] 입력

		double sum = 0.0;

		// [2] 처리

		for (int i = 0; i <= 99; i++) {

			if (i % 2 != 0) { // 홀수라면

				sum += i / (double) (i + 1);

			} else {

				sum -= i / (double) (i + 1);

			}

		}

		// [3] 출력

		System.out.println("Result : " + sum); // 0.688......

	}

}
