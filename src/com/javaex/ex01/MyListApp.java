package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		/*
		//배열로 관리
		//미리갯수를 결정해야한다(낭비, 수정)
		//갯수가 고정(변동폭이작을때) 유리하다
		Point[] pArray = new Point[3];
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());   
		}
		*/
		
		PointList pList = new PointList();
		
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		Point p = pList.get(1);
		System.out.println(p.toString());
		System.out.println(pList.size());
		

	}

}
