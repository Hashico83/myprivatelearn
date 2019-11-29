package com.datastruct.linkedlist;

import com.datastruct.linkedlist.model.Employee;
import com.datastruct.linkedlist.model.Node;
import com.datastruct.linkedlist.model.NodeG;

public class LinkedList {

	public Node createLinkedList(String input) {
		
		// split the comma separated string for each data
		
		String[] linkedListData = input.split(",");
		System.out.println("The Linked List Data is " + linkedListData.length);
		//create the Head Node
		Node headNd = new Node();
		Node currNode = headNd; // node in which needs the next address to be added
		Node lastNode = null;
		for (int i = 0; i < linkedListData.length; i++) {
			System.out.println("Value of I"+ i);
						
			//set data in current node
			currNode = currNode.setData(linkedListData[i]);
			lastNode = this.addNode(currNode);
			currNode = currNode.setPost(lastNode);
			
			if (i == 0) {
				currNode = currNode.setPrev(null);
				headNd = currNode;
			}
			currNode = lastNode;
			}
		
		return headNd;
	}
	
	public String removeNode(String dataSearch, Node startNode) {
		String status = "None";
		Node removeNode = null;
		Node prevNode = null;
		Node laterNode = null;
	
		removeNode = this.searchData(startNode, dataSearch);
		if (removeNode != null) {
			prevNode = removeNode.getPrev();
			laterNode = removeNode.getPost();
			// Actual Removal of the Node
			prevNode = prevNode.setPost(laterNode);
			laterNode = laterNode.setPrev(prevNode);
			status = "Success";
		}
		else {
			status ="Data Not Found";
		}
		
		return status;
		
	}
	
	
	private Node addNode(Node currNode) {
		Node nextNode = new Node();
		nextNode = nextNode.setPrev(currNode);
		nextNode = nextNode.setPost(null);
		return nextNode;	
		
	}
	
	private Node searchData(Node startNode, String searchData) {
		Node dataNode= null;
		while (dataNode == null) {
			
			if (startNode.getPost()!= null) {
				
				System.out.println("searchData");
				if (startNode.getData().toString().equals(searchData)){
					dataNode = startNode;
				}
				startNode = startNode.getPost();
			}
		}
		
		return dataNode;
	}
	
	
	public NodeG<Employee> createEmployeeList(Employee[] emp) {
		NodeG<Employee> headNd = new NodeG<Employee>();
		NodeG<Employee> currNode = headNd;
		NodeG<Employee> nextNode = null;
		for (int i = 0; i < emp.length; i++) {
			
			// set the employee data
			currNode.setData(emp[i]);
			//
			nextNode = new NodeG<Employee>();
			currNode.setPost(nextNode);
			nextNode.setPrev(currNode);
			if (i == 0) {
				//implies head node needs to be stored
				headNd = currNode;
			}
			currNode = nextNode;
			
		}
		return headNd;
	}
}
