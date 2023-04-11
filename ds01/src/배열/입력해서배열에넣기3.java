package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 자바프로그램과 콘솔(키보드)를 스트림(강물) open
		int[] numbers = new int[3];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			// 입력 받아서, int로 바꾼 후, 배열에 넣어라!
		}
		sc.close(); // stream close
		for (int x : numbers) {
			System.out.println(x);
		}
		int cnt = 0; // 33이 몇 개인지 프린트!
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 33) {
				cnt++;
			}
		}
		System.out.println("3의 개수는 " + cnt);
	}

}
