package l_collection;

import java.util.ArrayList;

public class ArrayListClass {
	public static void main(String[] args) {
		/*
		 * add() : 마지막 위치에 객체를 추가
		 * get() : 지정된 위치의 객체를 반환
		 * set() : 지정된 위치에 주어진 객체를 저장(수정)
		 * remove() : 지정된 위치의 객체를 제거
		 * size() : 저장된 객체의 수 반환
		 
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("STRING");
		list.add(true);
		list.add(new ArrayList());
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("abc");
		list2.add("123");
		list2.add("가나다");
		list2.set(1, "456");
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		list2.remove(0);
		System.out.println(list2.get(0));
		
		ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(10);
		list4.add(20);
		list3.add(list4);
		list4 = new ArrayList<>();
		list4.add(30);
		list4.add(40);
		list3.add(list4);
		*/
		//정수를 저장할 수 있는 ArrayList를 생성해 1~100사이의 랜덤한 값을 5번 저장해주세요
		ArrayList<Integer> list5 = new ArrayList<>();
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 100;
		
		
		
		for (int i = 0; i < 5; i++) {
			list5.add((int)(Math.random()*100) + 1);
			sum += list5.get(i);
			avg = sum/5.0;			
			if(max < list5.get(i)){
				max = list5.get(i);
			}
			if(min > list5.get(i)){
				min = list5.get(i);
			}
			System.out.println(list5.get(i));
		}
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		
		
		
		
		
		
		
	}
	
}
