package backjoon;

import java.io.*;
import java.util.Scanner;
 
public class D1225_N2156_Grape {
    public static void main(String[] args) throws IOException {
        new D1225_N2156_Grape().run();
    }

    int N;
    int[] A;
    int[][] DP;
    
    private void run() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bw.readLine());
        A = new int[N+1];
        DP = new int[N+1][3];
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(bw.readLine());
        }

        int max = 0;
        for (int ix = 1; ix <= N; ix++) {
        	for (int cnt = 0; cnt <= 2; cnt++) {
        		if (cnt == 0) {
        			DP[ix][cnt] = Math.max(DP[ix-1][2], Math.max(DP[ix-1][0], DP[ix-1][1]));
        		} else {
        			DP[ix][cnt] = DP[ix-1][cnt-1] + A[ix];
        		}
        		max = Math.max(max, DP[ix][cnt]);
        	}
        }

        System.out.println(max);
    }
}