package ch06;

public class Recurs {
	static long factorial(int n) {
		if (n < 0) throw new IllegalArgumentException();
		if (n < 2) return 1;
		if (n > 20) return -1; // result out of bound
		return n * factorial(n-1);
	}
	
	static String concat(String delim, String...strings) {
		if(strings.length == 0) return "";
		StringBuilder stringBuilder = new StringBuilder(strings[0]);
		for(int i = 1; i < strings.length; i++) {
			stringBuilder
			.append(delim)
			.append(strings[i]);
		}
		return stringBuilder.toString();
	}
	
	
	public static void main(String[] args) {
		String[] strings = "100,200,300".split(",");
		System.out.println(concat("","100","200","300"));
		System.out.println(concat(":",strings));
		System.out.println(concat("-",new String[] {"100","200","300"}));
		System.out.println('[' + concat("|") + ']');
		System.out.println('[' + concat("|", new String[0]) + ']');
		
	}
}
