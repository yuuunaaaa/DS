package 문자열;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		String[] allS = all.split(",");
		for (int i = 0; i < allS.length; i++) {
			allS[i] = allS[i].trim();
		}
		System.out.println("과목 수  : " + allS.length);
		
		int cnt = 0;
		for (int i = 0; i < allS.length; i++) {
			if (allS[i].equals("컴퓨터")) {
				System.out.println((i + 1) +"번째");
			}
			if (allS[i].length() < 3) {
				cnt++;
			}
		}
		System.out.println("과목명이 3글자 미만인 과목수 : " + cnt);
	}

}
