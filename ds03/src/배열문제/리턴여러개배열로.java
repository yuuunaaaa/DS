package 배열문제;

public class 리턴여러개배열로 {
	public static void main(String[] args) {
		int money = 15000;
		Solution9 sol = new Solution9();
		int[] answer = sol.solution(money);
		System.out.println(answer);
	}
}

class Solution9 {
	public int[] solution(int money) {
		int[] answer = new int[2];
	    answer[0] = money / 5500; 
	    answer[1] = money % 5500; 
        return answer;
    }
}