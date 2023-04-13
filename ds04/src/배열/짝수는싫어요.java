package 배열;

import java.util.Arrays;

public class 짝수는싫어요 {
	public static void main(String[] args) {
		int n = 0;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(n);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution3 {
	public int[] solution(int n) {
        int len = n%2==0 ? n/2 : n/2+1;
        int[] answer = new int[len];
        int i = 0;
        for (int j = 1; j <= n; j += 2) {
                answer[i] = j;
            i++;
        }
        return answer;
    }
}