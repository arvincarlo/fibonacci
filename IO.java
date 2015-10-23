/*
	This class is just utility for showing or outputting
*/
public class IO {
	public static void jout(String param, boolean endline) {
		System.out.print(param + (endline ? "\n":"") );
	}

	public static void endl() {
		System.out.println();
	}

	public static void printArray(int[] array) {
		for ( int element : array ) {
			System.out.print(element + " ");
		}
	}
}