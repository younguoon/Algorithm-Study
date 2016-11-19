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
	// 정수 숫자 배열 선언
	static int[] cache = new int[5001];
	// 글자 변수선언
	static String str;
	// 글자 길이 변수선언
	static int len;
	// 최대값은 변하면 안되므로 final
	static final int MOD = 1000000;
	
	public static void main(String[] args) throws IOException {
		// 문자, 배열, 행을 버퍼에 담은 후 문자형 입력스트림으로 텍스트를 읽어 들인다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("숫자를 입력하세요");
		// 입력받은 숫자 저장
		// read대신 readLine을 사용해서 버퍼초기화를 고려하지 않도록 한다.
		str = br.readLine();
		// 숫자 길이 저장
		len = str.length();
		
		for (int i = 0; i < cache.length; i++) {
			cache[i] = -1;
		}

		// 입력값의 첫번째 숫자가 0이면 무조건 0가지가 가능
		int result = 0;

		// 입력값의 첫번째 숫자가 0이 아닐 때
		if (str.charAt(0) != '0') {
			// solution 메소드에 index값을 0으로 넘겨서 값을 받아옴
			// result는 100만개가 넘어갔을 때 이야기임
			result = (solution(0) % MOD) % MOD;
		}

		// 입력값의 첫 번째 숫자가 2 이고 두 번째 숫자가 6 이하이거나,
		// 입력값의 첫 번째 숫자가 1일 때
		if ((str.charAt(0) == '2' && str.charAt(1) <= '6') || str.charAt(0) == '1') {
			// solution 메소드에 index값을 1로 넘겨서 값을 받아옴
			result = (solution(1) % MOD) % MOD;
		}
		System.out.println(result);
	}

	// index는 무조건 0 or 1로 받아옴
	static int solution(int index) {
		// result값 초기화
		int result = 0;

		// index값과 입력된 숫자의 길이가 같으면
		// 1을 리턴
		if (index == len - 1) {
			return 1;
		}

		// 입력받은 숫자 배열의 index가 -1이 아니면,
		// 입력받은 숫자 배열의 index를 리턴
		if (cache[index] != -1) {
			return cache[index];
		}

		// index값+1이 입력된 숫자 길이보다 작으면,
		if (index + 1 < len) {
			// 입력받은 숫자의 (index+1)번째의 숫자가 0이 아니면,
			if (str.charAt(index + 1) != '0')
				// ??
				result = (result % MOD + solution(index + 1) % MOD) % MOD;
		}

		// index값+2이 입력된 숫자 길이보다 작으면,
		if (index + 2 < len) {
			// 입력받은 숫자의 (index+1)번째 숫자가 2이고, (index+2)번째 숫자가 6이거나,
			// 입력받은 숫자의 (index+1)번째 숫자가 1이면,
			if ((str.charAt(index + 1) == '2' && str.charAt(index + 2) <= '6') || (str.charAt(index + 1) == '1')) {
				
				result = (result % MOD + solution(index + 2) % MOD) % MOD;
			}
		}
		
		//숫자 배열을 result에 저장하고 리턴
		return cache[index]= result;
	}
}
