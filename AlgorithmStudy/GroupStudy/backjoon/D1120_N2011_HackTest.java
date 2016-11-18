/*

문제 (2011번) _ `16.11.20
상근이와 선영이가 다른 사람들이 남매간의 대화를 듣는 것을 방지하기 위해서 대화를 서로 안호화 하기로 했다.
그래서 다음과 같은 대화를 했다.
- 상근: 그냥 간단히 암호화 하자. A를 1이라고 하고, B는 2로, 그리고 Z는 26으로 하는거야.
- 선영: 그럼 안돼. 만약, "BESN"을 암호화하면 25114가 나오는데, 이걸 다시 글자로 바꾸는 방법은 여러가지가 있어.
- 상근: 그렇네. 25114를 다시 영어로 바꾸면, "BEAAD", "YAAD", "YAN", "YKD", 'BEKD", "BEAN" 총 6가지가 나오는데,
	   BEAN이 맞는 단어라는건 쉽게 알 수 있잖아?
- 선영: 예가 적절하지 않았네ㅜㅜ 만약 내가 500자리 글자를 암호화 했다고 해봐, 그 때는 나올 수 있는 해석이 정말 많은데, 그걸 언제 다해봐?
- 상근: 얼마나 많은데?
- 선영: 구해보자!
어떤 암호가 주어졌을 때 그 암호의 해석이 몇 가지가 나올 수 있는지 구하는 프로그램을 작성하시오

입력
첫째 줄에 5000자리 이하의 암호가 주어진다.

출력 
나올 수 있는 해석의 가짓수를 구하시오. 정답이 매우 클 수 있으므로, 1000000으로 나눈 나머지를 출력한다.

예제입력 25114
예제출력 6

*/

package backjoon;

import java.io.*;

public class D1120_N2011_HackTest {
	static int[] cache = new int[5001]; //정수 배열 선언
	static String str;//글자 변수선언
	static int len; //글자 길이 변수선언
	static final int MOD = 1000000; //최대값은 변하면 안되므로 final

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine(); //입력받은 숫자 저장
		len = str.length(); //숫자 길이 저장

		for (int i = 0; i < cache.length; i++)
			cache[i] = -1;

		int result = 0; 

		
		if (str.charAt(0) != '0')
			result = (result % MOD + solution(0) % MOD) % MOD;
		if ((str.charAt(0) == '2' && str.charAt(1) <= '6') || str.charAt(0) == '1')
			result = (result % MOD + solution(1) % MOD) % MOD;

		System.out.println(result);
	}

	static int solution(int index) {
		 int result = 0;

		if (index == len - 1)
			return 1;

		if (cache[index] != -1)
  			return cache[index];

		if (index + 1 < len)
			if (str.charAt(index + 1) != '0')
				result = (result % MOD + solution(index + 1) % MOD) % MOD;

		if (index + 2 < len)
			if ((str.charAt(index + 1) == '2' && str.charAt(index + 2) <= '6') || (str.charAt(index + 1) == '1'))
				result = (result % MOD + solution(index + 2) % MOD) % MOD;

		return cache[index] = result;
	}
}


