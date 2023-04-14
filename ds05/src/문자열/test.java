package 문자열;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		int[] emergency = {3, 76, 24};
		Solution0 sol = new Solution0();
		int[] answer = sol.solution(emergency);
		System.out.println(answer);
	}
}

class Solution0 {
	public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for (int x = 0 ; x < emergency.length; x++) {
        	answer[x] = emergency[x];
        }
        for (int i =0; i < emergency.length; i++) {
            for (int j =0; j < emergency.length; j++) {
            if (answer[i] == emergency[j]) {
                answer[i] = j+1;
            }
        }
            System.out.println(Arrays.toString(answer));
        }
        return answer;
    }
}