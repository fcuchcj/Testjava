package sec03;

public class Operator2 {
public static void main(String[] args) {
	Operator2 operator = new Operator2();
	operator.increment();
	}
//new라는 생성자를 통해서 메소드를 호출하려면 메소드가 해당 클래스 안에 있어야 한다!
public void increment() {
	int intValue = 1;
	System.out.println(intValue++);
	System.out.println(intValue);
	System.out.println(++intValue);
	System.out.println(++intValue);
	}
}
