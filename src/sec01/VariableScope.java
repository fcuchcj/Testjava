package sec01;

public class VariableScope {
	int globalScope = 10;
	//static한 필드
	private static int staticVal = 7;
	
	public void scopeTest (int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}

	
	/*public void scopeTest (int value2) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
}*/
	
	public void scopeTest2 (int value2) {
	
	System.out.println(globalScope);
;
	
}
	
	public static void main(String[] args) {

		
		//해당 class명 변수 =  new class명 (새로운 class 만들기!)
		VariableScope v1 = new VariableScope ();
		//이 안에 globalScope를 저장할 공간을 별도로 가짐!
		System.out.println(v1.globalScope);
		System.out.println(getStaticVal());
		VariableScope v2 = new VariableScope ();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);
		VariableScope.setStaticVal(50);
		VariableScope.setStaticVal(100);
		System.out.println(VariableScope.getStaticVal());
		System.out.println(VariableScope.getStaticVal());
	}


	public static int getStaticVal() {
		return staticVal;
	}


	public static void setStaticVal(int staticVal) {
		VariableScope.staticVal = staticVal;
	}
}