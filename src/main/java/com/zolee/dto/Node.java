package com.zolee.dto;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

//import org.springframework.util.CollectionUtils;

public class Node {

	private int value;
	private List<Node> children;
	
	public Node() {
	}
	public Node(int value, List<Node> children) {
		this.value = value;
		this.children = children;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public List<Node> getChildren() {
		if(children==null) {
			children = new ArrayList<>();
		}
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
	
	
}
