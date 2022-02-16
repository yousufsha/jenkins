package com.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaListSet {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10); //0
		li.add(20); //1
		li.add(30); //2
		li.add(40); //3
		li.add(50); //4
		li.add(60); //5
		li.add(20); //6
		li.add(30); //7
		li.add(40); //8
		li.add(10); //9
		
		Set<Integer> se = new TreeSet<Integer>();
		se.add(10); //0
		se.add(20); //1
		se.add(30); //2
		se.add(40); //3
		se.add(10); //4 
		se.add(40); //5
		
		se.addAll(li);
		System.out.println(se);
		System.out.println("**********************");
		int length = li.size();
		System.out.println(length);
		System.out.println("**********************");
		int lastIndexOfList = li.size()-1;
		System.out.println(lastIndexOfList);
		System.out.println("**********************");
		for (int i = 0; i < 5; i++) {
			System.out.println(li.get(i));
		}
		System.out.println("**********************");
		int middleValue = li.size()/2;
		System.out.println(li.get(middleValue));
		System.out.println("**********************");
		int size = li.size();
		for (int i = (size-1); i >= (size-5); i--) {
		System.out.println(li.get(i));
		}
		System.out.println("**********************");
		for (int i = 0; i < length; i++) {
			System.out.println(li.get(i));
		}
		System.out.println("**********************");
		for (Integer integer : li) {
			System.out.println(integer);
		}
		System.out.println("**********************");
		for (int i = 0; i < (length); i=i+2) {
			System.out.println(li.get(i));
		}
	}
}
