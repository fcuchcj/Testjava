package sec03;

public class scope2 {
	static int i; /*전역변수 (global variables), 전역변수에서 다
	선언을 했기 때문에, 딱히 지역변수에 다시 int를 입력해서 선언할 필요 X
	모든 중괄호에 접근 가능한 전역변수! 
	*/
	
	static void a() {
		i=0;
	}
	
	public static void main(String[] args) {
		for (i=0;i<5;i++) {
			a();
			System.out.println(i);
		//0이 무한히 출력!, 이 상태에서 종료하려면 terminate라고 불리우는 빨간색 아이콘을 클릭!
		}
	}
}
