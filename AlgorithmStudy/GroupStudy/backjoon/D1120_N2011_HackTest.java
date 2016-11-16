package backjoon;

import java.util.Scanner;

public class D1120_N2011_HackTest {

		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.println(diffBtwStr(str1, str2));
		}

		static int diffBtwStr(String str1, String str2) {
			int minDiff = Integer.MAX_VALUE;
			int cnt = 0;
			int j = 0;
			for (int k = 0; k <= str2.length() - str1.length(); k++) {
				cnt = 0;
				for (int i = 0; i < str1.length(); i++) {
					if (str1.charAt(i) != str2.charAt(i + j))
						cnt++;
				}
				j++;
				minDiff = Math.min(minDiff, cnt);
			}
			return minDiff;
		}
	}
