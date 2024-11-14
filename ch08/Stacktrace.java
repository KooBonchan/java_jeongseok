package ch08;

public class Stacktrace {
	static void method1() throws RuntimeException {
		method2();
	}
	static void method2() throws RuntimeException{
		throw new RuntimeException("Check Stacktrace");
	}
	
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			method1();
			System.out.println(4);
		} catch (RuntimeException e) {
			System.out.println(5);
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
