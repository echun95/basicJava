package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {

		/*
		 * <<for문>> - for(int i = 1; i<=10; i++){} - for(1부터 10까지 1씩 증가하면서 반복){}
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "번째 반복");
		}
		int sum = 0; // 1부터 10까지 합계를 저장
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		System.out.println(sum);

		sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 100; i >= 0; i--) {
			sum = sum + i;
		}
		System.out.println(sum);

		// 1부터 100까지 짝수의 합을 구해보자.
		sum = 0;
		for (int i = 2; i <= 100; i = i + 2) {
			sum = sum + i;
		}
		sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		sum = 0;

		// 1부터 100까지 홀수의 합을 구해보자.
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

		// 킹갇단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + i * 2);
		}
		for (int i = 1; i <= 71; i++) {
			System.out.println("71 * " + i + " = " + i * 71);
		}

		// KingGodDan
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.println(i + " * " + j + " = " + i * j);
		}

		// 킹갇단 전체의 짝수단 홀수줄만 출력해주세요.

		for (int i = 2; i <= 9; i += 2) {
			for (int j = 1; j <= 9; j += 2)
				System.out.println(i + " * " + j + " = " + i * j);
		}

		// KingGodDan 가로
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 9) {
					System.out.println(j + " * " + i + " = " + i * j);
				} else
					System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
		}
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * <<while문>> - while(조건식){} - 조건식의 결과가 true인 동안 계속해서 반복 - 반복 횟수를 알 수 없을
		 * 때 사용한다.
		 */

		// 사용자가 입력한 단의 킹갇단을 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		/*
		 * while (true) {
		 * 
		 * System.out.print("단을 입력해주세요 : "); int dan =
		 * Integer.parseInt(scan.nextLine()); if (dan == 0) {
		 * System.out.println("프로그램이 종료되었습니다."); break; }
		 * 
		 * for (int i = 1; i <= dan; i++) { System.out.println(dan + " * " + i +
		 * " = " + dan * i); } } //while
		 */
		/*
		 * <<do-while문>> - do{}while(조건식); - 최소한 한번의 수행을 보장한다.
		 */

		// 숫자 맞추기 게임을 만들어보자.
		int answer = (int) (Math.random() * 100) + 1;// 1~100까지 랜덤수
		int input = 0;
		do {
			System.out.println("1~100 사이의 수를 입력해주세요");
			input = Integer.parseInt(scan.nextLine());
			if (answer < input) {
				System.out.println(input + "보다 작습니다.");
			} else if (answer > input) {
				System.out.println(input + "보다 큽니다.");
			} else {
				System.out.println("정답입니다.");
			}
		} while (input == answer);

		// 이름붙은 반복문
		outer: for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
					//break;// 가장 가까운 반복문 하나를 빠져나간다.
					// break outer; //outer라는 이름의 반복문을 빠져나간다.
					 //continue; //가장 가까운 반복문의 현재 반복회차를 빠져나간다.
					 continue outer; //outer 라는 이름의 반복문의 현재 반복회차를 빠져나간다.
				}
				System.out.println(i + " * " + j + "=" + i * j);
			}
			System.out.println();
		}

	} // main

}
