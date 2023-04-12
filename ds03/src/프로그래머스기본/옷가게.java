package 프로그래머스기본;

public class 옷가게 {

	public static void main(String[] args) {
		int price = 500000;
		Solution4 sol = new Solution4();
		int answer = sol.solution(price);
		System.out.println(answer);
	}
}

class Solution4 {
	public int solution(int price) {
		if(price>=500000) return (int)(price*0.8);
        if(price>=300000) return (int)(price*0.9);
        if(price>=100000) return (int)(price*0.95);

        return price;
	}
}
