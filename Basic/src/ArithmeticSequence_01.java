// 1���� 20������ ���� �� Ȧ���� ���� ���ϴ� ���α׷�
// �������� (ArithmeticSequence) : �����ϴ� �� ���� ���̰� ������ ����

public class ArithmeticSequence_01 {
	public static void main(String[] args) {
		// [1] Input
		int sum = 0;
		
		// [2] Process
		for(int i = 1; i < 21; i ++) { // �־��� ����(1~20)
			if(!(i % 2 == 0)) { // �־��� ����(���͸�) : Ȧ��
				sum += i;
				System.out.print("Ȧ�� : " + i + " ");
				// Ȧ�� : 1 Ȧ�� : 3 Ȧ�� : 5 Ȧ�� : 7 Ȧ�� : 9 Ȧ�� : 11 Ȧ�� : 13 Ȧ�� : 15 Ȧ�� : 17 Ȧ�� : 19 
			}
		}
		
		// [3] Output
		System.out.println("\n1���� 20������ Ȧ���� �� : " + sum);
		// 1���� 20������ Ȧ���� �� : 100
	}// main
};
