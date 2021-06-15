package co.friend.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import co.friend.model.Friend;

public class CollectionEx3 {

	public static void main(String[] args) {
		Map<String, Friend> map = new HashMap<>();
		map.put("반장", new Friend("1반", "홍길동", "1111"));
		map.put("평민", new Friend("1반", "홍평민", "2222"));
		map.put("선생", new Friend("1반", "홍두깨", "3333"));
		map.put("반장", new Friend("1반", "박길동", "1212"));

//		System.out.println(map.get("반장"));

		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Friend val = map.get(key);
			System.out.println("key : " + key + ", val : " + val.toString());
		}

		System.out.println("==========================================");
		// Friend : key, Integer : value
		Map<Friend, Integer> scores = new HashMap<>();
		scores.put(new Friend("1반", "홍길동", "1111"), 80);
		scores.put(new Friend("1반", "정인영", "2222"), 90);
		scores.put(new Friend("1반", "김효진", "3333"), 89);
		scores.put(new Friend("1반", "윤지민", "4444"), 91);
		scores.put(new Friend("1반", "홍길동", "1111"), 85);
		
		Set<Entry<Friend, Integer>> ent = scores.entrySet();
		Iterator<Entry<Friend, Integer>> eiter = ent.iterator();
		while(eiter.hasNext()) {
			Entry<Friend, Integer> e = eiter.next();
			System.out.println(e.getKey() + "," + e.getValue());
		}

	}

}
