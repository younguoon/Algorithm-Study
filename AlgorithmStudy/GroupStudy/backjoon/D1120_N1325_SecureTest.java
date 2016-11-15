/*
문제 (1325번) _ `16.11.20
해커 김지민은 잘 알려진 어느 회사를 해킹하려고 한다. 이 회사는 N개의 컴퓨터로 이루어져 있다. 김지민은 귀찮기 때문에, 한 번의 해킹으로 여러 개의 컴퓨터를 해킹 할 수 있는 컴퓨터를 해킹하려고 한다.
이 회사의 컴퓨터는 신뢰하는 관계와, 신뢰하지 않는 관계로 이루어져 있는데, A가 B를 신뢰하는 경우에는 B를 해킹하면, A도 해킹할 수 있다는 소리다.
이 회사의 컴퓨터의 신뢰하는 관계가 주어졌을 때, 한 번에 가장 많은 컴퓨터를 해킹할 수 있는 컴퓨터의 번호를 출력하는 프로그램을 작성하시오.

입력 
첫째 줄에, N과 M이 들어온다. N은 10,000보다 작거나 같고, M은 100,000보다 작거나 같다. 둘째 줄부터 M개의 줄에 신뢰하는 관계가 A B와 같은 형식으로 들어온다. A가 B를 신뢰한다.를 의미한다.

출력
첫째 줄에, 김지민이 한 번에 가장 많은 컴퓨터를 해킹할 수 있는 컴퓨터의 번호를 오름차순으로 출력한다.
*/

package backjoon;

import java.util.Scanner;

public class D1120_N1325_SecureTest {
	public static void main(String[] args) {
		
		int n, m;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("두 숫자 N과 M을 입력하세요 ");
		n = sc1.nextInt();
		m = sc2.nextInt();
		System.out.println("입력한 두 숫자 N : " + n + " M : "+ m);
	}
}
