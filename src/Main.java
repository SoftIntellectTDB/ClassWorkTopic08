public class Main {
	public static void f1(int a, int b) {
		System.out.println(a + b);
	}

	public static int f2(int a, int b) {
		return a + b;
	}

	public static void f3(int array[]) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void f3(String text) {
		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*
		 * Дефинирайте метод, който получава 2 числа като параметър и отпечатва
		 * на екрана тяхната сума.
		 */
		f1(1, 2);

		/*
		 * Дефинирайте метод, който получава 2 числа като параметър и връща
		 * тяхната сума като резултат.
		 */
		System.out.println(f2(3, 4));

		/*
		 * Дефинирайте метод, който приема като параметър масив от числа и го
		 * изписва на екрана в обратен ред.
		 */
		f3(new int[] { 1, 2, 3, 4, 5 });

		/*
		 * Направете същия метод, който приема като параметър низ от символи и
		 * го изписва на екрана в обратен ред.
		 */
		f3("Hello!");
	}
}
