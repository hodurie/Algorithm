// �� ���� ���� �迭 ��ġ��
// ���� �˰���(Merge Algorithm) : ������������ ���ĵǾ� �ִ� ���� �迭�� �ϳ��� ����

public class MergeAlgorithm {
	public static void main(String[] args) {
		// [1] Input
		int[] first = {3, 9, 5, 1, 7};
		int[] second = {8, 6, 2, 4};
		int M = first.length;
		int N = second.length;
		int[] merge = new int[M + N]; // ���յ� �迭
		int i; int j; int k;
		
		// [2] Process
		// �������� ����
		// first ����
		for(i = 0; i < M; i++) {
			for(j = i + 1; j < M; j++) {
				if(first[i] > first[j]) {
					int temp = first[i];
					first[i] = first[j];
					first[j] = temp;
				}
			}
		}
		
		// second ����
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
		while(i < M && j < N){ // �� �� �ϳ��� �迭�� ���� ������ ������
			if(first[i] < second[j]) { // ���� ���� merge �迭�� ����
				merge[k++] = first[i++];
			}else {
				merge[k++] = second[j++];
			}
			
		}
		while(i < M) { // ù ��° �迭�� ������ ������ ������
			merge[k++] = first[i++];
		}
		while(j < N) {// �� ���� �迭�� ������ ������ ������
			merge[k++] = second[j++];
		}
		
		// [3] Output
		for(int item : merge) {
			System.out.print(item + " ");
		}
	}// main
};
