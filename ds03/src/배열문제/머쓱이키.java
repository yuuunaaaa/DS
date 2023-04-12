package 배열문제;

public class 머쓱이키 {
	public static void main(String[] args) {
		int[] array = { 149, 180, 192, 170 };
		int height = 167;
		Solution7 sol = new Solution7();
		int answer = sol.solution(array, height);
		System.out.println(answer);
	}
}

class Solution7 {
	public int solution(int[] array, int height) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > height)
				answer++;
		}
		return answer;
	}
}