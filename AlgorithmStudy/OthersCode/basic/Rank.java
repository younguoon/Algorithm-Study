package basic;

//순위(Rank) 알고리즘 : 지정한 범위내에서의 등수(순위)를 구하는 로직

//-> 순위 배열을 1등으로 초기화 시켜놓은 후,

//-> 반복하면서, 나보다 큰 점수가 나오면 나의 순위를 1증가 (카운트)

public class Rank {

	public static void main(String[] args) {

		// [1] 입력

		int[] score = { 90, 87, 100, 95, 80 };

		int[] rank = { 1, 1, 1, 1, 1 };

		// [2] 처리

		for (int i = 0; i < score.length; i++) {

			rank[i] = 1; // 1등으로 초기화

			for (int j = 0; j < score.length; j++) { // 기준데이터와 나머지데이터비교

				if (score[i] < score[j]) { // 기준데이터가 나머지데이터라 비교했을때 적으면 rank[i]
											// 카운트

					rank[i]++; // COUNT

				}

			}

		}

		// [3] 출력

		for (int i = 0; i < score.length; i++) {

			System.out.println(score[i] + "점 : " + rank[i] + "등");

		}

	}

}
