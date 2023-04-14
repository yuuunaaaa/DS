package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String에서Char배열에옮기기3 {
	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		String sno = "2056521";

		// 1. 마지막 위치의 숫자가 1이면 서대문구에서 출생,
		// 1이 아니면 다른 구에서 출생 프린트

		System.out.println(sno.charAt(sno.length() - 1) == '1' ? "서대문구에서 출생" : "다른 구에서 출생");

		// 2. "52"를 추출하여 두 숫자를 더해보세요.
		// 더해서 10이 넘지않아야 유효한 주민번호
		// 유효한 주민번호인지 아닌지 출력

		char[] two = new char[2];
		sno.getChars(4, 6, two, 0);
		// 원본인 String인 sno에서 4~5를 추출해서
		// char[]인 two에 인덱스 0부터 넣어주세요.
		//System.out.println(Arrays.toString(two));

		int i1 = Character.getNumericValue(two[0]);
		int i2 = Character.getNumericValue(two[1]);
		int sum = i1 + i2;
		System.out.println(sum);
		System.out.println(sum < 10 ? "유효한 주민번호 O" : "유효한 주민번호 X");

		// 3. 주민번호에 포함된 5의 갯수를 출력
		// 1) String 배열 - split()
		String[] stringArray = sno.split("");
		int count = 0;
		for (String s : stringArray) {
			if (s.equals("5")) { // if (s.contains("5")) {
				count++;
			}
		}
		System.out.println(count);

		// 2)charAt(i)
		// String sno = "2056521";
		int count2 = 0;
		for (int i = 0; i < sno.length(); i++) {
			char c = sno.charAt(i);
			if (c == '5') {
				count2++;
			}
		}
		System.out.println(count2);

		// 인덱스를 빨리 찾는 방법(함수)
		System.out.println(Arrays.binarySearch(stringArray, "5"));

		// 배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
		Arrays.fill(stringArray, 0, 3, "hoho");
		print(stringArray);

		// 배열의 순서를 다 뒤집는 방법 (함수)
		Arrays.sort(stringArray); // 정렬(오름차순)
		// Arrays로 내림차순을 할 수는 있으나 너무 복잡
		// => 컬렉션으로 변환해서 하면 더 간단
		//System.out.println(Arrays.toString(stringArray));
		print(stringArray);
		
		List<String> list = Arrays.asList(stringArray);
		Collections.sort(list); // 정렬(오름차순)
		Collections.reverse(list); // 정렬(내림차수)
		System.out.println(list);

		// 배열안에 데이터의 빈도수(횟수)구하는 방법(함수)
		int count3 = Collections.frequency(list, "hoho");
		System.out.println(count3);
	}
}