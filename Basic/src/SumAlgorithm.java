// n���� ���� ���� �߿��� 80�� �̻��� ������ �հ�
// �հ� �˰���(Sum Algorithm): �־��� ������ �־��� ���ǿ� �ش��ϴ� �ڷ���� �հ� 

public class SumAlgorithm {
    public static void main(String[] args) {
        // [1] Input: n���� ���� ����
        int[] scores = {100, 75, 80, 45, 90, 95};
        int sum = 0; 
        
        // [2] Process: �հ� �˰��� ����: �־��� ������ �־��� ����(���͸�)
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 80) {
                sum += scores[i]; // SUM
            }
        }

        // [3] Output
        System.out.println(scores.length + "���� ���� �� 80�� �̻��� ���� : " + sum);
        // 6���� ���� �� 80�� �̻��� ���� : 365
    }// main
};