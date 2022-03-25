package myclass.java;

import java.util.Scanner; // scanner 사용할때 꼭 import 해줘야함
public class num1 { //p.110 1번 문제라 이렇게 클래스명 붙임
	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위 원)>>"); // 첫 출력문
		Scanner scanner = new Scanner(System.in); // scanner로 입력받기
		
		int won = scanner.nextInt(); // won은 정수형이기 때문에 nextInt로 변수에 넣어줘야함
		final float dal = won/1100; // 상수이자 실수형인 dal(달러)는 1100원으로 나눠서 구한다
		System.out.println(won+"원은 ＄"+dal+"입니다."); // 결과 출력값(달러 표시 ㄹ+한자에 있음. 이상 tmi.)
		scanner.close(); // 스캐너 사용 후 닫아줘야함. 하지만 이걸 닫은 후에는 system.in 자체를 못쓰기 때문에 끝날때 써야함
	}
}
