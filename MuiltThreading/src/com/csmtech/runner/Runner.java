package com.csmtech.runner;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("First", 87);
		map.put("Second", 76);
		map.put("Third", 47);
		
		Set<String> keySet = map.keySet();
		for(String key:keySet) {
			System.out.println(key+" "+map.get(key));
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> x:entrySet) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
	}
}
