package com.taikang.jkx;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class DateTest {
	
	@Test
	public void fun1(){
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format2 = format.format(date);
		System.out.println(format2);
		
	}
	
	@Test
	public void fun2(){
		String fileName = "1.jpg";
		String[] split = fileName.split("\\.");
		System.out.println(split.length);
	}
	
	/**
	 * 测试linkedHashMap
	 */
	@Test
	public void fun3(){
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(3, "3");
		map.put(2, "2");
		map.put(6, "6");
		map.put(4, "4");
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}
	
	/**
	 * 测试linkedHashMap
	 */
	@Test
	public void fun4(){
		Map<Double, String> map = new HashMap<>();
		map.put(3.34, "3");
		map.put(2.58, "2");
		map.put(6.01, "6");
		map.put(4.26, "4");
		Set<Entry<Double,String>> entrySet = map.entrySet();
		for (Entry<Double, String> entry : entrySet) {
			Double key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
