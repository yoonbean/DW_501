package 자바0913;

public class 문자열공부 {

	public static void main(String[] args) {
		
		String name = "전요한"; //문자
		String name2 = "황정민";
		// 1. 문자 비교
		// 자바에서 문자를 비교할 때는 == 를 사용하지 않는다.(javascript와의 차이점)
		boolean isCheck = name.equals(name2); // name과 name2를 비교함.
		// 왜 자바에서는 문자를  ==연산자로 비교하지 않고 equals 를 사용하는가?
		//  자바에서 문자열은 클래스이기 때문에 == 연산자로 비교하게되면 
		//  문자를 비교하는 것이 아니라 클래스를 비교하는 것이 되기 때문이다.
		System.out.println("name과 name2를 비교한 결과=>" +isCheck);
		// boolean은 true or false 로만 표현 가능하다.
		
		// 2. 문자 길이 알아내기
		String pw = "12341234";
		int 문자길이 = pw.length();
		System.out.println("문자길이는 =>" + 문자길이);
		
		// 3. 문자 자르기 
		String pn = "010-3786-7607";
		String array[] = pn.split("-"); // "-" 를 기준으로 자르겠다.
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		// 4. 특정 문자 추출
		String movie = "어벤져스 인피니티 워";
		String result = movie.substring(2);  // "어벤" 이후(1번째, 2번째 문자 이후)부터 문자를 보여준다. 1부터 카운팅
		String result2 = movie.substring(0,4);
		System.out.println(result);
		System.out.println(result2);
	}

}
