package 자바0913;

public class 메소드공부7 {

	public static int getNum(int x, String y) {
		return 0;
	}
	// public static: 접근 지정자(제어자)
	// int : 리턴 타입
	// getNum : 메소드 이름
	// int x, String y : 파라미터 타입
	//	파라미터 안에는 모든 데이터 타입이 올 수 있다!
	
	//문제1. 아래 메소드 main 메소드에 호출해서 결과 확인하기.
	public static int getNum(int x, String y, String z) {
		return 10;
	}
	
	//문제2. 메소드 만들기
	// 접근지정자 public static
	// 리턴 타입 boolean
	// 메소드 이름 isTrue
	// 파라미터 boolean, String
	public static boolean isTrue(boolean x, String y) {
		return false;
	}
	
	//문제3.
	public static String getStr() {
		return "피자빵";
	}
	
	//문제4. main 메소드 호출하고 결과 확인하기.
	public static int 피자빵주세요(int 빵) {
		return 빵;
	}
	
	//문제5. 
	public static int 돈을인출하다(int 돈) {
		return 3000;
	}
	//문제6. 메인 메소드에 호출하고 결과 확인하기
	//	tip. 메소드 이름은 같으나 파라미터 타입, 개수가 다르면 메소드 이름 중복 사용 가능하다.(이것을 오버로딩이라고 한다.)
	public static int 돈을인출하다(int 돈, String 계좌) {
		if(계좌.equals("카카오뱅크")) {
			return 돈;
		}
		if(계좌.equals("농협")) {
			return 돈;
		}
		return 0;
	}
	//문제7.
	public static int 돈을해외로송금하다(int 금액, String 해외) {
		if(해외.equals("수리남")) {
			return 500;
		}
		return 금액;
	}
	//문제8.
	public static int 섯다패를돌리다(String 결과) {
		if(결과.equals("장땡")) {
			return 500;
		}
		if(결과.equals("38")) {
			return 1000;
		}
		return 0;
	}
	//문제9.
	public static boolean 말해YesOrNo(String 가수) {
		if("지코".equals(가수)) {
			return true;
		}
		if("지코".equals("지코")) {
			return false;
		}
		return true;
	}
	//문제10.
	public static String 나는가수다() {
		if(1 != 1) {
			return "뉴진스";
		}
		if(1 == 1) {
			return "아이브";
		}
		return "여자아이들";
	}
	//문제11.
	public static void 무한도전(String 멤버이름) {
		if(멤버이름.equals("박명수")) {
			System.out.println("Hello");
		}
		if(5 == 5) {
			System.out.println("Hello");
		}
	}
	//문제12.
	public static int 용돈을드리다(int 용돈금액, String 가족) {
		가족 = "아빠";
		if(가족.equals("엄마")) {
			return 용돈금액;
		}
		가족 = "엄마";
		if(가족.equals("아빠")) {
			return 용돈금액;
		}
		return 1000;
	}
	
	public static void main(String[] args) {
		int x = getNum(10, "붕어빵"); //메소드 호출
		//메소드에 리턴이 있으면 대입이 가능하다.
		System.out.println("결과=>"+x);
		
		int y = getNum(10, "붕어빵", "피자붕어빵");
		System.out.println("결과=>" + y);
		
		boolean isX = isTrue(true, "금요일");
		System.out.println("결과=>"+isX);
		
		String word = getStr();
		System.out.println("결과=>"+word);
		
		int 빵 = 피자빵주세요(100);
		System.out.println("결과=>"+빵);
		
		int 돈 = 돈을인출하다(1);
		System.out.println("결과=>"+돈);
		
		int money = 돈을인출하다(3000, "카카오뱅크");
		System.out.println("결과=>"+money);
		
		int 금액 = 돈을해외로송금하다(300, "이탈리아");
		System.out.println("결과=>"+금액);
		
		int 섯다패 = 섯다패를돌리다("39");
		System.out.println("결과=>"+섯다패);
	
		말해YesOrNo("지코바");
		
		무한도전("박명수");
		
		용돈을드리다 (300, "엄마");
	}

}
