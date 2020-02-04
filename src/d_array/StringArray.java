package d_array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {

		String s = new String("ABCD");
		String str = "ABCD";

		char[] charArray = str.toCharArray(); // String 클래스 내부에 문자 배열을 가지고 있다.
		System.out.println(charArray);

		/*
		 * <<String의 주요 메소드>> 
		 * -equals() : 문자열의 내용이 같은지 확인한다. 
		 * -length() : 문자열의
		 * 길이를 반환한다. 
		 * -charAt() : 문자열에서 해당 위치에 있는 문자를 반환한다. 
		 * -substring() : 문자열에서
		 * 해당 범위에 있는 문자열을 반환한다. 
		 * -indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 * -replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 */
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		String revStr = ""; // str을 거꾸로 담을 변수

		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		System.out.println(revStr);

		str = "0123456789";
		String sub1 = str.substring(3); // 3번 인덱스부터 잘라서 반환한다.
		System.out.println(sub1);

		sub1 = str.substring(5, 8);
		System.out.println(sub1);

		str = "치킨 피자 돈까스 떡볶이";
		int index1 = str.indexOf("피자");
		System.out.println(index1);

		String[] menus = { "치킨 18000원", "피자 9900원", "돈까스 8000원", "떡볶이 500원" };

		for (int i = 0; i < menus.length; i++) {
			String name = menus[i].substring(0, menus[i].indexOf(" "));
			int cost = Integer.parseInt(menus[i].substring(
					menus[i].indexOf(" ") + 1, menus[i].length() - 1));
			System.out.println(name);
			System.out.println(cost);
		}

		str = "123456789";
		str = str.replace("3", "짝");
		System.out.println(str);
		str = str.replace("6", "짝");
		System.out.println(str);
		str = str.replace("9", "짝");
		System.out.println(str);

		String pn = "010-2343-2425";
		// 하이픈(-)을 제거해서 출력해주세요
		String p = pn.replace("-", "");

		System.out.println(pn.length());

		// 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		// 1,234,243
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String last = "";
		int count = 1;

		for (int i = 1; i <= num.length(); i++) {
			
			if(count == 3){				
				last = num.charAt(num.length()-i) + last;
				last = "," + last;
				count = 1;
			}
			else{				
				last = num.charAt(num.length()-i) + last;
				count = count + 1;
			}			
		}
		
		if(last.charAt(0)==','){
			last = last.substring(1,last.length());
		}
		
		System.out.println(last);
	}

}
