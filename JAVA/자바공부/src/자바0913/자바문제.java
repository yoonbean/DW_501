package 자바0913;

public class 자바문제 {

	public static void main(String[] args) {
		
		String name[] = {"Brian","Kim"};
		// 문제1) 배열 name에 있는 Element 중 "Kim"의 위치를 찾은 후
		// "Kim은 x에 있습니다." 출력하기
		// 방법1.
		for(int i=0; i<name.length; i++) {
			boolean isCheck = name[i].equals("Kim");
			if(isCheck){
				System.out.println("Kim은"+i+"번에 있습니다.");
				break;
			}
		}
		
		// 방법2.
		for(int i=0; i<name.length; i++) {
			if(name[i].equals("kim")) {
				System.out.println("Kim은"+i+"번에 있습니다.");
				break;
			}
		}
		

		// 문제2 ) 홍길동 번호는 010-3333-9999 입니다. 길동이는 개인정보 유출을 생각해
		// 핸드폰 번호를 010-****-****으로 보이게 하고 싶습니다. 이처럼 변경하고 출력하시오.
		// 방법1.
		String ph = "010-3333-9999";
		String array[] = ph.split("-");
		for(int i=1; i<array.length; i++) {
			array[i] = "****";
		}
		String result = array[0] + "-" + array[1] + "-" + array[2];
		System.out.println(result);
		
		// 방법2.
		String result2 = "";
		for(int i=0; i<array.length; i++) {
			if(i == 0) {
				result2 += array[i];
			}
			if(i >= 1) {
				result2 += "-****";
			}
			
		}
		System.out.println(result2);
	}

}
