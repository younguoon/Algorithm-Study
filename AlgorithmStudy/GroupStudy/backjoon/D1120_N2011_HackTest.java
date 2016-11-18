/*

���� (2011��) _ `16.11.20
����̿� �����̰� �ٸ� ������� ���Ű��� ��ȭ�� ��� ���� �����ϱ� ���ؼ� ��ȭ�� ���� ��ȣȭ �ϱ�� �ߴ�.
�׷��� ������ ���� ��ȭ�� �ߴ�.
- ���: �׳� ������ ��ȣȭ ����. A�� 1�̶�� �ϰ�, B�� 2��, �׸��� Z�� 26���� �ϴ°ž�.
- ����: �׷� �ȵ�. ����, "BESN"�� ��ȣȭ�ϸ� 25114�� �����µ�, �̰� �ٽ� ���ڷ� �ٲٴ� ����� ���������� �־�.
- ���: �׷���. 25114�� �ٽ� ����� �ٲٸ�, "BEAAD", "YAAD", "YAN", "YKD", 'BEKD", "BEAN" �� 6������ �����µ�,
	   BEAN�� �´� �ܾ��°� ���� �� �� ���ݾ�?
- ����: ���� �������� �ʾҳפ̤� ���� ���� 500�ڸ� ���ڸ� ��ȣȭ �ߴٰ� �غ�, �� ���� ���� �� �ִ� �ؼ��� ���� ������, �װ� ���� ���غ�?
- ���: �󸶳� ������?
- ����: ���غ���!
� ��ȣ�� �־����� �� �� ��ȣ�� �ؼ��� �� ������ ���� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�

�Է�
ù° �ٿ� 5000�ڸ� ������ ��ȣ�� �־�����.

��� 
���� �� �ִ� �ؼ��� �������� ���Ͻÿ�. ������ �ſ� Ŭ �� �����Ƿ�, 1000000���� ���� �������� ����Ѵ�.

�����Է� 25114
������� 6

*/

package backjoon;

import java.io.*;

public class D1120_N2011_HackTest {
	static int[] cache = new int[5001]; //���� �迭 ����
	static String str;//���� ��������
	static int len; //���� ���� ��������
	static final int MOD = 1000000; //�ִ밪�� ���ϸ� �ȵǹǷ� final

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine(); //�Է¹��� ���� ����
		len = str.length(); //���� ���� ����

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


