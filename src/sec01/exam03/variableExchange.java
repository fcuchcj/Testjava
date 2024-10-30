package sec01.exam03;

public class variableExchange {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:"+x+",y:"+y);
		
		int temp = x;
		x=y;
		y=temp;
		System.out.println("x:"+x+",y:"+y);
		// x=y, 이것은 단지 x값을 y에게 준 것 뿐이므로, x값은 그대로 존재함! 
		//서로 값을 바꾸기 위해서는, 
		
	}

}
