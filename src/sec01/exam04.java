package sec01;

public class exam04 {
	//public 리턴타입 메소등명 (매개변수) {구현}
	// 지금 선언해 볼 메소드는 입력값, 출력값이 없는 메소드
	public void method1 () {
		System.out.println("m1이 실행됨..");
	}
	
	//2.입력값 존재, 출력값 X (결과값 돌려주지 않음!), void이면 리턴값 없음!
	//int x가 입력값
	//매개변수가 입렦값!
	public void method(int x) {
		System.out.println(x+"를 이용한 m2실행");
	}
	
	//3. 입력값 없이 리턴값만 존재!
	public int method3() {
		System.out.println("m3실행");
		//출력값이 반드시 실행!
		//리턴값 형태가 int 이므로 int 형태를 리턴시킴!
		return 10;}
		
		//4. 정수값 2개 받아들이기, 리턴값 x
		public void method4(int x, int y) {
			System.out.println(x+y+"method실행");}
			
			/*
			 5. 값을 하나 받아서, 리턴시킴!
			 */
		public int method5(int y) {
			System.out.println(y+"이용한 m5 실행");
			return y+2;
			//리턴값이 표시가 안되서 오류!
		}
		
}