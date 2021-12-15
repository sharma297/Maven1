package Hasmap;

import java.util.HashMap;
import java.util.HashSet;

public class CompareMaps {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		map3.put(3, "C");
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "D");
		
		
		//on the basis of key-value : using equal method
		
		System.out.println(map1.equals(map2));//true
		System.out.println(map1.equals(map3));//false
		
		
		//compare using keyset
		System.out.println(map1.keySet().equals(map2.keySet()));//true
		System.out.println(map1.keySet().equals(map3.keySet()));//true
		
		// to know the extra key
		HashMap<Integer,String> map4 = new HashMap<Integer,String>();
		map4.put(3, "C");
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(4, "D");
		
		HashSet<Integer> combinekey = new HashSet<>(map1.keySet());
		combinekey.addAll(map4.keySet());
		combinekey.removeAll(map1.keySet());
		System.out.println(combinekey);
		
		
		HashSet<Integer> com = new HashSet<Integer>(map1.keySet());
		com.addAll(map4.keySet());
		com.removeAll(map1.keySet());
		System.out.println(com);
	}

}
