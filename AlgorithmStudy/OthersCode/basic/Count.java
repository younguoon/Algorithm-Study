package basic;

//카운트(Count)

public class Count {

	public static void main(String args[]) {

		// [1] Input

		int[] data = { 10, 8, 7, 3, 5 };

		int count = 0; // 카운트 저장할 변수

		// [2] Process : COUNT

		for (int i = 0; i < data.length; i++) {

			if (data[i] % 2 == 0) {

				count++; // 짝수이면 1증가

			}

		}

		// [3] Output

		System.out.println("짝수의 건수 : " + count); // 2

	}

}
