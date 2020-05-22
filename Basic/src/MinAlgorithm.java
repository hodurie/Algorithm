// 주어진 데이터 중에서 가장 작은 짝수의 값
// 최솟값 알고리즘(Min Algorithm) : 주어진 범위에 주어진 조건의 자료들 중 가장 작은 값

public class MinAlgorithm {
	public static void main(String[] args) {
		// [1] Initializes
		int min = Integer.MAX_VALUE; // 정수 형식의 데이터 중 가장 큰 값으로 초기화
		
		// [2] Input
		int[] numbers = {2, 5, 3, 6, 1};
		// 이진수로 표현
		// {0b0010, 0B0101, 0b0011, 0B0111, 0b0000_0001};
		
		// [3] Process : MIN
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < min && numbers[i] % 2 == 0) {
				min = numbers[i]; // MIN : 더 작은 값으로 할당
			}
		}
		// [4] Output
		System.out.println("짝수 최솟값 : " + min);
		// 짝수 최솟값 : 2
	}// main
};
