package com.zolee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NodeEntity {

	@Id
	@GeneratedValue
	private long id;
	private int nodeValue;
	
	
	public NodeEntity() {
	}
	
	public NodeEntity(int nodeValue) {
		this.nodeValue = nodeValue;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNodeValue() {
		return nodeValue;
	}
	public void setNodeValue(int nodeValue) {
		this.nodeValue = nodeValue;
	}
	
}
