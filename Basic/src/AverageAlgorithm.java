// n���� ���� �߿��� 80�� �̻� 95�� ������ ������ ���
// ��� �˰���(Average Algorithm) : �־��� ������ �־��� ���ǿ� �ش��ϴ� �ڷ���� ���

public class AverageAlgorithm {
	public static void main(String[] args) {
		// [1] Input : n���� ����
		int[] data = {100, 90, 95, 88, 42, 30, 50, 86, 94, 54};
		int sum = 0; // �հ� ��� �׸�
		int count = 0; // ���� ��� �׸�
		
		// [2] Process : AVG = SUM/COUNT
		for(int i = 0; i < data.length; i++) {
			if(data[i] >= 80 && data[i] <= 95) {
				sum += data[i];
				count++;
			}
		}
		double avg = sum / (double)count; // AVG
		
		// [3] Output
		System.out.println("80�� �̻� 95�� ������ �ڷ��� ��� : " + avg);
		//80�� �̻� 95�� ������ �ڷ��� ��� : 90.6
	}// main
};
