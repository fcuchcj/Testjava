package sec02;


//모든 클래스와 객체는 상태,행위로 나타내어진다!
public class Car {
	/*변수를 지정함으로써,class의 상태를 지정할 수 있다
	 생성자는 객체를 생성하기 위한 거의 유일한 도구!
	 매개변수가 없는 생성자는 javac을 실행하면 클래스 파일 안에 자동으로 만들어짐!
	 */
		int speed;
		int distance;
		String color;
//Car 생성자
	public Car() {
		
	}
	public void speedUp() {
		speed=speed+5;
	}
	
	public void breakdown() {
		//속도를 줄이는 메소드
		speed=speed-10;
	}
	public int getCurrentSpeed() {
		//속도를 줄이는 메소드
		return speed;
	} 
}
