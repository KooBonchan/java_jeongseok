package ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		try {
			System.out.print("x: "); x = scanner.nextInt();
			System.out.print("y: "); y = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Not an Integer");
			return;
		}
		
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
		if(y != 0) {
			System.out.printf("%d / %d = %.2f\n", x, y, x/(double)y);
			System.out.printf("%d %% %d = %d\n", x, y, x%y);
		}
		scanner.close();
	}
}
