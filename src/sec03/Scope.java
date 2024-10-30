package sec03;

public class Scope {
	static void a() {
		int i = 0; //지역변수 (local variables)
	}
	public static void main(String []args) {
		for(int i=0;i<5;i++) {
			a();
			System.out.println(i);
		}
	}

}
/*
 a() 안에 있는 int i = 0 이 반복문에 영향을 안 주는 것은 a 안에 i가 있기 떄문에, i=0이라는 무한루프를 안 돌고, i=0 부터 4끼지 1씩 증가해서 출력한다!
 a라는 메소드 안에 변수를 선언하면, 그 변수는 해당 메소드 안에서만 유효하다!, 그런데 오래된 프로그래밍 언어는 메소드 안에서 변수를 선언하면, 그것이 해당 프로그래밍 전체에 영행을 미치는 경우도
 생겼고, 그러한 문제를 해결하기 위해 유효범위가 나타났다!
*/
