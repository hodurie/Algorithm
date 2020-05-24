// ������ �����͸� �������(����/��������) ����
// ���� �˰���(Sort Algorithm) : ����(����/ū) �����͸� �������� ������� �̵� 
// �־��� ���������� �ұ�Ģ������ ������ ������ ���� ���ؿ� ���� ������� �����ϴ� �˰���
// ���� : ���� ����, ���� ����, �� ����

public class SortAlgorithm {
	public static void main(String[] args) {
		// [1] Input : Data Structure(Array, List, Stack, Queue, Tree, DB, ...)
		int[] data = {3, 1, 2, 4, 7, 5, 9};
		int N = data.length; // �ǻ��ڵ� ���·� �˰����� ǥ���ϱ� ����
		
		// [2] Process : Selection Sort(���� ����) �˰���
		for(int i = 0; i < N - 1; i++) { // i = 0 to N - 1
			for(int j = i + 1; j < N; j++) {
				if(data[i] > data[j]) { // �ε�ȣ�� �ݴ�� �ϸ� ��������
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
		// 1	2	3	4	5	7	9 (�������� if ������ data[i] > data[j])
		// 9	7	5	4	3	2	1 (�������� if ������ data[i] < data[j])
		
	}// main
};
