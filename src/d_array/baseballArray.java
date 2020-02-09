package d_array;

import java.util.Scanner;

public class baseballArray {

	public static void main(String[] args) {
		
		int[] num = new int[3];
		
		int answer = 0;
		int strike = 0;		
		int ball = 0;
		int out = 0;
		
		
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 9 )+1;
		}
		
			while ((num[0] == num[1] || num[0] == num[2] || num[1] == num[2])) {
				num[0] = (int) (Math.random() * 9) + 1; // 1~9
				num[1] = (int) (Math.random() * 9) + 1; // 1~9
				num[2] = (int) (Math.random() * 9) + 1; // 1~9
			}			
		

		answer = num[0] * 100 + num[1] * 10 + num[2];
		System.out.println("정답은 : " + answer);
		Scanner scan = new Scanner(System.in);
		String text = "";

		while (true) {
			System.out.println("숫자 세개를 입력해주세요  : ");
			int rs = Integer.parseInt(scan.nextLine());
			int[] result = new int[3];			
			strike = 0;
			ball = 0;
			out = 0;
			
			result[0] = rs / 100;
			result[1] = rs / 10 - result[0] * 10; 
			result[2] = rs % 10; 

			
			
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					if(result[i]==num[j]){
						if(i==j){
							strike += 1;								   
						}
						else{
							ball += 1;
						}
					}
				}
			}
			out = 3-strike-ball;					
		
			if (answer == rs) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("스트라이크 : " + strike + "\t볼 : " + ball
						+ "\t아웃 : " + out);
			}
		}
	}

}
