package basic;

//1부터 100까지 짝수의 합을 구하는 프로그램

class Sum2

{

	public static void main(String[] args)

	{

		// Type : 1

		// [1] Init & Input

		int sum = 0;

		int i = 0;

		// [2] Process

		for (i = 1; i <= 100; i++)

		{

			if (i % 2 == 0) {

				sum = sum + i;

			}

		}

		// [3] Output

		System.out.println(sum);

		// Type : 2

		// [1] Init & Input

		sum = 0;

		i = 1;

		// [2] Process

		while (i <= 100) {

			if (i % 2 == 0)
				sum = sum + i;

			i++;

		}

		// [3] Output

		System.out.println(sum);

	}

}
