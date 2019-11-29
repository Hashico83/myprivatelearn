package com.datastruct.linkedlist.model;

public class Node {
	
	private Node prev;
	private Node post;
	private String data;
	
	public Node() {
		this.prev = null;
		this.post = null;
		this.data = "";
	}
	
	public Node getPrev() {
		return prev;
	}

	public Node setPrev(Node prev) {
		this.prev = prev;
		return this;
	}

	public Node getPost() {
		return post;
	}

	public Node setPost(Node post) {
		this.post = post;
		return this;
	}

	public String getData() {
		return data;
	}

	public Node setData(String data) {
		this.data = data;
		return this;
	}


}
