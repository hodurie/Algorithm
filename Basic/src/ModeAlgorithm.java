// �־��� �����Ϳ��� ���� ���� ��Ÿ��(�ߺ���) ��
// �ֺ� �˰���(Mode Algorithm): ���� �ε���(0~100)�� ����(COUNT)�� �ִ�(MAX)

public class ModeAlgorithm {

	public static void main(String[] args) {

		// [1] Input
		int[] scores = { 1, 3, 4, 3, 5}; // 0~5������ ���´ٰ� ����
		int[] idx = new int[5 + 1]; // 0~5����: ���� �ε����� ī����
		int max = Integer.MIN_VALUE; // MAX
		int mode = 0; // �ֺ��� ��� �׸�

		// [2] Process
		for (int i = 0; i < scores.length; i++) {
			idx[scores[i]]++; // COUNT
		}
		for (int i = 0; i < idx.length; i++) {
			if (idx[i] > max) {
				max = idx[i]; // MAX
				mode = i; // MODE
			}
		}

		// [3] Output
		System.out.println("�ֺ� : " + mode + ", " + max + "�� �ݺ�");
		// �ֺ� : 3, 2�� �ݺ�
		
	}// main
};