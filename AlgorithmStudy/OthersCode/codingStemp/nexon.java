/*
 * 
 어떤 자연수 n이 있을 때, d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자.

예를 들어

d(91) = 9 + 1 + 91 = 101

이 때, n을 d(n)의 제네레이터(generator)라고 한다. 위의 예에서 91은 101의 제네레이터이다.

어떤 숫자들은 하나 이상의 제네레이터를 가지고 있는데, 101의 제네레이터는 91 뿐 아니라 100도 있다. 그런데 반대로, 제네레이터가 없는 숫자들도 있으며, 
이런 숫자를 인도의 수학자 Kaprekar가 셀프 넘버(self-number)라 이름 붙였다. 예를 들어 1,3,5,7,9,20,31 은 셀프 넘버 들이다.

1 이상이고 5000 보다 작은 모든 셀프 넘버들의 합을 구하라.

--------------------------------------------------------------------------------------------------------------------

d(101) = 1+0+1+101=103

*/

package codingStemp;

import java.util.ArrayList;

//1. self-number가 아닌 숫자를 찾아 리스트로 정리한다.
//2. 1 - 4999중 해당 리스트에 포함되지 않는 숫자를 전부 더한다.


public class nexon {
	//5000은 포함하지 않는다
	private static final int LIMIT = 4999;
	
	//generator를 가지는 1-LIMIT 범위 내의 숫자 목록
	private static ArrayList<Integer> notSelfNumberList;
	
	public static void main(String[] args) {
		initNotSelfNumberList();
		
		printTotalSelfNumberSum();
		
	}
	//not self-number list 셋팅
	public static void initNotSelfNumberList(){
		notSelfNumberList = new ArrayList<Integer>();
		
		//5000보다 작으며 5000에 가장 근접한 self값을 모르며 제한되는 generator를 모르기 때문에 LIMIT까지 진행
		for (int i = 0; i <= LIMIT; i++) {
			//해당 숫자를 generator로 가지는 값을 찾아낸다.
			//찾아낸 수는 generator를 가지고 있으므로 notSelfNumberList에 포함 한다.
			//이때 생성된 수가 최초로 LIMIT값을 넘게 되는 순간 break(해당 숫자는 notSelfNubmerList에 포함 안됨)
			
			String strNum = String.valueOf(i);
			//자기 자신도 더해야 하므로 우선 자기 자신을 최초 숫자로 셋팅
			int notSelfNumber = i;
			//각 자리수를 전부 분해하여 더한다.
			for (int idx = 0; idx < strNum.length(); idx++) {
				notSelfNumber += Integer.parseInt(strNum.substring(idx, idx+1));
			}
			
			//더한 숫자가 한도 범위를 벗어난다면 for문 중단.
			if(notSelfNumber>LIMIT) break;
			
			//한도를 넘지 않았다면 not self-number list에 포함
			notSelfNumberList.add(notSelfNumber);
		}
		
	}
	public static void printTotalSelfNumberSum(){
		int sum=0;
		
		//1부터 LIMIT까지 진행
		for (int i = 0; i <= LIMIT; i++) {
			//not self-number list에 포함되어 있다면 통과
			if(notSelfNumberList.contains(i)) continue;
			//아니라면 최종합에 더하기
			sum += i;
		}
		System.out.println("1부터 "+LIMIT+"까지 self-number가 아닌 모든 수의 합 : "+sum);
	}
}