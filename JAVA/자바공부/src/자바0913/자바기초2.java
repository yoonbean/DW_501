package 자바0913;

import java.util.Scanner;

public class 자바기초2 {

	public static void main(String[] args) {
//		int x = 10;
//		if(x == 10) {
//			System.out.println("A");
//		}
//		if(x != 10) {
//			System.out.println("B");
//		}
		// A
		
//		if(x > 5) {
//			System.out.println("실행");
//		}
//		
//		if( 3 == 4) {
//			System.out.println("IF 실행");
//		}else {
//			System.out.println("ELSE 실행");
//		}
		
		
//		int a = 3; // 전역 변수
//		if(x>3) {
//			a = 10;
//			int y = 20; // 지역 변수
//		}
//		
//		int x = 20;
//		if(20 == 20) {
//			++x;
//		}else {
//			x = x+x;
//		}
		//최종 값은? 21
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 =>");
		int num = scan .nextInt();
		System.out.println("값은 "+num);
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
	}

}
