package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();

		while(true) {
			if(iSet.size()==6) {
				break;
			}
			int no = (int) (Math.random() * 45) + 1;
			iSet.add(no); //박싱 --> 주머니에 주소가 들어감
			System.out.println(no);
		}
		
		System.out.println("-------");
		//출력
		for( int no : iSet) {
			 System.out.println(no);
		}
		
	}

}
