package recursion;

public class RecursionSummation {

//	5S = 5+4+3+2+1
	public static int summation(int num) {

		return num < 2 ? num : num + summation(num - 1);
	}

	public static void summationTerms(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(num - i + " ");
		}
	}
}
