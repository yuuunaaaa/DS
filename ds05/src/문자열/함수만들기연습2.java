package 문자열;

public class 함수만들기연습2 {

	public static void 세수하기() {
		System.out.println("세수를 하다");
	}
	public static void 밥먹기(String when) {
		System.out.println(when + "에 밥먹다");
	}
	public static void 운동하기(String where) {
		System.out.println(where + "에서 운동하다");
	}
	public static void 잠자기(String when) {
		System.out.println(when + " 잠자다");
	}
	public static void 화장하기() {
		System.out.println("화장하다");
	}
	
	public static void main(String[] args) {
		// 내가 일어나서 하는 일
		// 1. 세수하기
		세수하기();
		// 2. 밥먹기(아침)
		밥먹기("아침");
		// 3. 운동하기(운동장)
		운동하기("운동장");
		// 4. 잠자기(낮잠)
		잠자기("낮잠");
		// 5. 밥먹기(점심)
		밥먹기("점심");
		// 6. 세수하기(외출준비)
		세수하기();
		// 7. 화장하기
		화장하기();
		// 8. 밥먹기(저녁)
		밥먹기("저녁");
		// 9. 운동하기(공원)
		운동하기("공원");
		// 10. 잠자기(저녁)
		잠자기("저녁");
	}

}