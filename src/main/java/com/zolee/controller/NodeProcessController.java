package com.zolee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zolee.dto.Node;
import com.zolee.entity.NodeEntity;
import com.zolee.repository.NodeRepository;

@Service
public class NodeProcessController {

	private Node node;
	private int result;
	private int parentValue;
	private List<Integer> templist;
	
	private NodeRepository nodeRepository;
	
	@Autowired
	public void setNodeRepository(NodeRepository nodeRepository) {
		this.nodeRepository = nodeRepository;
	}

	public void doProcessNodeObject(Node node) {
		result = 0;
		parentValue = 0;
		templist = new ArrayList<>();
		this.node = node;
		calculateValue(node);
		System.out.println(this.node);
		System.out.println("result: " + result);
		
	}
	
	private void calculateValue(Node node) {
		nodeRepository.save(new NodeEntity(node.getValue()));
		if(parentValue != node.getValue()) {
			result = result + node.getValue();
		}
		if(node.getChildren().size()>0) {
			parentValue = node.getValue();
			for(Node tempNode : node.getChildren()) {
				calculateValue(tempNode);
			}
		}
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
