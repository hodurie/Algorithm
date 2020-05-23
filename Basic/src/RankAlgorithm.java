// 주어진(지정한 범위) 데이터의 순위(등수)를 구하는 로직
// 순위 알고리즘(Rank Algorithm) : 점수 데이터에 대한 순위 구하기 -> 먼저 일등으로 만들어 놓고, 다음 값과 비교해 갱신

public class RankAlgorithm {
	public static void main(String[] args) {
		// [1] Input
		int[] scores = {90, 87, 65, 23, 77, 98, 100};
		int[] rankings = {1, 1, 1, 1, 1, 1, 1}; // 변수 초기화
		
		// [2] Process : RANK
		for(int i = 0; i < scores.length; i++) {
			rankings[i] = 1; // 1로 변수 초기화, 순위 배열을 매 회전마다 1등으로 초기화
			for(int j = 0; j < scores.length; j++) {
				if(scores[i] < scores[j]) {// 현재(i)와 나머지(j)들 비교
					rankings[i]++; // RANK : 나보다 큰 점수가 나오면 순위 1 증가
				}
			}
		}
		
		// [3] : Output
		for(int i = 0; i < scores.length; i++) {
			System.out.print(String.format("%3d점 : %1d등  ",  scores[i], rankings[i]));
			// 90점 : 3등   87점 : 4등   65점 : 6등   23점 : 7등   77점 : 5등   98점 : 2등  100점 : 1등  
		}
		
	} // main
};
