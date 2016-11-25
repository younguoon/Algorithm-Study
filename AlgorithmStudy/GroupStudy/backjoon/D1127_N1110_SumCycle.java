package backjoon;

import java.util.Scanner;

public class D1127_N1110_SumCycle {

	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		
		int M = 0;
		int i = 0;
		int nam = 0;
		int mok = 0;
		int sum = 0;
		int nam2 = 0;
		
		if(N == 0) i++;
		
		while (N != M) {
			
			i++;
			
			if(i == 1){
				nam = N%10;
				mok = N/10;
			}else {
				nam = M%10;
				mok = M/10;
			}
			sum = nam + mok;
			nam2 = sum%10;
			M = nam*10+nam2;
		}
		System.out.println(i);
		
	}

}