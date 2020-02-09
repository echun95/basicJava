package test;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {

	/*	int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		for (int i = 0; i < name.length; i++) {
			name[i] = scan.nextLine();
			System.out.println(name[i]);
		}

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		int min = score[0];
		int max = score[0];
		for (int i = 1; i < score.length - 1; i++) {
			if (score[i] < min) {
				min = score[i];
			} else if (score[i] > max) {
				max = score[i];
			}
		}
		System.out.println(max + "," + min);*/

	/*	int[][] arr2 = { { 5, 5, 5, 5, 5 },
				{ 10, 10, 10, 10, 10 },				
				{ 20, 20, 20, 20, 20 }, 
				{ 30, 30, 30, 30, 30 }};
		int sum = 0;
		double avg;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum = sum + arr2[i][j];
			}
		}
		avg = (double) sum / (arr2.length * arr2[0].length);
		System.out.println(sum +","+avg);*/
		
		
		/*int[] answer= {1,3,4,4,2,1,2,2};
		int[] counter = new int[4];	

		for(int i = 0; i<answer.length; i++){
			counter[answer[i]-1]++;
		}
		for(int i = 0; i<counter.length; i++){
			System.out.print(i+1);
			for(int j = 0; j<counter[i]; j++){
			System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*
		String menu[] ={ "아메리카노 3000원", "카푸치노 4000원", "카페라떼 3500원"};

		String name;
		String won;

		for(int i = 0; i<menu.length; i++){
			int index = menu[i].indexOf(" ");
			name = menu[i].substring(0,index);
			won = menu[i].substring(index + 1,menu[i].length()-1);
			System.out.println(name);
			System.out.println(won);
		}
		*/
		
		/*String str="i Love Java";

		System.out.println(str.indexOf("Java"));
		*/
		
		
	    /*	String  s="java.lang.Object";

				int index = s.indexOf("lang");
				System.out.println(s.substring(index,index+4));
		*/
		
		
	/*	String animals = "dog,cat,bear";

		String[] a = animals.split(","); 
		for(int i = 0; i<a.length; i++){
		System.out.println(a[i]);
		}*/
		
		
		
		String str="java,lang,Object";


				System.out.println(str.replace(",","."));

		
		
		
		
		
	}// main
}
