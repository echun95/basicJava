package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		int num1 = 0; 
		int num2 = 0; 
		int num3 = 0; 
		int answer = 0;
		int strike = 0;
		int ball = 0;
		int out = 0;

		while ((num1 == num2 || num1 == num3 || num2 == num3)) {
			num1 = (int) (Math.random() * 9) + 1; // 1~9
			num2 = (int) (Math.random() * 9) + 1; // 1~9
			num3 = (int) (Math.random() * 9) + 1; // 1~9
		}

		answer = num1 * 100 + num2 * 10 + num3;
		System.out.println("정답은 : " + answer);
		Scanner scan = new Scanner(System.in);
		String text = "";

		while (true) {
			System.out.println("숫자 세개를 입력해주세요  : " + answer);
			int rs = Integer.parseInt(scan.nextLine());
			int rs1, rs2, rs3;
			strike = 0;
			ball = 0;
			out = 0;
		
			rs1 = rs / 100;
			rs2 = rs / 10 - rs1 * 10; 
			rs3 = rs % 10; 

			if (rs1 == num1) {
				strike += 1;
			} else if (rs1 == num2) { 
				ball += 1;
			} else if (rs1 == num3) {
				ball += 1;
			} else {
				out += 1;
			}

			if (rs2 == num2) {
				strike += 1;
			} else if (rs2 == num1) { 
				ball += 1;
			} else if (rs2 == num3) {
				ball += 1;
			} else {
				out += 1;
			}

			if (rs3 == num3) {
				strike += 1;
			} else if (rs3 == num1) {
				ball += 1;
			} else if (rs3 == num2) {
				ball += 1;
			} else { 
				out += 1;
			}
			if (answer == rs) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("스트라이크 : " + strike + "\t볼 : " + ball
						+ "\t아웃 : " + out);
			}
		}
	}// main
}
