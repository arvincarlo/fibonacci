/**
*	Name: Rodrigo Galura III
* 	Course: BSIS II
* 	Date created: 7/21/15
*/

public class Test {
	public static void main(String[] args) {
		int n = 10; // n is the number of fibonacci sequence
		Fibonacci fibo = new Fibonacci(n);

		IO.jout("Print Fibonacci sequence by naive method", true);
		fibo.printFibonacciByNaive();

		IO.endl();

		IO.jout("Print Fibonacci sequence by recursion method", true);
		fibo.printFibonacciByRecursion();
	}
}