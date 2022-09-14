package 자바0913;

import java.util.Scanner;

public class For문 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력해주세요 =>");
		int num = scan.nextInt();
		System.out.println("값은 "+num);
		//문제1. num에 값을 입력 받았을 때 n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 n을 구하시오.
		// ex) num이 10이라고 가정하면 가장 작은 자연수는 3입니다.
		// 제한 사항 : num은 3 <= num <= 1000 입니다.
		// hint : while or for문을 이용해서 풀어보세요.
		if(num>=3 && num<=1000) {
			for(int i=1; i<num; i++) {
				if(num%i == 1) {
					System.out.println(i);
					break;
				}
			}
		}
		
		//문제2. 3부터 6까지 숫자 총합을 구하시오.
		int sum = 0;
		for(int j=3; j<=6; j++) {
			sum = sum + j;
		}
		System.out.println(sum);
	}
}
