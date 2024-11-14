package ch08;

import java.util.Random;

public class ExceptionExample {
	public static void main(String[] args) {
		Random random = new Random();
		
		int number = 100;
		int result = 0;
		try {
			for (int i = 0; i < 10; i++) {
				result += number / random.nextInt(10);
			}
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		} 
		
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException | MemoryException e) {
			System.err.println(e.getMessage());
			System.gc();
		} finally {
			deleteTempFiles();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) throw new SpaceException();
		if(!enoughMemory()) throw new MemoryException();
		return;
	}
	//dummy, semantic only
	static void copyFiles() {}
	static void deleteTempFiles() {}
	
	//mock error situation
	static boolean enoughSpace() {return true;}
	static boolean enoughMemory() {return false;}
}

class SpaceException extends RuntimeException{
	private static final long serialVersionUID = -1877172328773494103L;

	SpaceException() {
		super("Not enough space to install");
	}
}
class MemoryException extends RuntimeException{
	private static final long serialVersionUID =  7879690388427862886L;

	MemoryException() {
		super("No remaining Memory");
	}
}
