package 배열문제;

import java.util.Arrays;

public class 배열자르기 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		int num1 = 1;
		int num2 = 3;
		Solution12 sol = new Solution12();
		int[] answer = sol.solution(numbers, num1, num2);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution12 {
	public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int n = 0;
        for (int i = num1; i <= num2; i++) {
            answer[n] = numbers[i];
            n++;
        }
        return answer;
    }
}