package 문자열;

public class 문자열반복하기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int n = 23;
		Solution2 sol = new Solution2();
		String answer = sol.solution(my_string, n);
		System.out.println(answer);
	}

}
class Solution2 {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}