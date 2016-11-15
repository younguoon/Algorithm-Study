package basic;

/*


 * 아래 수열의 결과값을 구하는 프로그램을 작성하시오.


 *  1+2+4+7+11+16+22+... +


 *  위패턴대로 20번 반복했을 때의 결과값은 ? 얼마?


 */

public class Sequence3 {

	public static void main(String[] args) {

		// [1] 입력

		int sum = 0;

		int data = 1;

		// [2] 처리

		for (int i = 0; i < 20; i++) { // 20번 반복

			if (i != 19)
				System.out.print(data + "+");

			else
				System.out.print(data + "\n");

			sum += data; // 누적

			data = data + (i + 1); // 다음번 인덱스를 더하자.

		}

		// [3] 출력

		System.out.println("Result : " + sum); // 1350

	}

}
