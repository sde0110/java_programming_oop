// �����ڸ� �����ڸ� �� ������ �Ǻ��ϴ� ���α׷�

package myclass.java;

import java.util.Scanner; // ��ĳ�� Ŭ���� ���

public class num2 {
	public static void main(String[] args) {
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>"); //ù ��¹�
		Scanner scanner = new Scanner(System.in); //�Է� ����
		final int su = scanner.nextInt();		// int������ �Է¹ޱ�
		final int sip = su/10; //�Է� ���� �� ���� ���� ���� �ڸ�(int�� �Ҽ��� ���ϰ� �˾Ƽ� ����)
		final int il = su%10; //�Է� ���� �� ���� �������� ���� �ڸ�
		
		if (sip==il) { //���ǿ� ���� �Ǻ�
			System.out.print("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.print("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		
		/*���ǹ��� ���ǿ����ڷε� �� �� �ִ�.
		System.out.print((sip==il)? ("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�."):("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�."));
		�� �����ϱ��ѵ� �������� �������� ��?*/

	}

}
