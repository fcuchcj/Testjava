package sec02;

public class Calculatormachine {
public static void main(String[] args) {
	int a = 5;
	int b =3;
	int c = 20;
	//값이 new메소드를 통해서 옮겨지지 않고, 주소값이 옮겨진다!
	Carculator Carculator5 = new Carculator();
	System.out.println(Carculator5.add(a, b));
	//직접 값을 넣어서 선언도 가능!
	System.out.println(Carculator5.minus(6, 3));
	System.out.println(Carculator5.multiple(a, b));
	System.out.println(Carculator5.divide(a, b));
	System.out.println(Carculator5.remaining(a, b));
	}
}
