package 컬렉션;

import java.util.Arrays;
import java.util.List;

public class 배열과컬렉션변환2 {

	public static void main(String[] args) {
		String[] food = {"감자", "고구마", "우유", "감자", "양파"};
		
		List<String> list = Arrays.asList(food);
		// 1. 감자가 들어 있는 마지막 위치
		System.out.println(list.lastIndexOf("감자"));
		
		// 2. 양파를 포함하고 있으면 "양파는 안사도 된다", 포함 X -> "양파 사서 냉장고에 넣어야 한다"
		System.out.println(list.contains("양파") ? "양파는 안사도 된다" : "양파 사서 냉장고에 넣어야 한다");
		
		// 3. 우유를 "춘식이 우유"로 수정
		list.set(2, "춘식이 우유");
		System.out.println(list);
		
		// 4. 양파를 찾아서 위치를 찾은 후, 해당 위치에 "양파즙"이라고 수정
		list.set(list.indexOf("양파"), "양파즙");
		System.out.println(list);
		
		// 5. 다시 배열로 변환하여 전체 내용을 출력
		String[] food2 = (String[])list.toArray();
		stringPrint(food2);
	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}
