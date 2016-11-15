package basic;

import java.util.Scanner;

//이진검색(BinarySearch) 또는 이분검색 :

//정렬된 상태 에서 원하는 원소를 찾는 알고리즘

//중앙의 원소를 기준으로해서 찾는값이 더 크면 오른쪽을 탐색하고 더 작으면 왼쪽을 탐색함

//( 정렬이되있으므로 중앙을 기준으로 오른쪽 왼쪽을 나눌수있는 것 이다.)

public class BinarySearch {

	public static void main(String[] args) {

		// [1] 입력

		int[] data = { 1, 2, 4, 5, 7, 8, 9 }; // 오름차순으로 정렬되었다고 가정

		System.out.print("찾을 데이터 : ");

		Scanner scn = new Scanner(System.in);

		int search = scn.nextInt(); // 찾을 값을 입력받음

		boolean flag = false; // 찾았으면 true , 그렇지 않으면 false

		int index = -1; // 찾은 위치

		// 이진탐색 관련 변수

		int low = 0;

		int mid = 0;

		int high = data.length - 1; // data 배열의 마지막 인덱스값

		// [2] 처리

		while (low <= high) {

			mid = (low + high) / 2; // 중간값 (검색할 데이터)

			System.out
					.println("mid = (low+high)/2 = (" + low + "+" + high + ")/2 =" + mid + " => 들어있는값 : " + data[mid]);

			if (data[mid] == search) {

				flag = true; // 찾았음을 표시

				index = mid; // 값의 위치를 저장

				break; // 원하는 값을 찾았으니 반복문 종료

			}

			// 원하는 결과를 찾지 못하였을경우 범위를 줄이기 위해 작업

			if (data[mid] < search) {

				low = mid + 1;

			} else {

				high = mid - 1;

			}

		}

		// [3] 출력

		if (flag) {

			System.out.println(search + "를 " + (index + 1) + "번째 위치에서 찾았습니다.");

		} else {

			System.out.println("찾지 못했습니다.");

		}

	}

}
