// �־���(������ ����) �������� ����(���)�� ���ϴ� ����
// ���� �˰���(Rank Algorithm) : ���� �����Ϳ� ���� ���� ���ϱ� -> ���� �ϵ����� ����� ����, ���� ���� ���� ����

public class RankAlgorithm {
	public static void main(String[] args) {
		// [1] Input
		int[] scores = {90, 87, 65, 23, 77, 98, 100};
		int[] rankings = {1, 1, 1, 1, 1, 1, 1}; // ���� �ʱ�ȭ
		
		// [2] Process : RANK
		for(int i = 0; i < scores.length; i++) {
			rankings[i] = 1; // 1�� ���� �ʱ�ȭ, ���� �迭�� �� ȸ������ 1������ �ʱ�ȭ
			for(int j = 0; j < scores.length; j++) {
				if(scores[i] < scores[j]) {// ����(i)�� ������(j)�� ��
					rankings[i]++; // RANK : ������ ū ������ ������ ���� 1 ����
				}
			}
		}
		
		// [3] : Output
		for(int i = 0; i < scores.length; i++) {
			System.out.print(String.format("%3d�� : %1d��  ",  scores[i], rankings[i]));
			// 90�� : 3��   87�� : 4��   65�� : 6��   23�� : 7��   77�� : 5��   98�� : 2��  100�� : 1��  
		}
		
	} // main
};
