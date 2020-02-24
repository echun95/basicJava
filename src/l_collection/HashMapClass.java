package l_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClass {
	public static void main(String[] args) {
		/*
		 * put() : 지정된 키와 값을 저장
		 * get() : 지정된 키와 값을 반환(없으면 null)
		 * remove() : 지정된 키로 저장된 값을 제거
		 * keyset() : 지정된 모든 키를 set으로 반환
		 */
		
	
		HashMap<String, String> map = new HashMap<>();
		map.put("title", "제목입니다.");
		map.put("content", "내용입니다.");
		map.put("user", "김승섭");
		map.put("date", "2020-02-20 14:48");
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동");
		System.out.println(map.get("user"));

		map.remove("user");
		System.out.println(map.get("user"));
		
		for(String key : map.keySet()){
			System.out.println(key);
		}
	
		//두 사람의 정보를 저장하고 있는 arraylist<hashmap<string><string>>을 만들어주세요.
		//홍길동, 남자, 30세, 프로그래머
		//이순신, 남자, 40세, 장군
		
		HashMap<String, String> hm1 = new HashMap<>();
		hm1.put("이름", "홍길동");
		hm1.put("성별", "남자");
		hm1.put("나이", "30세");
		hm1.put("직업", "프로그래머");
	
		HashMap<String, String> hm2 = new HashMap<>();
		hm2.put("이름", "이순신");
		hm2.put("성별", "남자");
		hm2.put("나이", "40세");
		hm2.put("직업", "장군");
		
		ArrayList<HashMap<String, String>> list = new ArrayList<>();
		list.add(hm1);
		list.add(hm2);		

		for(int i = 0; i<list.size(); i++){ 		
			print(list.get(i)); 			
		}
	
	}
	
    static void print(HashMap<String, String> hm){
		for(String key : hm.keySet()){
			System.out.println(hm.get(key));
		}
	}	
}
