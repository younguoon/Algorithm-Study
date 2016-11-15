package basic;

//평균 (AVG)

public class Avg {

	public static void main(String[] args) {

		// [1] Input

		int[] data = { 50, 65, 78, 90, 95 };

		int count = 0;

		int sum = 0; // 합계를 저장할 변수

		double avg = 0.0; // 평균이 저장될 변수

		// [2] Process : AVG

		for (int i = 0; i < data.length; i++) {

			if (data[i] >= 80 && data[i] <= 95) {

				count++; // 80점 이상 95점 이하인 자료가 있으면 카운트증가

				sum += data[i];

			}

		}

		avg = sum / (double) count;

		// 참고 : int형 나누기 int형은 결과가 int형이다. 따라서 반드시 캐스팅(형식변환) 필요

		// [3] Output

		System.out.println("80점 이상 95점 이하인 자료의 평균 " + avg);

		System.out.println("80~95 평균 => (double)로 형변환하지 않았을경우 " + (sum / count));

	}

}
