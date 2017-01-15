//https://www.acmicpc.net/problem/11945

package backjoon;

import java.util.Scanner;

public class D0114_N11945_HotBread {
	static int i=0, j=0;
   public static void main(String[] args){
	 System.out.println("저장할 행,열을 입력하세요");
	 Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();
	 int M = sc.nextInt();
	 sc.nextLine();
	 char bread[][] = new char[N][M];
	 String str;
	 
	 for(i=0;i<N;i++){
		 str=sc.nextLine();
		 bread[i]=str.toCharArray();
	 }
	 
	 for(i=0;i<N;i++){
		 for(j=M-1;j>=0;j--){
			 System.out.print(bread[i][j]);
		 }
		 System.out.println();
	 }
	 sc.close();
   }
}
	 
	 
//	 for (a = 0; a <= N; a++) {
//	 	for (b = 0; b < M; b++) {
//	 		bread[a][b] = sc.nextInt();
//	 	}
//	 }
//	 for (int i = 0; i < N; i++) {
//	 	System.out.println();
//	 	for (int j = 0; j < M; j++) {
//	 		System.out.print(bread[i][j] + " ");
//	 	}
//	 }
