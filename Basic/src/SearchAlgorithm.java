// 정령되어 있는 데이터를 이진 검색(이분 탐색)을 사용하여 반 씩 나눠 검색
// 검색 알고리즘(Search Algorithm) : 주어진 데이터에서 특정 데이터 찾기
// 배열 등의 데이터에서 특정 값을 검색하는 알고리즘
// 종류 : 순차 검색, 이진 검색

public class SearchAlgorithm {
	public static void main(String[] args) {
		// [1] Input
		int[] data = {7, 1, 6, 4, 3, 2, 5, 9, 8};
		int N = data.length;
		int search = 3; // 검색할 데이터
		boolean flag = false; // 찾았으면 true 아니면 false
		int index = -1; // 찾은 위치(인덱스)
		
		
		// [2] Process
		// 오름차순 정렬
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		} 
		
		// 이진 검색(Binary Search) : 개념적으로 (Full Scan 대신 Index Scan 사용)
		int low = 0; // min 인덱스
		int high = N - 1; // max 인덱스
		while(low <= high) {
			int mid = (low + high) / 2; // 즁간 인덱스
			if(data[mid] == search) {
				flag = true;
				index = mid;
				break;
			}
			if(data[mid] < search) {
				low = mid + 1;
			}else {
				high = mid - 1;
			}
		}
				
		// [3] Output
		if(flag) {
			System.out.println(search + "을(를) " + index + "위치에서 찾았습니다.");
			// 3을(를) 2위치에서 찾았습니다.

		}
	}// main
};
