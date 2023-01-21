package cop2800;

import java.util.Scanner;

public class HW_1 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println ("Enter a whole number: ");
		int x = userInput.nextInt();
		System.out.println("You wrote: " + x);
		System.out.println("Times three: " + x * 3);
		System.out.println("Divided by three: " + x /3.0);

	}

}
