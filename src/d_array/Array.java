package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		/*
		 * << 배열 >> - int[] number = new int[5]; - int[] number = new
		 * int[]{1,2,3,4,5}; - int[] number = {1,2,3,4,5};
		 */
		// 배열은 참조형
		int[] array; // 배열의 주소를 지정할 공간이 만들어진다.
		array = new int[5];
		// new : 새로운 저장공간 생성 및 주소 반환
		// int[5] : int를 저장할 수 있는 5개의 공간
		// 배열 초기화시 기본값이 저장된다.
		System.out.println(array[1]); // 실제 값에 접근하기 위해서는 index를 지정해줘야한다.
		// index에는 int만 사용할 수 있다.
		// 배열이 최대 크기는 int의 최대값이다.

		String str = Arrays.toString(array); // 배열의 모든 인덱스에 저장된 값을 문자열로 반환한다.
		System.out.println(str);

		int[] num1 = new int[] { 1, 2, 3 };
		int[] num2 = { 1, 2 };
		int[] num3;
		// num3 = {1,2};
		array[0] = 5;
		array[1] = 4;
		array[2] = 3;
		array[3] = 2;
		array[4] = 1;

		// 정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int[] array2 = new int[10];
		// 모든 인덱스에 있는 값을 변경해주세요.
		for (int i = 0; i < 10; i++) {
			array2[i] = 1 + i;
			System.out.println(array2[i]);
		}
		// 모든 인덱스에 있는 값을 더해주세요
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += array2[i];
		}
		System.out.println(sum);

		// 배열에 숫자를 저장하고 합계와 평균을 구해보자.
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));

		sum = 0;
		double avg = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		avg = (double) sum / numbers.length;
		System.out.println("합계 : " + sum + "\t평균 : " + avg);

		for (int number : numbers) {// 배열에 있는 값을 차례대로 변수에 넣는다.
			System.out.println(number);
		}

		for (int number : numbers) {// 배열에 있는 값을 차례대로 변수에 넣는다.
			number = 0; // numbers의 값은 변경되지않는다.
			System.out.println(number);
		}
		System.out.println(Arrays.toString(numbers));

		// 배열에 저장된 숫자들중 최소값과 최대값을 찾아주세요
		int min = numbers[0], max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			} else if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		System.out.println(min + ", " + max);

		int[] shuffle = new int[30];
		int tmp = 0;
		int index = 0;
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));

		for (int i = 0; i < shuffle.length; i++) {
			index = (int) (Math.random() * 30);
			tmp = shuffle[index];
			shuffle[index] = shuffle[i];
			shuffle[i] = tmp;
		}
		System.out.println(Arrays.toString(shuffle));

		// 1~10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] count = new int[10];
		for (int i = 0; i < 500; i++) {
			int nan = (int) (Math.random() * 10) + 1;

			switch (nan) {
			case 1:
				count[0] += 1;
				break;
			case 2:
				count[1] += 1;
				break;
			case 3:
				count[2] += 1;
				break;
			case 4:
				count[3] += 1;
				break;
			case 5:
				count[4] += 1;
				break;
			case 6:
				count[5] += 1;
				break;
			case 7:
				count[6] += 1;
				break;
			case 8:
				count[7] += 1;
				break;
			case 9:
				count[8] += 1;
				break;
			case 10:
				count[9] += 1;
				break;
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + 1 + "이(가) 생성된 횟수는  " + count[i]);
		}

		// 위 문제의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 새엉된 횟수를 출력해주세요

		Scanner scan = new Scanner(System.in);
		System.out.println("최소값을 입력해주세요 : ");
		min = Integer.parseInt(scan.nextLine());

		System.out.println("최대값을 입력해주세요 : ");
		max = Integer.parseInt(scan.nextLine());

		System.out.println("반복횟수를 입력해주세요 : ");
		int loop = Integer.parseInt(scan.nextLine());
		int[] count2 = new int[max]; // 15 ~ 20 5 0~5

		for (int i = 0; i < loop; i++) {
			
			int nan = (int) (Math.random() * max)+1; // 1~20
			while (nan < min) {
				nan = (int) (Math.random() * max)+1; // 5~20
			} // min~max
			
			for (int j = 0; j < count2.length; j++) {  
				if (j == nan-1) { // nan이 10이면 배열9번에드감
					count2[j] += 1;
					System.out.println(nan);
				}

			}
		}
		for (int i = 0; i < count2.length; i++) {
			if (count2[i] != 0) {
				System.out.println(i+1 + "이(가) 생성된 횟수는  " + count2[i]);
			}
		}

	} // main
}
