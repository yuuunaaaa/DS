package 문자열;

public class 문자열다루기기본숫자찾기 {

	public static void main(String[] args) {
		String s ="a234";
		boolean answer = false;
		
		int size = s.length();
		if (size == 4 || size == 6) {
			char[] c = s.toCharArray();
			for (char x : c) {
				if (x < '0' || x > '9') {
					answer= false;
					break;
				}
			}
		}
		else {
			answer = true;
		}
		System.out.println(answer);
		System.out.println(32 + 'A');
		
		if (size == 4 || size == 6) {
			try {
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				answer = false;
			}
			
		} else {
			answer = true;
		}
	}

}
