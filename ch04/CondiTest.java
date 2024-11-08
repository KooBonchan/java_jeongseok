package ch04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CondiTest {
	public static boolean isNumberOrAlphabet(char c) {
		if (c <= 'z' && c >= 'a') return true;
		if (c <= 'Z' && c >= 'A') return true;
		if (c <= '9' && c >= '0') return true;
		return false;
	}
	public static boolean isNumberOrAlphabet(String s) {
		return s != null && s.matches("^[a-zA-Z0-9]$");
	}
	
	public static int sumTo(int n) {
		if (n <= 0) return 0;
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
//		sum = n * (n + 1) / 2;
		return sum;
	}
	
	public static String score(int n) {
		if(n > 100) return "You've cheated";
		else if(n >= 90) return "A";
		else if(n >= 80) return "B";
		else if(n >= 70) return "C";
		else if(n >= 60) return "D";
		return "F";
	}
	
	public static long factorial(int n) {
		if(n < 0) return -1;
		if(n > 20) return -1; // number out of long bound
		long result = 1;
		for(int i = 2; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static long recursiveFactorial(int n) {
		if(n > 20) throw new IndexOutOfBoundsException();
		if(n <= 1) return 1;
		return n * recursiveFactorial(n-1);
	}
	
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.print("character: ");
			String line = scanner.nextLine();
			if(line.isEmpty()) {
				System.out.println("No char is given: skip char test");
			} else {
				char c = line.charAt(0);				 
				if(isNumberOrAlphabet(c)) System.out.println("Good Char");
				else System.out.println("Bad Char");
			}
			/************************/
			
			System.out.print("Number to decide range: ");
			int number = scanner.nextInt();
			if (number == 0) 	 System.out.println("Zero");
			else if (number > 0) System.out.println("Positive");
			else                 System.out.println("Negative");
			/************************/
			
			System.out.print("Number to accumulate: ");
			number = scanner.nextInt();
			System.out.println(sumTo(number));
			
			System.out.print("Your Score: ");
			number = scanner.nextInt();
			System.out.println(score(number));

			System.out.print("Number to calculate factorial: ");
			long factorial = recursiveFactorial(scanner.nextInt());
			if(factorial < 0) System.out.println("Cannot calculate it. Out of available range");
			else System.out.println(factorial);
			
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
