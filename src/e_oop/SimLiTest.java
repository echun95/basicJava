package e_oop;

import java.util.Scanner;

public class SimLiTest {
	Scanner scan = new Scanner(System.in);
	String rs = "";
	
	void a(){		
		System.out.println("나는 금사빠다");
		System.out.print("답 : ");
		rs = scan.nextLine();
		if(rs.equals("y")|| rs.equals("Y")){
			b();
		}
		else{
			d();
		}
	}
	
	void b(){
		System.out.println("연애할 때 끌려다니는 타입이다.");
		System.out.print("답 : ");
		rs = scan.nextLine();
		if(rs.equals("Y")|| rs.equals("y")){
			e();
		}
		else{
			c();
		}
	}
	
	void c(){
		System.out.println("데이트 코스는 미리 짜는게 편하다.");
		System.out.print("답 : ");
		rs = scan.nextLine();
		if(rs.equals("Y")|| rs.equals("y")){
			f();
		}
		else{
			e();
		}		
	}
	
	void d(){
		System.out.println("감정기복이 크지 않다.");
		System.out.print("답 : ");
		rs = scan.nextLine();
		if(rs.equals("Y")|| rs.equals("y")){
			g();
		}
		else{
			e();
		}		
	}
	
	void e(){
		System.out.println("감정 표현에 솔직한 편이다.");
		System.out.print("답 : ");
		rs = scan.nextLine();
		if(rs.equals("Y")|| rs.equals("y")){
			h();
		}
		else{
			f();
		}		
	}
	
	void f(){
		System.out.println("활동적인 데이트가 좋다.");
		System.out.print("답 : ");
		rs = scan.nextLine();
		if(rs.equals("Y")|| rs.equals("y")){
			h();
		}
		else{
			i();
		}		
	}
	
	void g(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		System.out.print("답 : ");
		rs = scan.nextLine();
		if(rs.equals("Y")|| rs.equals("y")){
			System.out.println("당신의 타입은 a타입 입니다.");
		}
		else{
			h();
		}		
	}
	
	void h(){
		System.out.println("이성친구는 존재할 수 없다.");
		System.out.print("답 : ");
		rs = scan.nextLine();
		if(rs.equals("Y")|| rs.equals("y")){
			i();
		}
		else{
			System.out.println("당신의 타입은 b타입 입니다.");
		}			
	}
	
	void i(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		System.out.print("답 : ");
		rs = scan.nextLine();
		if(rs.equals("Y")|| rs.equals("y")){
			System.out.println("당신의 타입은 d타입입니다.");
		}
		else{
			System.out.println("당신의 타입은 c타입입니다.");
		}		
	}
	
	
	
}
