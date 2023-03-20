package recursion;

public class RecursionFibonacci {

//	fibonacci with recursion
//	note to myself: Ternary operators(? :) works like an if and else, Condition? if true : if false;

	public static int fibonacci(int num) {
//		if(num < 2) {
//			return 1;
//		}
		
		return num < 2 ? num : fibonacci(num - 1) + fibonacci(num - 2);

	}
	
	public static void printTerms(int terms) {
		
		for(int i = 0; i<=terms; i++) {
			System.out.println(("(termo :" + i + ")" + fibonacci(i) ));
			
		}
		
	}
}
