package ch05;

import java.util.Arrays;

public class plane {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{ 80,  70,  20},
				{100,  60,  30},
				{  0,  50,  40},
		};
		for(int i = 0; i < score.length; i++) {
			System.out.println(Arrays.toString(score[i]));
		}
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
		}
		System.out.println(sum);
		
		
	}
}
