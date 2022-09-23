package 자바0913;

public class 메소드공부6 {
	
	// 메소드 == 기능
	// public static : 접근 제어자
	// int : 리턴 타입
	// getSum : 메소드 이름
	//	void는 리턴이 없는 메소드를 의미함. 대입이 불가능하다.
	// int x, int y : 파라미터 타입(매개변수, 인자값, 인수값....)
	public static int getSum(int x, int y) {
		return x + y;
		// return? 
	}
	
	public static void print(String word) {
		System.out.println(word);
	}
	
	public static void main(String[] args) {
		int result = getSum(30,70);
		// result의 예상되는 값은? 100
		print("도시락");
				   // error. 리턴 타입이 void인 메소드는  return이 없기 때문에 변수에 결과를 대입할 수 없다.
				   // (void는 가끔 사용하나 자주 사용하지 않음.)
	}	

}
