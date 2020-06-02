// �־��� �����Ϳ��� ���� ���� ��Ÿ��(�ߺ���) ��
// �ֺ� �˰���(Mode Algorithm) : �ε���(0�� ~ 100��)�� ����(COUNT)�� �ִ�(MAX)

public class ModeAlgorithm {
	public static void main(String[] args) {
		
		// [1] Input
		int[] scores = {1, 3, 4, 3, 5, 2, 3};
		int mode = 0; // �ֺ��� ��� �׸�
		int[] indexes = new int[5+1]; // 0~5���� ���� �ε��� ī����
		int max = Integer.MIN_VALUE; // ���� ���� ������ �ʱ�ȭ
		
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
		System.out.println("�ֺ� : " + mode + " : " + max + "��");
		// �ֺ� : 3 : 3��

	}
}
