package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

		Map<String, Point> pMap = new HashMap<String, Point>();
		
		Point p01 = new Point(2, 4);
		Point p02 = new Point(2, 4);
		Point p03 = new Point(43, 78);
		
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		
		System.out.println(pMap.get("박명수").toString());
		System.out.println(pMap.get("박명수").getX());
		
		Point p04 = new Point(100,100);
		pMap.put("박명수", p04);
		System.out.println(pMap.get("박명수"));
		
		
		System.out.println("------------------------------------");
		Set<String> keys =  pMap.keySet();
		
		for(String key  : keys) {
			System.out.println(pMap.get(key).toString());
			System.out.println(pMap.get(key).getX());
		}
		
	}

}
