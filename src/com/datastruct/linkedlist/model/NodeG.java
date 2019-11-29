package com.datastruct.linkedlist.model;

public class NodeG<T> {
	private NodeG<T> prev;
	private NodeG<T> post;
	private T data;
	
	public NodeG() {
		this.prev = null;
		this.post = null;
		this.data = null;
	}
	
	public NodeG<T> getPrev() {
		return prev;
	}

	public void setPrev(NodeG<T> prev) {
		this.prev = prev;
	}

	public NodeG<T> getPost() {
		return post;
	}

	public void setPost(NodeG<T> post) {
		this.post = post;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
