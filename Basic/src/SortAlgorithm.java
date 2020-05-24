// 무작위 데이터를 순서대로(내림/오름차순) 정령
// 정렬 알고리즘(Sort Algorithm) : 가장(작은/큰) 데이터를 왼쪽으로 순서대로 이동 
// 주어진 범위내에서 불규칙적으로 나열된 순서를 일정 기준에 따라 순서대로 나열하는 알고리즘
// 종류 : 선택 정렬, 버블 정렬, 퀵 정렬

public class SortAlgorithm {
	public static void main(String[] args) {
		// [1] Input : Data Structure(Array, List, Stack, Queue, Tree, DB, ...)
		int[] data = {3, 1, 2, 4, 7, 5, 9};
		int N = data.length; // 의사코드 형태로 알고리즘을 표현하기 위해
		
		// [2] Process : Selection Sort(선택 정렬) 알고리즘
		for(int i = 0; i < N - 1; i++) { // i = 0 to N - 1
			for(int j = i + 1; j < N; j++) {
				if(data[i] > data[j]) { // 부등호를 반대로 하면 내림차순
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp; // SWAP							
				}	
			}
		}
		
		// [3] Output : Console, Desktop, Web, Mobile, ...
		for(int i = 0; i < N; i++) {
			System.out.print(data[i] + "\t");
		}
		System.out.println();
		// 1	2	3	4	5	7	9 (오름차순 if 문에서 data[i] > data[j])
		// 9	7	5	4	3	2	1 (내림차순 if 문에서 data[i] < data[j])
		
	}// main
};
