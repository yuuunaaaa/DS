package 배열;

public class 할머니편지 {
	public static void main(String[] args) {
		String message = "happy birthday!";
		Solution6 sol = new Solution6();
		int answer = sol.solution(message);
		System.out.println(answer);
	}
}

class Solution6 {
	public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }
}