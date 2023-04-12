package 배열문제;

import java.util.*;

public class 중앙값구하기2 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		Arrays.sort(s);
		Solution6 sol = new Solution6();
		int answer = sol.solution(s);
		System.out.println(answer);
	}
}

class Solution6 {
	public int solution(int[] array) {
		Arrays.sort(array);
		if (array.length % 2 == 0) {
			return array[array.length / 2] + array[array.length / 2+1];
		}
		return array[array.length / 2];
	}
}