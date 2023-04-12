package 프로그래머스기본;

public class 프로그래머스0 {

	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		Solution0 sol = new Solution0();
		int answer = sol.solution(n, k);
		System.out.println(answer);
	}
}

class Solution0 {
	 public int solution(int n, int k) {
	        k = k - (n/10);
	        return (n*12000) + (k*2000);
	    }

}
