package Hasmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hasclass {
public static void main(String[] args) {
	
	Map<String,String> hp = new HashMap<String,String>();
	hp.put("India", "New Delhi");
	hp.put("Gujrat	", "Ghandhi Nagar");
	hp.put("Mumbai", "Maharastra");
	hp.put(null, "DC");
	hp.put(null, "Kolkata");
	hp.put(null, "Kumar");
	hp.put("Hemant", null);
	hp.put("Deepak", null);
	hp.put("Abhinav", null);
	
	System.out.println(hp.get("India"));
	
	System.out.println(hp.get(null));
	
	System.out.println(hp.get("Deepak"));
	
	//over the keys : using Keyset
	
	Iterator<String> it =hp.keySet().iterator();
	
	while(it.hasNext()) {
		String key =it.next();
		String value = hp.get(key);
		System.out.println("Key is : "+key + "  and  value is :"+value);
	}
	
	
	System.out.println("______________");
	
	
	//using Entryset
	
	Iterator<Entry<String,String>> ht =hp.entrySet().iterator();
	
	while(ht.hasNext()) {
		Entry<String,String> entry =ht.next();
		System.out.println("Key is : "+entry.getKey() + "  and  value is :"+entry.getValue());
	}
	
	
}
}
