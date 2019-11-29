package com.datastruct.linkedlist.controller;

import com.datastruct.linkedlist.LinkedList;
import com.datastruct.linkedlist.model.Node;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "2,4m,5, taste,12,2334,dsff,2344";
		LinkedList ls = new LinkedList();
		Node ns = null;
		ns = ls.createLinkedList(data);
		
//		while(ns.getPost() != null) {
//			System.out.println("Prev " + ns.getPrev());
//			System.out.println("Data::: " + ns.getData());
//			System.out.println("Post " + ns.getPost());
//			System.out.println("##############################");
//			ns = ns.getPost();
//		}
		
		
		String removeStr = "5";
		System.out.println("Status of Removal:" + ls.removeNode(removeStr, ns));
		System.out.println("##############################");
		while(ns.getPost() != null) {
			System.out.println("Prev " + ns.getPrev());
			System.out.println("Data::: " + ns.getData());
			System.out.println("Post " + ns.getPost());
			System.out.println("##############################");
			ns = ns.getPost();
		}
	}
	
	

}
