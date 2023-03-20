package recursion;

public class RecursionFactorial {

//	class with methods with recursion

//	Recursion basically is when a class has the power to call itself

//
	public static int noRecursiveFactorial(int num) {

		if (num == 0) {
			return 1;
		}
		int total = 1;
		for (int i = num; i >= 1; i--) {
			total *= i;
			System.out.println(i);
		}
		return total;
	}

//	factorial with recursion
//	factorial(5) = 5 * fatorial(4)
	public static int fatorialWithRecursion(int num) {
		if (num == 0) {
			return 1;
		}
		System.out.println(num);

		return num * fatorialWithRecursion(num - 1);

	}


}
