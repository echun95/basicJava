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
		boolean check = false;
		char ch = 'd';
		int sw = 0;
		String user1 = "user1";
		String user2 = "user2";
		
		do {
			System.out.println("---------- 게임 방식 선택 -----------");
			System.out.println("1. 컴퓨터랑 하기             2. 1:1 대전        ");
			sw = scan.nextInt();			

			if (sw == 1) {							
				user2 = "컴퓨터";
				while (gameState == 0) {

					o.viewOmok();
					turn = (turn == 1) ? 2 : 1;
					if (turn == 2) {
						x = (char) (97 + (int) (Math.random() * 10)); // a = 97
						y = (int) (Math.random() * 9) + 1;
						System.out.println();
						System.out.println("컴퓨터        x = " + x + "   y = " + y);
					} else {
						System.out.println("x 좌표를 입력하세요.");
						x = scan.next().charAt(0);
						System.out.println("y 좌표를 입력하세요.");
						y = scan.nextInt();
					}

					gameState = o.OmokAction(x, y, turn, sw, user1, user2);
				}
			}
			else {				
				
				while (gameState == 0) {
					o.viewOmok();

					System.out.println("x 좌표를 입력하세요.");
					x = scan.next().charAt(0);
					System.out.println("y 좌표를 입력하세요.");
					y = scan.nextInt();

					turn = (turn == 1) ? 2 : 1;

					gameState = o.OmokAction(x, y, turn, sw,user1,user2);
				}
			}
			
			o.viewOmok();
			System.out.println("게임이 끝났습니다.");
			System.out.println("다시하시겠습니까?");
			ch = scan.next().charAt(0);

			if (ch == 'y' || ch == 'Y') {
				check = true;
				o.OmokClear();
				gameState = 0;
			} else {
				check = false;
			}
		} while (check);
	}
}
