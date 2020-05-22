// �־��� ������ �߿��� ���� ���� ¦���� ��
// �ּڰ� �˰���(Min Algorithm) : �־��� ������ �־��� ������ �ڷ�� �� ���� ���� ��

public class MinAlgorithm {
	public static void main(String[] args) {
		// [1] Initializes
		int min = Integer.MAX_VALUE; // ���� ������ ������ �� ���� ū ������ �ʱ�ȭ
		
		// [2] Input
		int[] numbers = {2, 5, 3, 6, 1};
		// �������� ǥ��
		// {0b0010, 0B0101, 0b0011, 0B0111, 0b0000_0001};
		
		// [3] Process : MIN
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < min && numbers[i] % 2 == 0) {
				min = numbers[i]; // MIN : �� ���� ������ �Ҵ�
			}
		}
		// [4] Output
		System.out.println("¦�� �ּڰ� : " + min);
		// ¦�� �ּڰ� : 2
	}// main
};
