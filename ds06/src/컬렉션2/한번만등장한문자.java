package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class 한번만등장한문자 {
	public static void main(String[] args) {
		String s = "azzovb";
		HashSet<String> set = new HashSet<String>();
		String[] s2 = s.split("");
		Arrays.sort(s2);
		for (String x : s2) {
			set.add(x);
		}
		System.out.println(set.size());
		System.out.println(set);

		String answer = "";
		// 배열 안에 set에 들어 있는 요소가 1인 것만 찾으면 된다
		Object[] set2 = set.toArray();
		List<String> list = Arrays.asList(s2);
		for (Object x : set2) {
			if (Collections.frequency(list, x) == 1) {
				answer += x;
			}
		}
		System.out.println(answer);
	}
}
