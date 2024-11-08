package ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc3 {
	static int add(int a, int b) {return a + b;};
	static int sub(int a, int b) {return a - b;};
	static int mul(int a, int b) {return a * b;};
	static double div(int a, int b){
		if(b == 0) throw new NumberFormatException("Zero Division");
		return a / (double)b;		
	};
	static int rem(int a, int b) {
		if(b == 0) throw new NumberFormatException("Zero Division");
		return a % b;
	};
	
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int x, y;
			try {
				System.out.print("x: "); x = scanner.nextInt();
				System.out.print("y: "); y = scanner.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Not an Integer");
				return;
			}
			
			System.out.printf("%d + %d = %d\n", x, y, add(x,y));
			System.out.printf("%d - %d = %d\n", x, y, sub(x,y));
			System.out.printf("%d * %d = %d\n", x, y, mul(x,y));
			try {
				System.out.printf("%d / %d = %.2f\n", x, y, div(x,y));
				System.out.printf("%d %% %d = %d\n", x, y, rem(x,y));
			} catch(NumberFormatException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
