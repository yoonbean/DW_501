package 자바0913;

public class While문 {

	public static void main(String[] args) {
		// while문은 for문과 같은 반복문 중의 하나
		// for문에 비하면 사용빈도는 낮으나 가끔씩 사용하는 문법.
		// while문은 for문과 달리 조건없이 계속 실행됨.
		int count = 0;
		while(true) {
			++count;
			System.out.println("안녕?");
			if(count == 20) {
				break;
			}
		}
	
		//문제1. while문을 이용해서 1~10까지의 합을 구하시오.
		int sum = 0;
		int i = 0;
		while(true) {
			++i;
			sum = sum + i;
			System.out.println(sum);
			if(sum == 55) {
				break;
			}
		}
		
	}

}
