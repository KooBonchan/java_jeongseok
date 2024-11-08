package ch04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class regNoTest {
	public static void main(String[] args) {
		System.out.print("RegNo: ");
		try(Scanner scanner = new Scanner(System.in)){
			int genderSpecifier = scanner.nextLine().charAt(7) - '0';
			if(genderSpecifier > 4 || genderSpecifier < 1) throw new IndexOutOfBoundsException();
			boolean isMale = (genderSpecifier % 2 == 1);
			boolean bornBefore2000 = (genderSpecifier < 3);
			
			System.out.printf("You are %s, born %s 2000/01/01\n",
					   		  isMale ? "male" : "female",
					   		  bornBefore2000 ? "before" : "after");

//			switch(gender) {
//			case '1':
//				System.out.println("You are Male, Born before 2000.");
//				break;
//			case '2':
//				System.out.println("You are Female, Born before 2000.");
//				break;
//			case '3':
//				System.out.println("You are Male, Born after 2000.");
//				break;
//			case '4':
//				System.out.println("You are Female, Born after 2000.");
//				break;
//			default:
//				throw new IndexOutOfBoundsException();
//			}
		} catch(InputMismatchException e) {
			System.err.println(e.getMessage());
		} catch(IndexOutOfBoundsException e) {
			System.err.println("Wrong RegNo");
		}
	}
}
