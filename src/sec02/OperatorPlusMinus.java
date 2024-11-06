package sec02;

public class OperatorPlusMinus {
	public static void main(String[] args) {
		OperatorPlusMinus sample = new OperatorPlusMinus();
		/*생성자로 해당 메소드를 불러오니까
		 * 해당 메소드 안에 있는 출력문도 같이 출력되어 console에 나온다!
		 */
		sample.addictive();
		sample.multiple();
	}
	//main 메소드 바로 뒤에 생성자를 이용해 부를 class를 바로 생성해도 상관 없음!
	public void addictive() {
		int a = 5;
		int b = 3;
		
		int result = a+b;
		System.out.println(result);
		/*result (해당 값)을 다시 사용하지 않을 경우
		해당 변수를 1번 더 사용해도 된다!
		*/
		result = a-b;
		System.out.println(result);
	}
	public void multiple() {
		int a = 5;
		int b = 3;
		
		int result = a*b;
		System.out.println(result);
		/*result (해당 값)을 다시 사용하지 않을 경우
		해당 변수를 1번 더 사용해도 된다!
		*/
		result = a/b;
		System.out.println(result);
	}
}
