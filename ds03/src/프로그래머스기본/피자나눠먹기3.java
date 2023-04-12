package 프로그래머스기본;

public class 피자나눠먹기3 {

	public static void main(String[] args) {
		int slice = 12;
		int n = 4;
		Solution3 sol = new Solution3();
		int answer = sol.solution(slice, n);
		System.out.println(answer);
	}
}

class Solution3 {
	public int solution(int slice, int n) {
		return n % slice == 0 ? n / slice : n / slice + 1;
	}
}
