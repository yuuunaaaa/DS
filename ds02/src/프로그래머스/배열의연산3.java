package 프로그래머스;

import java.util.Arrays;

public class 배열의연산3 {

	public static void main(String[] args) {
		Solution6 sol = new Solution6();
		int[] numbers = {4, 3, 2, 7, 5, 10, 8, 9};
		int answer = sol.solution(numbers);
		System.out.println(answer);
	}

}

class Solution6 {
	public int solution(int[] numbers) {
		Arrays.sort(numbers); //파괴형!
		int answer = numbers[numbers.length - 2] 
					* numbers[numbers.length - 1];
		return answer;
	}
}