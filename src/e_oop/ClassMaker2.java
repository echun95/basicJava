package e_oop;

public class ClassMaker2 {

	// 전역변수 하나를 선언하고 명시적으로 초기화해주세요.
	static int a = 0;
	// 위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	static {
		for (int i = 0; i <= 10; i++) {
			a += i;
		}
	}
	//위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int a) {
		this.a = a;
	}
	//위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	ClassMaker2() {
		this(5);
	}
	//초기화 순서 : 명시적 초기화 -> 초기솨 블럭 -> 생성자
	
	
	
	
	
	
}
