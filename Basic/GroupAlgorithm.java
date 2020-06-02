// �÷��� ������ �����͸� Ư�� Ű ������ �׷�ȭ
// �׷� �˰���(Group Algorithm) : Ư�� Ű ���� �ش��ϴ� �׷�ȭ �� �հ� ����Ʈ �����

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GroupAlgorithm {
	
	// �׽�Ʈ�� ���ڵ� Ŭ����
	public static class Record{
		private final String name;
		private final int quantity;
		
		public Record(String name, int quantity) {
			this.name = name;
			this.quantity = quantity;
		}
		
		public String getName() {
			return name;
		}
		
		public int getQuantity() {
			return quantity;
		}
	}
	
	// �׽�Ʈ�� ������ ä���� ���� �Լ�
	public static List<Record> getAll(){
		return Arrays.asList(
				new Record("RADIO", 3),
				new Record("TV", 1),
				new Record("RADIO", 2),
				new Record("DVD", 4)
				);
	}
	
	public static void printData(String message, List<Record> data) {
		System.out.println(message);
		for(Record item : data) {
			System.out.println(String.format("%5s - %d", item.getName(), item.getQuantity()));
		}
	}
	
	public static void main(String[] args) {
		// [1] Input
		List<Record> records = getAll(); // �Է� ������
		List<Record> groups = new ArrayList<Record>(); // ��� ������
		int N = records.size();
		
		// [2] Process : Group �˰���(sort -> sum -> group)
		// 1) �׷� ���� : SORT
		for(int i = 0; i < N-1; i++) {
			for(int j = i+1; j < N; j++) {
				if(records.get(i).getName().compareTo(records.get(j).getName()) > 0){
					Record t = records.get(i);
					records.set(i, records.get(j));
					records.set(j, t);
				}
			}
		}
		
		// 2) �׷� �Ұ� : GROUP
		int subtotal = 0;
		for(int i = 0; i < N; i++) {
			subtotal += records.get(i).getQuantity(); // ���� ��ǰ���� �Ǹŷ��� ����(SUM)
			if((i+1) == N || // �ܶ�(short circuiting)�̸� �Ʒ� ���� ����
				(records.get(i).getName() != records.get(i+1).getName())) {
				// ���� ���ڵ尡 ���ų�, ���� ���ڵ�� ���� ���ڵ尡 �ٸ��� ����
				Record r = new Record(records.get(i).getName(), subtotal);
				groups.add(r);
				
				subtotal = 0;
			}
		}
		
		
		// [3] Output
		printData("[1] ���ĵ� ���� ������:", records);
		printData("[2] �̸����� �׷�ȭ�� ������", groups);
//		[1] ���ĵ� ���� ������:
//		  DVD - 4
//		RADIO - 2
//		RADIO - 3
//		   TV - 1
//		[2] �̸����� �׷�ȭ�� ������
//		  DVD - 4
//		RADIO - 5
//		   TV - 1
	}
}
