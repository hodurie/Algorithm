// 주어진 데이터에서 가장 많이 나타난(중복된) 값
// 최빈값 알고리즘(Mode Algorithm) : 인덱스(0점 ~ 100점)의 개수(COUNT)의 최댓값(MAX)

public class ModeAlgorithm {
	public static void main(String[] args) {
		
		// [1] Input
		int[] scores = {1, 3, 4, 3, 5, 2, 3};
		int mode = 0; // 최빈값이 담길 그릇
		int[] indexes = new int[5+1]; // 0~5까지 점수 인덱스 카운터
		int max = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
		
		// [2] Process
		for(int i = 0; i < scores.length; i++) {
			indexes[scores[i]]++; // COUNT
		}
		for(int i = 0; i < indexes.length; i++) {
			if(indexes[i] > max) {
				max = indexes[i]; // MAX
				mode = i; // MODE
			}
		}
		
		// [3] Output
		System.out.println("최빈값 : " + mode + " : " + max + "번");
		// 최빈값 : 3 : 3번

	}
}
