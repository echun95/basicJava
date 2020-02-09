package e_oop;

public class OOP {

	public static void main(String[] args) {

		/*
		 * <<OOP(Object Oriented Programming) : 객체지향 프로그래밍>>
		 * - 프로그래밍을 단순히 코드의 연속으로 보는것이 아니라 객체간의 상호작용으로 보는것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.
		 * 
		 * <<객체 생성(인스턴스화)>>
		 * - 클래스를 사용하기 위해 메모리(Heap영역)에 올려놓은 것
		 * - new 클래스명(); -> 객체가 저장된 메모리 주소 반환
		 * - 객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메소드에 접근할 수 있다.
		 * - 객체는 생성될 떄마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		 */
		
		
		
		SampleClass sc = new SampleClass();
		sc.method1();
		sc.method2(5);
		String returnString = sc.method3();
		System.out.println(returnString);
		System.out.println(sc.method4(4, 5));
		sc.flowTest1();
		
		//방금 만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		//객체가 저장된 변수를 통해 메소드들을 호출해주세요.
		//파라미터가 있는 메소드는 타입에 맞는 값을 넘기고, 리턴 타입이 있는 메소드는 리턴받은값을 출력해주세요
		ClassMaker cm = new ClassMaker();
		cm.method1();
		System.out.println(cm.method2());
		cm.method3("파라미터로 전달된 데이터");
		int a = 3;
		int b =4;
		System.out.println(a + " * " + b + " = " + cm.method4(a,b));
		
		//다음을 한줄씩 계산해서 최종 결과값을 출력해주세요
		/*1. 123456+654321
		2. 1번이 결과값 * 123456
		3. 2번의결과값 / 123456
		4. 3번의결과값 - 654321
		5. 4번의 결과값 % 123456*/
		
		Calculator cal = new Calculator();
		double result = 0;
		
		result = cal.plus(123456, 654321);		
		System.out.println(result);
		
		result = cal.multy(result, 123456);		
		System.out.println(result);
		
	    result = cal.division(result, 123456);		
		System.out.println(result);
		
		result = cal.minus(result, 654321);		
		System.out.println(result);
		
		result = cal.nmg(result, 123456);		
		System.out.println(result);
		
		SimLiTest simli = new SimLiTest();
		simli.a();
		
		
		
		
		
		
		
		
		
		
	}

}
