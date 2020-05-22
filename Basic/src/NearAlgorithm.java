// ���� ������ �߿��� ��� �����Ϳ� ���� ����� ��
// �ٻ� �˰���(Near Algorithm) : ���հ��� ���밪�� �ּҰ�

public class NearAlgorithm {
	// [0] ���밪 ���ϱ� ���� �Լ�
	public static int Abs(int number) {
		return (number < 0) ? -number : number;
	}
	public static void main(String[] args) {
		// [1] Initialize
		int min = Integer.MAX_VALUE; // ���հ��� ���밪�� �ּҰ��� ��� �׸�
		
		// [2] Input
		int[] numbers = {10, 20, 30, 26, 18};
		int target = 25;
		int near = 0;
		
		// [3] Process
		for(int i = 0; i < numbers.length; i++) {
			int abs = Abs(numbers[i] - target);
			if(abs < min) {
				min = abs; // MIN : �ּڰ� �˰���
				near = numbers[i]; // NEAR : ���̰��� ���밪�� �ּڰ��� ���� ��
			}
		}
		
		// [4] Output
		System.out.println(target + "��/�� ���� ����� �� : " +  near + "(���� : " + min + ")");
		//25��/�� ���� ����� �� : 26(���� : 1)
		
	}// main
};
