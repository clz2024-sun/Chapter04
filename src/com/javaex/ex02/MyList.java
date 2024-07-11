package com.javaex.ex02;

public class MyList {

	// 필드
	private Object[] oArray;
	private int crtPos;

	// 생성자
	public MyList() {
		// 메모리 올리고
		oArray = new Object[3];
		crtPos = 0;
	}

	// 메소드 gs

	// 메소드 일반
	public void add(Object obj) {
		this.oArray[crtPos] = obj;
		crtPos++;
	}

	public Object get(int index) {
		return oArray[index];
	}

	public int size() {
		return crtPos;
	}

}
