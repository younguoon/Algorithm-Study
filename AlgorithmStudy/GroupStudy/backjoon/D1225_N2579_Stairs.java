//https://www.acmicpc.net/problem/2579

package backjoon; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1225_N2579_Stairs {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine().trim());
		int stairs[] = new int[input+1];
		for(int i=1 ; i <= input ; i++) {
			stairs[i] = Integer.parseInt(br.readLine().trim());
		} // 입력완료
		
		int dp[][] = new int[input+1][3];
		
		// dp 앞에는 현재 위치. 뒤에는 직전에 움직인 계단 수.
		// 이전에 1칸으로 올라왔으면 그 다음번에 1칸만 오를 수 없다.
		dp[1][1] = stairs[1];
		dp[1][2] = stairs[1]; 
		
//		dp[2][1] = stairs[1] + stairs[2];
//		dp[2][2] = stairs[2];
//		
//		dp[3][1] = dp[2][2] + stairs[3];
//		dp[3][2] = Math.max(dp[1][1] , dp[1][2]) + stairs[3]; //dp[1][2]는 원래는 없는값.? 
//		
//		dp[5][1] = dp[4][2] + stairs[5];
//		dp[5][2] = Math.max(dp[3][1],dp[3][2]) + stairs[5];
//		
//		dp[7][1] = dp[7][2] + stairs[7];
//		dp[7][2] = Math.max(dp[5][1], dp[5][2]) + stairs[7];
		
		// dp[3][1] 3번째 계단을 1칸씩 오르는걸로는 갈 수 없다. (문제조건)
		for(int i=2 ; i <= input ; i++) {
			dp[i][1] = dp[i-1][2] + stairs[i];
			dp[i][2] = Math.max(dp[i-2][1], dp[i-2][2]) + stairs[i];
		}
		
		System.out.println(Math.max(dp[input][1], dp[input][2]));
		
	}

}
