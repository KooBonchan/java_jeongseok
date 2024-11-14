package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedArrayComparison {
	public static void main(String[] args) {
		final int REPEAT = 100000;
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		add(arrayList,REPEAT);
		add(linkedList,REPEAT);
		System.out.println("ArrayList: " + checkTime(()->{
			for(int i = 0; i < 100000; i++) arrayList.get(i);
			return;
		}));
		System.out.println("LinkedList: " + checkTime(()->{
			for(int i = 0; i < 100000; i++) linkedList.get(i);
			return;
		}));
		
		
	}
	
	public static void add(List<String> list, int repeat) {
		for(int i = 0; i < repeat; i++) list.add(i+"");
	}
	
	@FunctionalInterface
	interface VoidFunction {
		void target();
	}
	public static long checkTime(VoidFunction func) {
		long start = System.currentTimeMillis();
		func.target();
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	
}
