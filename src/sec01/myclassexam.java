package sec01;
//myclass가 가지고 있는 exam을 사용해보기!
public class myclassexam {
	public static void main (String []args) {
		/*exam04라는 객체가 만들어짐, 아까 만드었던 
		 exam04의 메소드를 활용하기 위해 만듬!
		 */
		exam04 exam04 = new exam04();
		//속성, 메소드에 접근 가능!
		exam04.method1();
		//method는 정수 값을 넣어야만 출력 가능!
		exam04.method(0);
		//return 10이 되는 지 확인이 안되기 떄문에, 무언가가 필요!
		//int value를 앞에 써 주어야 return 정수값을 받아줌! (확인!)
		//리턴값이 있는 경우만 System.out.println을 입력해서 출력!
		int value = exam04.method3();
		System.out.println("method3이 리턴한 값"+value);
		
		exam04.method4(5, 7);
		/*
		 int값에 똑같은 변수를 쓰면 오류가 나옴! (value를 쓰면 안됨!)
		 */
		int value2 = exam04.method5(55);
		System.out.println("m5가 리턴한 값 :"+ value2);
	
	}
}
