package sec02;
/*
 앞에서 만들어진 car클래스를 이용!, car class를 연결시킴! (객체생
 성자)를 만들어서!
 Carmanager가 실행되면 Carmanager안에 있는 Car 클래스 안에 메소드도 같이 
 실행됨!
   해당 int speed 값을 지정 안 했기 때문에 초기값이 0으로 수렴!
 */
public class CarManager {
	public static void main(String[] args) {
		Car dogCar = new Car();
		dogCar.speedUp();
		dogCar.speedUp();
		//현재 강아지 Speed값을 출력!
		System.out.println(dogCar.getCurrentSpeed());
		dogCar.breakdown();
		System.out.println(dogCar.getCurrentSpeed());
	}
}
