package myclass.java;

import java.util.Scanner; // scanner ����Ҷ� �� import �������
public class num1 { //p.110 1�� ������ �̷��� Ŭ������ ����
	public static void main(String[] args) {
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>"); // ù ��¹�
		Scanner scanner = new Scanner(System.in); // scanner�� �Է¹ޱ�
		
		int won = scanner.nextInt(); // won�� �������̱� ������ nextInt�� ������ �־������
		final float dal = won/1100; // ������� �Ǽ����� dal(�޷�)�� 1100������ ������ ���Ѵ�
		System.out.println(won+"���� ��"+dal+"�Դϴ�."); // ��� ��°�(�޷� ǥ�� ��+���ڿ� ����. �̻� tmi.)
		scanner.close(); // ��ĳ�� ��� �� �ݾ������. ������ �̰� ���� �Ŀ��� system.in ��ü�� ������ ������ ������ �����
	}
}
