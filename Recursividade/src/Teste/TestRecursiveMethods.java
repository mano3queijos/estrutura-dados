package Teste;

import java.util.Scanner;

import recursion.RecursionFactorial;
import recursion.RecursionFibonacci;
import recursion.RecursionSummation;

public class TestRecursiveMethods {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
//
//		System.out.println("recursive Factorial");
//		System.out.println(RecursionFactorial.fatorialWithRecursion(4));
//		System.out.println("\r\n");

//		System.out.println("recursive Fibonacci");
//		System.out.println("Inforem o termo da sequancia de fibonacci que deseja mostrar");
//		int fibTerm = scan.nextInt();
//		RecursionFibonacci.printTerms(fibTerm);
//		System.out.println(RecursionFibonacci.fibonacci(fibTerm));
//		

		System.out.println("\r\n");
		System.out.println("recursive summation");
		System.out.println("Informe o termo do somatório");
		int summationTerm = scan.nextInt();
		System.out.println(RecursionSummation.summation(summationTerm));
		RecursionSummation.summationTerms(summationTerm);

	}

}
