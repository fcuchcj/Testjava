package sec03;

public class scope5 {
	static int i =  5;
	
	static void a() {
		//정적인 유효범위
		int i = 10;
		b();
	}
	
	static void b() {
		int i =30;
		System.out.println(i);
		/*여기서의 i는 b 메소드 안에 i 값을 쓰는 데 만약에 
		 만약에 여기가 i가 없다면, 전역변수 i=5 값이 출력된다!
		 */
	}
	                           
	public static void main(String[] args) {
		a();
		//지역변수가 아니라 전역변수 호출!
	}
}
