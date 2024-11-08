package ch04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class productTest {
	public static long product(int ...ns) {
		long result = 1;
		for(var n : ns) {
			result *= n;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Product of all input");
		try(Scanner scanner = new Scanner(System.in)){			
			System.out.print("# of input integers: ");
			int n = scanner.nextInt();
			if(n < 0) throw new InputMismatchException();
			if(n == 0) {
				System.out.println(1);
				return;
			}
			int index = 0;
			int[] target = new int[n];
			
			while(index < target.length) {
				String line = scanner.nextLine();
				if(line.isBlank()) continue;
				
				target[index] = Integer.parseInt(line);
				index++;
			}
			System.out.println(product(target));
		}catch(InputMismatchException | NumberFormatException e) {
			System.err.println("Not expected such input, restart program");
		}
	}
}
