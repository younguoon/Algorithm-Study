/*

*/
package backjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class D1204_N1931_ConferenceRoom {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int conf[][] = new int[N][2];
      for (int i = 0; i < N; i++) {
         conf[i][0] = sc.nextInt();
         conf[i][1] = sc.nextInt();
      }

      //comparator 인터페이스 사용
      //자손클래스를 하나 만들어서 구현해 줘야 함.
      
      //지정된 Comparator가 가리키는 순서에 따라, 지정된 오브젝트의 배열을 소트.
      Arrays.sort(conf, new Comparator<int[]>() {
         
         @Override
         //2개의 인수(o1,o2) 를 비교
         public int compare(int[] o1, int[] o2) {
            //오름차순이면 내림차순으로, 내림차순이면 오름차순으로 변경... 최종은 오름차순으로 나오도록
            if (o1[1] > o2[1] || (o1[1] == o2[1] && o1[0] > o2[0]))
               return 1;
            return -1;
            //리턴값이 -1 이면 내림차순, 0 이면 같음, 1 이면 오름차순
         }
      });
      //end와 Ans값 초기화
      int end = -1;
      int Ans = 0;
      
      //입력받은 N값 만큼 for문으로
      for (int i = 0; i < N; i++) {
         //정렬된 conf 배열의 1열 값을 end와 비교해서 조건에 맞으면 
         //Ans(결과값)값을 1씩 증가, end값에 2열 값을 대입
         //
         if (conf[i][0] >= end) {
            Ans++;
            end = conf[i][1];
         }
      }
      System.out.println("정답 : "+Ans);
//      
//      System.out.println("");
//      System.out.println("conf[0][0] : "+conf[0][0]+"  conf[0][1] : "+conf[0][1]);
//      System.out.println("conf[1][0] : "+conf[1][0]+"  conf[1][1] : "+conf[1][1]);
//      System.out.println("conf[2][0] : "+conf[2][0]+"  conf[2][1] : "+conf[2][1]);
//      System.out.println("conf[3][0] : "+conf[3][0]+"  conf[3][1] : "+conf[3][1]);
//      System.out.println("conf[4][0] : "+conf[4][0]+"  conf[4][1] : "+conf[4][1]);
//      System.out.println("conf[5][0] : "+conf[5][0]+"  conf[5][1] : "+conf[5][1]);
      
//      System.out.println("end : "+end);
      
   }
}