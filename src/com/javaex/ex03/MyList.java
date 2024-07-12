package com.javaex.ex03;

public class MyList<T> {

	// 필드
	private T[] oArray;
	private int crtPos;

	// 생성자
	public MyList() {
		// 메모리 올리고
		oArray = (T[])new Object[3];
		crtPos = 0;
	}

	// 메소드 gs

	// 메소드 일반
	public void add(T obj) {
		this.oArray[crtPos] = obj;
		crtPos++;
	}

	public T get(int index) {
		return oArray[index];
	}

	public int size() {
		return crtPos;
	}

}
