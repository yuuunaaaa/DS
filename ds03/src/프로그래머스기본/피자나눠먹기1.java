package 프로그래머스기본;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		int n = 15;
		Solution1 sol = new Solution1();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution1 {
	public int solution(int n) {
		return n % 7 == 0 ? n / 7 : n / 7 + 1;
	}

}
