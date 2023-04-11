package 배열;

import java.util.Arrays;
import java.util.Random;

public class 배열최대값구하기3 {

	public static void main(String[] args) {
		Random r = new Random(100);
		int[] s = new int[10];
		int[] s2 = new int[10];
		
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(1000); //0~999
		}
		
		// 오름차순으로 정렬한 다음 맨앞(최소값)
		//					  맨끝(최대값)
		Arrays.sort(s); // 원본을 바꿔버림(파괴형 함수)
		
		System.out.println("최소값은 " + s[0]);
		System.out.println("최대값은 " + s[9]);
		
		if (Arrays.equals(s, s2)) {
			System.out.println("2개의 배열이 같다");
		} else {
			System.out.println("2개의 배열이 다르다");
		}
		
		String result = Arrays.toString(s);
		System.out.println(result);
		
		System.out.println("스트링 글자 수 : " + result.length());
		System.out.println("배열의 개수는 : " + s.length);
	}//main 
}