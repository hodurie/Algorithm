// 두 개의 정수 배열 합치기
// 병합 알고리즘(Merge Algorithm) : 오름차순으로 정렬되어 있는 정수 배열을 하나로 병합

public class MergeAlgorithm {
	public static void main(String[] args) {
		// [1] Input
		int[] first = {3, 9, 5, 1, 7};
		int[] second = {8, 6, 2, 4};
		int M = first.length;
		int N = second.length;
		int[] merge = new int[M + N]; // 병합된 배열
		int i; int j; int k;
		
		// [2] Process
		// 오름차순 정렬
		// first 정렬
		for(i = 0; i < M; i++) {
			for(j = i + 1; j < M; j++) {
				if(first[i] > first[j]) {
					int temp = first[i];
					first[i] = first[j];
					first[j] = temp;
				}
			}
		}
		
		// second 정렬
		for(i = 0; i < N; i++) {
			for(j = i + 1; j < N; j++) {
				if(second[i] > second[j]) {
					int temp = second[i];
					second[i] = second[j];
					second[j] = temp;
				}
			}
		}
		
		for(i = 0; i < M; i++) {
			System.out.print(first[i] + " ");
		}
		System.out.println();
		
		for(j = 0; j < N; j++) {
			System.out.print(second[j] + " ");
		}
		System.out.println();
		
		i = 0; j = 0; k = 0;
		while(i < M && j < N){ // 둘 중 하나라도 배열의 끝에 도달할 때까지
			if(first[i] < second[j]) { // 작은 값을 merge 배열에 저장
				merge[k++] = first[i++];
			}else {
				merge[k++] = second[j++];
			}
			
		}
		while(i < M) { // 첫 번째 배열이 끝까지 도달할 때까지
			merge[k++] = first[i++];
		}
		while(j < N) {// 두 번쨰 배열이 끝까지 도달할 때까지
			merge[k++] = second[j++];
		}
		
		// [3] Output
		for(int item : merge) {
			System.out.print(item + " ");
		}
	}// main
};
