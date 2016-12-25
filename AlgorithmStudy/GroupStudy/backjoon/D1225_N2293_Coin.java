//https://www.acmicpc.net/problem/2293

package backjoon; 


import java.util.Scanner;
 
public class D1225_N2293_Coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n+1];
		int d[] = new int[k+1];
		
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		d[0] = 1;
		for(int i=1;i<a.length;i++){
			for(int j=0;j<=k;j++){
				if(j>=a[i])
					d[j] = d[j]+d[j-a[i]]; 
			}
		}
		System.out.println(d[k]);
	}
}
