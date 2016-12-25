//https://www.acmicpc.net/problem/2156
//가중치의 합의 최대

package backjoon;  

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D1225_N2156_Grape {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		System.out.println("n : "+n);
		int[] d = new int[n + 1];
		int[] wine = new int[n + 1];
		
		for(int i = 1 ; i <= n ; i++) {
			wine[i] = Integer.parseInt(in.readLine()); 
		}
		
		d[1] = wine[1];
		
		if(n >= 2)
			d[2] = wine[1] + wine[2];
		
		for(int i = 3 ; i <= n ; i++) {
			// 한잔도 안 마셨을 때
			d[i] = d[i - 1]; 
			System.out.println("d[i]"+d[i]);
			if(d[i] < d[i - 2] + wine[i])
				// 한잔도 안 마셨을 때
				d[i] = d[i - 2] + wine[i];
			if(d[i] < d[i - 3] + wine[i] + wine[i - 1])
				// 한잔도 안 마셨을 때
				d[i] = d[i - 3] + wine[i] + wine[i - 1];
		}
		
		System.out.println(d[n]);
	}
}
