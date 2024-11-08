package ch05;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class shuffler {
	static final Random random = new Random();
	
	
	public static void shuffle(int[] target) {
		shuffle(target, target.length);
	}
	public static void shuffle(int[] target, int k) {
		int n = target.length;
		for(int i = 0; i < k; i++) {
			int index = random.nextInt(n-i) + i;
			int temp = target[i];
			target[i] = target[index];
			target[index] = temp;
		}
		
	}
	
	public static void bubbleSort(int[] target) {
		for(int i = 0; i < target.length - 1; i++) {
			boolean changed = false;
			for(int j = 0; j < target.length - 1 - i; j++){
				if(target[j] > target[j+1]) {
					int temp = target[j+1];
					target[j+1] = target[j];
					target[j] = temp;
					changed = true;
				}
			}
			if( ! changed) break;
		}
	}
	
	public static int[] countOfDigit(long a) {
		int[] digits = new int[10];
		for(; a > 0; a /= 10) {
			digits[(int)(a%10)]++;
		}
		return digits;
	}
	
	public static void main(String[] args) {
		
		int[] slot = IntStream.rangeClosed(1, 45).toArray();
//		System.out.println(Arrays.toString(countOfDigit(133144652723l)));
		for(int i = 0; i < 15; i++) {
			shuffle(slot, 6);
			System.out.println(Arrays.toString(Arrays.copyOf(slot, 6)));
		}
	}
}
