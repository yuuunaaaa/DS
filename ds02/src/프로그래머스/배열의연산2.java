package 프로그래머스;

public class 배열의연산2 {

	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int answer = sol.solution(numbers);
		System.out.println(answer);
	}

}

class Solution5 {
	public int solution(int[] numbers) {
		int answer = 0;
		int post = numbers[numbers.length - 1] * numbers[numbers.length - 2];
		int pre = numbers[0] * numbers[1];
		answer = post > pre ? post : pre;
		return answer;
	}
}