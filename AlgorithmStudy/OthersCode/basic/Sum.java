package basic;

//합계(SUM)

public class Sum {

	public static void main(String args[]) {

		// [1] Input : 5명의 영어 점수

		int[] score = { 75, 50, 37, 90, 95 };

		int sum = 0; // 총점 : 각점수를 누적할 변수

		int sumCondition = 0; // 조건총점 : 특정조건의 맞는 학생의 점수를 누적할 변수

		// [2] Process :SUM

		for (int i = 0; i < score.length; i++) {

			// [-] 전체 총점

			// sum = sum + score[i];

			sum += score[i];

			// [-] 80점 이상의 총점

			if (score[i] >= 80) {

				sumCondition += score[i];

			}

		}

		// [3] Output

		System.out.println(score.length + "명의 총점 : " + sum); // 347

		System.out.println(score.length + "명의 점수중 80점 이상의 총점 : " + sumCondition); // 185

	}

}
