public class Modulusex {

	public static void main(String[] args) {

		int a = 25, b = 4;

		int remainder = a % b;

		System.out.println("Remainder: " + remainder);

	}
}

class IncDecExample {

	public static void main(String[] args) {

		int x = 10;

		System.out.println("Original: " + x);

		System.out.println("Post-increment: " + (x++));

		System.out.println("After post-increment: " + x);

		System.out.println("Pre-increment: " + (++x));

		
		System.out.println("Post-decrement: " + (x--));

		System.out.println("Pre-decrement: " + (--x));
	}
}