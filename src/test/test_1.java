package test;

public class test_1 {

	public static void main(String[] args) {
		System.out.println(abs(-3));
	}

	static int abs(int value) {
		
		if (0 < value) {
			return value;
		} 
		else {
			return value * -1;
		}
	}
}
