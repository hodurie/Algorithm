// 1부터 20까지의 정수 중 짝수의 합을 구하는 프로그램
// 등차수열 (ArithmeticSequence) : 연속하는 두 수의 차이가 일정한 수열

public class ArithmeticSequence_02 {
	public static void main(String[] args) {
		// [1] Input
		int sum = 0;
		
		// [2] Process
		for(int i = 1; i < 21; i++) {
			if(i % 2 == 0) {
				sum += i;
				System.out.print("짝수 : " + i + " ");
				// 짝수 : 2 짝수 : 4 짝수 : 6 짝수 : 8 짝수 : 10 짝수 : 12 짝수 : 14 짝수 : 16 짝수 : 18 짝수 : 20 
			}
		}
		
		// [3] Output
		System.out.println("\n1부터 20까지의 짝수의 합 : " + sum);
		// 1부터 20까지의 짝수의 합 : 110
	}// main
};
