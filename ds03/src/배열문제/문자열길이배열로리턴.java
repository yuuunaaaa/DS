package 배열문제;

public class 문자열길이배열로리턴 {
	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		Solution10 sol = new Solution10();
		int[] answer = sol.solution(strlist);
		System.out.println(answer);
	}
}

class Solution10 {
	 public int[] solution(String[] strlist) {
	        int[] answer = new int[strlist.length];
	        for (int i = 0; i < strlist.length; i++) {
	            answer[i] = strlist[i].length();
	        }
	        return answer;
	    }
}