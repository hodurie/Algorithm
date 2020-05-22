// 원본 데이터 중에서 대상 데이터와 가장 가까운 값
// 근삿값 알고리즘(Near Algorithm) : 차잇값의 절대값의 최소값

public class NearAlgorithm {
	// [0] 절대값 구하기 로컬 함수
	public static int Abs(int number) {
		return (number < 0) ? -number : number;
	}
	public static void main(String[] args) {
		// [1] Initialize
		int min = Integer.MAX_VALUE; // 차잇값의 절대값의 최소값이 담길 그릇
		
		// [2] Input
		int[] numbers = {10, 20, 30, 26, 18};
		int target = 25;
		int near = 0;
		
		// [3] Process
		for(int i = 0; i < numbers.length; i++) {
			int abs = Abs(numbers[i] - target);
			if(abs < min) {
				min = abs; // MIN : 최솟값 알고리즘
				near = numbers[i]; // NEAR : 차이값의 절대값의 최솟값일 떄의 값
			}
		}
		
		// [4] Output
		System.out.println(target + "와/과 가장 가까운 값 : " +  near + "(차이 : " + min + ")");
		//25와/과 가장 가까운 값 : 26(차이 : 1)
		
	}// main
};
