// 1���� 20������ ���� �� ¦���� ���� ���ϴ� ���α׷�
// �������� (ArithmeticSequence) : �����ϴ� �� ���� ���̰� ������ ����

public class ArithmeticSequence_02 {
	public static void main(String[] args) {
		// [1] Input
		int sum = 0;
		
		// [2] Process
		for(int i = 1; i < 21; i++) {
			if(i % 2 == 0) {
				sum += i;
				System.out.print("¦�� : " + i + " ");
				// ¦�� : 2 ¦�� : 4 ¦�� : 6 ¦�� : 8 ¦�� : 10 ¦�� : 12 ¦�� : 14 ¦�� : 16 ¦�� : 18 ¦�� : 20 
			}
		}
		
		// [3] Output
		System.out.println("\n1���� 20������ ¦���� �� : " + sum);
		// 1���� 20������ ¦���� �� : 110
	}// main
};
