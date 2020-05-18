// 1부터 20까지의 정수 중 홀수의 합을 구하는 프로그램
// 등차수열 (ArithmeticSequence) : 연속하는 두 수의 차이가 일정한 수열

public class ArithmeticSequence_01 {
	public static void main(String[] args) {
		// [1] Input
		int sum = 0;
		
		// [2] Process
		for(int i = 1; i < 21; i ++) { // 주어진 범위(1~20)
			if(!(i % 2 == 0)) { // 주어진 조건(필터링) : 홀수
				sum += i;
				System.out.print("홀수 : " + i + " ");
				// 홀수 : 1 홀수 : 3 홀수 : 5 홀수 : 7 홀수 : 9 홀수 : 11 홀수 : 13 홀수 : 15 홀수 : 17 홀수 : 19 
			}
		}
		
		// [3] Output
		System.out.println("\n1부터 20까지의 홀수의 합 : " + sum);
		// 1부터 20까지의 홀수의 합 : 100
	}// main
};
