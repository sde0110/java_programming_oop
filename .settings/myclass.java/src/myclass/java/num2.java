// 십의자리 일의자리 수 같은지 판별하는 프로그램

package myclass.java;

import java.util.Scanner; // 스캐너 클래스 사용

public class num2 {
	public static void main(String[] args) {
		System.out.print("2자리수 정수 입력(10~99)>>"); //첫 출력문
		Scanner scanner = new Scanner(System.in); //입력 지시
		final int su = scanner.nextInt();		// int형으로 입력받기
		final int sip = su/10; //입력 받은 수 나눈 몫은 십의 자리(int라서 소수점 이하가 알아서 끊김)
		final int il = su%10; //입력 받은 수 나눈 나머지는 일의 자리
		
		if (sip==il) { //조건에 따라 판별
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		/*조건문을 조건연산자로도 쓸 수 있다.
		System.out.print((sip==il)? ("Yes! 10의 자리와 1의 자리가 같습니다."):("No! 10의 자리와 1의 자리가 다릅니다."));
		더 간단하긴한데 가독성은 떨어지는 듯?*/

	}

}
