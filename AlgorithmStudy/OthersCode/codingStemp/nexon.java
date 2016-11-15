/*
 * 
 � �ڿ��� n�� ���� ��, d(n)�� n�� �� �ڸ��� ���ڵ�� n �ڽ��� ���� ���ڶ�� ��������.

���� ���

d(91) = 9 + 1 + 91 = 101

�� ��, n�� d(n)�� ���׷�����(generator)��� �Ѵ�. ���� ������ 91�� 101�� ���׷������̴�.

� ���ڵ��� �ϳ� �̻��� ���׷����͸� ������ �ִµ�, 101�� ���׷����ʹ� 91 �� �ƴ϶� 100�� �ִ�. �׷��� �ݴ��, ���׷����Ͱ� ���� ���ڵ鵵 ������, 
�̷� ���ڸ� �ε��� ������ Kaprekar�� ���� �ѹ�(self-number)�� �̸� �ٿ���. ���� ��� 1,3,5,7,9,20,31 �� ���� �ѹ� ���̴�.

1 �̻��̰� 5000 ���� ���� ��� ���� �ѹ����� ���� ���϶�.

--------------------------------------------------------------------------------------------------------------------

d(101) = 1+0+1+101=103

*/

package codingStemp;

import java.util.ArrayList;

//1. self-number�� �ƴ� ���ڸ� ã�� ����Ʈ�� �����Ѵ�.
//2. 1 - 4999�� �ش� ����Ʈ�� ���Ե��� �ʴ� ���ڸ� ���� ���Ѵ�.


public class nexon {
	//5000�� �������� �ʴ´�
	private static final int LIMIT = 4999;
	
	//generator�� ������ 1-LIMIT ���� ���� ���� ���
	private static ArrayList<Integer> notSelfNumberList;
	
	public static void main(String[] args) {
		initNotSelfNumberList();
		
		printTotalSelfNumberSum();
		
	}
	//not self-number list ����
	public static void initNotSelfNumberList(){
		notSelfNumberList = new ArrayList<Integer>();
		
		//5000���� ������ 5000�� ���� ������ self���� �𸣸� ���ѵǴ� generator�� �𸣱� ������ LIMIT���� ����
		for (int i = 0; i <= LIMIT; i++) {
			//�ش� ���ڸ� generator�� ������ ���� ã�Ƴ���.
			//ã�Ƴ� ���� generator�� ������ �����Ƿ� notSelfNumberList�� ���� �Ѵ�.
			//�̶� ������ ���� ���ʷ� LIMIT���� �Ѱ� �Ǵ� ���� break(�ش� ���ڴ� notSelfNubmerList�� ���� �ȵ�)
			
			String strNum = String.valueOf(i);
			//�ڱ� �ڽŵ� ���ؾ� �ϹǷ� �켱 �ڱ� �ڽ��� ���� ���ڷ� ����
			int notSelfNumber = i;
			//�� �ڸ����� ���� �����Ͽ� ���Ѵ�.
			for (int idx = 0; idx < strNum.length(); idx++) {
				notSelfNumber += Integer.parseInt(strNum.substring(idx, idx+1));
			}
			
			//���� ���ڰ� �ѵ� ������ ����ٸ� for�� �ߴ�.
			if(notSelfNumber>LIMIT) break;
			
			//�ѵ��� ���� �ʾҴٸ� not self-number list�� ����
			notSelfNumberList.add(notSelfNumber);
		}
		
	}
	public static void printTotalSelfNumberSum(){
		int sum=0;
		
		//1���� LIMIT���� ����
		for (int i = 0; i <= LIMIT; i++) {
			//not self-number list�� ���ԵǾ� �ִٸ� ���
			if(notSelfNumberList.contains(i)) continue;
			//�ƴ϶�� �����տ� ���ϱ�
			sum += i;
		}
		System.out.println("1���� "+LIMIT+"���� self-number�� �ƴ� ��� ���� �� : "+sum);
	}
}