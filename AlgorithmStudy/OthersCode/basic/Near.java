package basic;

//가까운값(Near) : 차이값의 절대값의 최소값..

public class Near {

	public static void main(String[] args) {

		// [1] 입력

		int[] data = { 10, 20, 30, 27, 17 };

		int target = 25; // 찾을값을 지정

		int near = 0; // 가까운값을 저장할 변수

		int min = Integer.MAX_VALUE; // 차이값의 절대값의 최소값을 저장할변수

		// 초기값은 정수형에서 최대값;

		// [2] 처리

		for (int i = 0; i < data.length; i++) {

			int a = Math.abs((data[i] - target)); // Math.abs(값) : 절대값 구하는 함수

			// int a = Abs((data[i] - target));

			if (min > a) {

				min = a; // 최소값 알고리즘

				near = data[i]; // 최종적으로 가까운값

			}

		}

		// [3] 출력

		System.out.println(target + "와 가까운 값 : " + near); // 27

	}

	// 절대값 구하는 메소드

	public static int Abs(int num) {

		return (num < 0) ? -num : num; // 넘겨받은 num이 0보다 작으면 -부호를 붙여 +로 바꾼다.

		// ex) (-1 < 0) 이면 -(-1) 이 되어 1로 계산된다.

	}

}
