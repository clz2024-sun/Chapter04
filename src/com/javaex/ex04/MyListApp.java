package com.javaex.ex04;

import java.util.LinkedList;
import java.util.List;

public class MyListApp {

	public static void main(String[] args) {
		
		List<Point> pList = new LinkedList<Point>();

		Point p01 = new Point(2,3);
		Point p02 = new Point(12,13);
		Point p03 = new Point(22,23);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		//pList.add2(p01, p2)
		
		System.out.println(pList.size());

		Point p = pList.get(1);
		System.out.println(p.getY());
		
		Point p2 = pList.get(2);
		System.out.println(p2.toString());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("-------------------------------");
		pList.remove(1);
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("-------------------------------");
		System.out.println(pList.toString());
		
	}

}
