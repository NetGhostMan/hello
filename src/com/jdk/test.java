package com.jdk;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class test {
	private Map<String, String> map = new LinkedHashMap<String, String>();

	private void addmap() {
		// TODO Auto-generated method stub
		map.put("1", "aaa");
		map.put("2", "bbb");
		map.put("3", "ccc");
	}

	// 导出map数据（普通法方法）
	@SuppressWarnings("rawtypes")
	@Test
	public void test1() {
		addmap();
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			String key = (String) it.next();
			String valve = map.get(key);
			System.out.println(key + ":" + valve);
		}
	}
	@SuppressWarnings("rawtypes")
	@Test
	public void test2() {
		addmap();
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			String key = (String) entry.getKey();
			String vlaue = (String) entry.getValue();
			System.out.println(key + ":" + vlaue);
		}
	}
	@Test
	public void test3() {
		// TODO Auto-generated method stub
		addmap();
		for(Object obj : map.keySet()){
			String key = (String) obj;
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
	@Test
	public void test4() {
		// TODO Auto-generated method stub
		addmap();
		for(Object obj : map.entrySet()){
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Entry) obj;
			String key = (String) entry.getKey();
			String value = (String) entry.getValue(); 
			System.out.println(key + ":" + value);
		}
	}

}
