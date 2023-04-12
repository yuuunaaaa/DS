package 배열문제;

import java.util.*;

public class 중앙값구하기 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		Arrays.sort(s);
		Solution5 sol = new Solution5();
		int answer = sol.solution(s);
		System.out.println(answer);
	}
}

class Solution5 {
	public int solution(int[] array) {
		Arrays.sort(array);
		return array[array.length / 2];
	}
}