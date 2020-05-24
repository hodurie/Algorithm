// ���ɵǾ� �ִ� �����͸� ���� �˻�(�̺� Ž��)�� ����Ͽ� �� �� ���� �˻�
// �˻� �˰���(Search Algorithm) : �־��� �����Ϳ��� Ư�� ������ ã��
// �迭 ���� �����Ϳ��� Ư�� ���� �˻��ϴ� �˰���
// ���� : ���� �˻�, ���� �˻�

public class SearchAlgorithm {
	public static void main(String[] args) {
		// [1] Input
		int[] data = {7, 1, 6, 4, 3, 2, 5, 9, 8};
		int N = data.length;
		int search = 3; // �˻��� ������
		boolean flag = false; // ã������ true �ƴϸ� false
		int index = -1; // ã�� ��ġ(�ε���)
		
		
		// [2] Process
		// �������� ����
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(data[i] > data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		} 
		
		// ���� �˻�(Binary Search) : ���������� (Full Scan ��� Index Scan ���)
		int low = 0; // min �ε���
		int high = N - 1; // max �ε���
		while(low <= high) {
			int mid = (low + high) / 2; // �O�� �ε���
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
			System.out.println(search + "��(��) " + index + "��ġ���� ã�ҽ��ϴ�.");
			// 3��(��) 2��ġ���� ã�ҽ��ϴ�.

		}
	}// main
};
