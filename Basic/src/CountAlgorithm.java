// 1���� n������ ���� �� 13�� ����� ���� ���ϱ�
// ���� �˰���(Count Algorithm) : �־��� ������ �־��� ���ǿ� �ش��ϴ� �ڷ���� ���� 
public class CountAlgorithm {
	public static void main(String[] args) {
		// [1] Input : 1����  n������ ������
		int[] numbers = {11, 12, 13, 13, 14, 15, 12, 13};
		int count = 0;
		
		// [2] Process : ���� �˰��� ���� = �־��� ������ ���� ����(���͸�)
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 13 == 0) {
				// count = count + 1;
				// count += 1; 
				count++; // COUNT
			}
		}
		
		// [3] Output
		System.out.println(numbers.length + "���� ���� �� 13�� ����� ���� : " + count);
		// 8���� ���� �� 13�� ����� ���� : 3
	}// main
};
