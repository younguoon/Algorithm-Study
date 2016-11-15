package basic;

import java.util.Arrays;

/*


정렬(SORT) : 순서대로 정렬시키는 알고리즘


오름차순(Ascending) 정렬 : 1, 2, 3, ABC순


내림차순(Descending) 정렬 : 3, 2, 1, 다나가 순


종류 : 선택정렬, 버블정렬, 퀵정렬, 삽입, 기수,......


*/

public class SelectionSort {

	public static void main(String[] args) {

		// [1] 입력

		int[] data = { 7, 5, 6, 1, 9 };

		// [2] 처리

		// Arrays.sort(data); //이미 만들어진 API를 이용하면 쉽게 정렬할수있음.

		// Selection Sort

		int temp = 0; // 데이터 Swap용 임시 변수

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = i + 1; j < data.length; j++) {

				if (data[i] > data[j]) { // 오름차순 ; 큰수를 뒤로, data[i] > data[j]

					// 내림차순 ; 큰수를 앞으로, data[i] < data[j]

					// 데이터 값 체인지

					temp = data[i];

					data[i] = data[j];

					data[j] = temp;

				}

			}

			ShowArray(data); // 현재 i번째 데이터 출력

		}

		// [3] 출력

		System.out.println("====== 정렬 결과 ======");

		for (int i = 0; i < data.length; i++) {

			System.out.print(data[i] + "  "); // 1, 5, 6, 7, 9 출력되도록

		}

	}

	// 회전시마다 배열상태를 보기위한 메서드

	private static void ShowArray(int[] data) {

		for (int i = 0; i < data.length; i++) {

			System.out.print(data[i] + "  ");

		}

		System.out.println();

	}

}
