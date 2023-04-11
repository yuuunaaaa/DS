package 문자열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		int min = n[0];
		for (int x : n) {
			if (x < min) {
				min = x;
			}
		}
		System.out.println("최소값  : " + min);
	
	
		// 2
		Random r = new Random(20);
		int[] s = new int[900];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(900); //0~999
		}
		int max = s[0];
		
		for (int x1 : s) {
			if (x1 > max) max = x1;
		}//for
		System.out.println("최대값은 " + max);
		
		
		// 3
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		
		System.out.println("두 문자열은 동일한가? " + s1.equals(s2));
		System.out.println(s1.length() > s2.length() ? "s1이 더 큼" : "s2가 더 큼");
		
		
		// 4
		String s3 = "나는 진짜 java programmer가 되었어";
		String tmp = (String) s3.subSequence(6, 21);
		System.out.println(tmp.toUpperCase());
		
		// 5
		String s4 = "2056521";
		if (s4.charAt(0) == '1') {
			System.out.println("남자");
		} else if (s4.charAt(0) == '2') {
			System.out.println("여자");
		}
		
		
		// 6
		String s5 = "[10, 20, 30, 40, 50]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		String[] s5Split = s5.split(",");

		int sum = 0;
		for (int i = 0; i < s5Split.length; i++) {
			sum += Integer.parseInt(s5Split[i].trim());
		}
		System.out.println("합 : " + sum);
		
		
		// 7
		int[] s5Sort = new int[5];
		for (int i = 0; i < s5Split.length; i++) {
			s5Sort[i] = Integer.parseInt(s5Split[i].trim());
		}
		Arrays.sort(s5Sort);
		System.out.println(Arrays.toString(s5Sort));
	}
}
