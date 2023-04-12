package 배열문제;

public class 좌표위치구하기 {
	public static void main(String[] args) {
		int[] dot = { 2, 4 };
		Solution8 sol = new Solution8();
		int answer = sol.solution(dot);
		System.out.println(answer);
	}
}

class Solution8 {
	public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        return answer;
    }
}