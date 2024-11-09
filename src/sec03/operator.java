package sec03;
//a=3 (대입연산자)
public class Operator {
	
	public static void main(String[] args) {
	Operator operator = new Operator();
	operator.unary();
	/*
	 Operator라는 클래스에 unary라는 변수를 만들어서(unary
	 는 그때 부터 Operator 클래스의 인스턴스를 참조한다.
	 , 그 변수를 통해 
	 Operator안에 있는 unary라는 메서드를 호출할 수 있다!
	 (new문 안에 있는 변수와 메서드 이름은 같지 않아야 한다! (그래야 
	 호출가능!))
	 */
}
	public void unary() {
		/*
		 단항연산자에서 +는 *1을 의미하고, -는 *(-1)
		 을 의미한다!
		 */
		int intValue=-10;
		int result = +intValue;
		//+는 숫자가 양수라는 것을 의미하는 것일 뿐 의미(X)
		System.out.println(result);
		result = -intValue;
		System.out.println(result);
	}
}

