package test;

import java.util.Scanner;

public class omokmain {

	public static void main(String[] args) {

		int gameState = 0;
		int turn = 0;
		char x;
		int y = 0;
		
		omok o = new omok();
		Scanner scan = new Scanner(System.in);

		while (gameState == 0) {
			o.viewOmok();
			
			System.out.println("x 좌표를 입력하세요.");
			x = scan.next().charAt(0);
			System.out.println("y 좌표를 입력하세요.");
			y = scan.nextInt();

			turn = (turn == 1) ? 2 : 1;

			gameState = o.OmokAction(x, y, turn);
		}

		o.viewOmok();
		System.out.println("게임이 끝났습니다.");
	}

}
