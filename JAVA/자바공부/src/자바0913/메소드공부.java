package 자바0913;

public class 메소드공부 {

	// js에서 function과 같은 개념
	// () => 파라미터 or 매개변수
		public static int 더하기(int x, int y) {
			return x+y ;
		}
		
		public static int 빼기(int x, int y) {
			return x-y;
		}
		
		public static int 나누기(int x, int y) {
			return x/y;
		}
		
	public static void main(String[] args) {
		int 결과 = 더하기(20, 10);
		int 결과2 = 빼기(30,5);
		int 결과3 = 나누기(30,2);
		int 결과4 = 곱하기(10,2);
		System.out.println(결과);
		System.out.println(결과2);
		System.out.println(결과3);
		System.out.println(결과4);
	}
	
		public static int 곱하기(int x, int y) {
			return x*y;
		}

}
