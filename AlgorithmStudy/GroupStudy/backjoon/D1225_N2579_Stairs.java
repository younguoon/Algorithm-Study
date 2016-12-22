package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D1225_N2579_Stairs {
	static int[] D = new int[10001];
	static int T, N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = new String[2];
		temp = br.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		T = Integer.parseInt(temp[1]);

		D[0] = 1;

		for (int i = 1; i <= N; i++) {
			int c = Integer.parseInt(br.readLine());
			for (int j = c; j <= T; j++) {
				D[j] += D[j - c];
			}
		}

		System.out.println(D[T]);

	}

}