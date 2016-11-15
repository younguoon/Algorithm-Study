package basic;

import java.util.Scanner;

//순차검색

public class SeqSearch {

	public static void main(String[] args) {

		// [1] 입력

		int[] data = { 1, 2, 4, 5, 7, 8, 9 };

		System.out.print("찾을 데이터 : ");

		Scanner scn = new Scanner(System.in);

		int search = scn.nextInt(); // 찾을 값을 입력받음

		boolean flag = false; // 찾았으면 true , 그렇지 않으면 false

		int index = -1; // 찾은 위치를 저장할변수

		// [2] 처리

		for (int i = 0; i < data.length; i++) {

			if (data[i] == search) {

				flag = true; // 찾았음을 표시

				index = i; // 값의 위치(배열의 인덱스)를 저장

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
