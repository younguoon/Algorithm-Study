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
	// ���� ���� �迭 ����
	static int[] cache = new int[5001];
	// ���� ��������
	static String str;
	// ���� ���� ��������
	static int len;
	// �ִ밪�� ���ϸ� �ȵǹǷ� final
	static final int MOD = 1000000;
	
	public static void main(String[] args) throws IOException {
		// ����, �迭, ���� ���ۿ� ���� �� ������ �Է½�Ʈ������ �ؽ�Ʈ�� �о� ���δ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("���ڸ� �Է��ϼ���");
		// �Է¹��� ���� ����
		// read��� readLine�� ����ؼ� �����ʱ�ȭ�� ������� �ʵ��� �Ѵ�.
		str = br.readLine();
		// ���� ���� ����
		len = str.length();
		
		for (int i = 0; i < cache.length; i++) {
			cache[i] = -1;
		}

		// �Է°��� ù��° ���ڰ� 0�̸� ������ 0������ ����
		int result = 0;

		// �Է°��� ù��° ���ڰ� 0�� �ƴ� ��
		if (str.charAt(0) != '0') {
			// solution �޼ҵ忡 index���� 0���� �Ѱܼ� ���� �޾ƿ�
			// result�� 100������ �Ѿ�� �� �̾߱���
			result = (solution(0) % MOD) % MOD;
		}

		// �Է°��� ù ��° ���ڰ� 2 �̰� �� ��° ���ڰ� 6 �����̰ų�,
		// �Է°��� ù ��° ���ڰ� 1�� ��
		if ((str.charAt(0) == '2' && str.charAt(1) <= '6') || str.charAt(0) == '1') {
			// solution �޼ҵ忡 index���� 1�� �Ѱܼ� ���� �޾ƿ�
			result = (solution(1) % MOD) % MOD;
		}
		System.out.println(result);
	}

	// index�� ������ 0 or 1�� �޾ƿ�
	static int solution(int index) {
		// result�� �ʱ�ȭ
		int result = 0;

		// index���� �Էµ� ������ ���̰� ������
		// 1�� ����
		if (index == len - 1) {
			return 1;
		}

		// �Է¹��� ���� �迭�� index�� -1�� �ƴϸ�,
		// �Է¹��� ���� �迭�� index�� ����
		if (cache[index] != -1) {
			return cache[index];
		}

		// index��+1�� �Էµ� ���� ���̺��� ������,
		if (index + 1 < len) {
			// �Է¹��� ������ (index+1)��°�� ���ڰ� 0�� �ƴϸ�,
			if (str.charAt(index + 1) != '0')
				// ??
				result = (result % MOD + solution(index + 1) % MOD) % MOD;
		}

		// index��+2�� �Էµ� ���� ���̺��� ������,
		if (index + 2 < len) {
			// �Է¹��� ������ (index+1)��° ���ڰ� 2�̰�, (index+2)��° ���ڰ� 6�̰ų�,
			// �Է¹��� ������ (index+1)��° ���ڰ� 1�̸�,
			if ((str.charAt(index + 1) == '2' && str.charAt(index + 2) <= '6') || (str.charAt(index + 1) == '1')) {
				
				result = (result % MOD + solution(index + 2) % MOD) % MOD;
			}
		}
		
		//���� �迭�� result�� �����ϰ� ����
		return cache[index]= result;
	}
}
