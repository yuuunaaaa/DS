package 프로그래머스기본;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		int n = 15;
		Solution2 sol = new Solution2();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution2 {
	public int solution(int n) {
	    int answer = 0;
	    int i=1;
	    while (i<=600) {
	        if (i%6 == 0 && i%n ==0){
	            answer=i;
	            break;
	        }
	        i++;
	    }
	    return answer/6;
	}
}
