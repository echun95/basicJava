package d_array;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		/*
		 * <<정렬>> - 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은수와 자리 바꾸기를 반복해 앞에서부터
		 * 작은수를 채워나가는 방식 - 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은수와 자리 바꾸기를 반복해 뒤에서부터
		 * 큰수를 채워나가는 방식 - 삽입정렬 : 두번째 숫자부터 그앞의 모든 숫자들과 비교해서 큰수들을 뒤로 밀고 중간에 삽입하는방식
		 * - 석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식
		 */

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		shuffle(numbers);
		System.out.println(Arrays.toString(numbers)); // 정렬 전

		// printRank(numbers);
		// selectSort(numbers);
		// bubbleSort(numbers);
		insertSort(numbers);
		System.out.println(Arrays.toString(numbers)); // 정렬 후

	}

	private static void insertSort(int[] numbers) {

		int x = 0;
		for (int i = 1; i < numbers.length; i++) {
			
			x = numbers[i];
			
			for (int j = i - 1; j >= 0; j--) {
				
				if (x < numbers[j]) {
					numbers[j + 1] = numbers[j];
					numbers[j] = x;
				} 
				else if (x > numbers[j]) {
					numbers[j + 1] = x;
					break;
				}				
			}
		}

	}

	private static void bubbleSort(int[] numbers) {

		int tmp = 0;
		boolean check = false;

		for (int j = 0; j < numbers.length; j++) {
			check = false;
			for (int i = 0; i < (numbers.length - 1) - j; i++) { // 01 12 23 34
																	// 45 56 78
																	// 89
				if (numbers[i] > numbers[i + 1]) {
					tmp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = tmp;
					check = true;
				}
			}
			if (!check) {
				break;
			}
		}
	}

	private static void selectSort(int[] numbers) {

		int tmp = 0;
		for (int i = 0; i < numbers.length - 1; i++) { // 0 1 2 3 4 5 6 7 8 9
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					tmp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp;
				}
			}
		}
	}

	private static void printRank(int[] numbers) {
		int[] suk = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			suk[i] = 1;
		}
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					suk[i] += 1;
				}
			}
		}
		System.out.println("석차" + Arrays.toString(suk));
	}

	private static void shuffle(int[] numbers) {
		for (int i = 0; i < numbers.length * 10; i++) {
			int random = (int) (Math.random() * numbers.length);
			int tmp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = tmp;
		}
	}

}
