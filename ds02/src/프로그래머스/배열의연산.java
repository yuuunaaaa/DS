package 프로그래머스;

public class 배열의연산 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int answer = sol.solution(numbers);
		System.out.println(answer);
	}

}

class Solution4 {
	public int solution(int[] numbers) {
		int answer = numbers[numbers.length - 1] + numbers[numbers.length - 2] + numbers[numbers.length - 3];

		return answer;
	}
}