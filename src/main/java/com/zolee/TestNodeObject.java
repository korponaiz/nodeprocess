package com.zolee;

import org.springframework.stereotype.Component;

import com.zolee.dto.Node;

@Component
public class TestNodeObject {
	
	private Node rootNode;
	private int tempInt = 0;
	
	public TestNodeObject() {
		rootNode = new Node();
		Node node1 = new Node();
		node1.setValue(3);
		Node node2 = new Node();
		node2.setValue(4);
		Node node3 = new Node();
		node3.setValue(3);
		Node node11 = new Node();
		node11.setValue(4);
		Node node12 = new Node();
		node12.setValue(2);
		Node node13 = new Node();
		node13.setValue(7);
		Node node14 = new Node();
		node14.setValue(3);
		Node node15 = new Node();
		node15.setValue(3);
		Node node16 = new Node();
		node16.setValue(3);
		Node node17 = new Node();
		node17.setValue(3);
		Node node18 = new Node();
		node18.setValue(3);
		Node node19 = new Node();
		node19.setValue(3);
		Node node191 = new Node();
		node191.setValue(3);
		Node node111 = new Node();
		node111.setValue(3);
		Node node112 = new Node();
		node112.setValue(6);
		Node node113 = new Node();
		node113.setValue(8);
		Node node1121 = new Node();
		node1121.setValue(1);
		Node node1122 = new Node();
		node1122.setValue(3);
		Node node21 = new Node();
		node21.setValue(2);
		Node node22 = new Node();
		node22.setValue(4);
		Node node31 = new Node();
		node31.setValue(4);
		Node node311 = new Node();
		node311.setValue(3);
		
		rootNode.getChildren().add(node1);
		rootNode.getChildren().add(node2);
		rootNode.getChildren().add(node3);
		node1.getChildren().add(node11);
		node1.getChildren().add(node12);
		node1.getChildren().add(node13);
		node1.getChildren().add(node14);
		node1.getChildren().add(node15);
		node1.getChildren().add(node16);
		node1.getChildren().add(node17);
		node1.getChildren().add(node18);
		node1.getChildren().add(node19);
		node1.getChildren().add(node191);
		node11.getChildren().add(node111);
		node11.getChildren().add(node112);
		node11.getChildren().add(node113);
		node112.getChildren().add(node1121);
		node112.getChildren().add(node1122);
		node2.getChildren().add(node21);
		node2.getChildren().add(node22);
		node3.getChildren().add(node31);
		node31.getChildren().add(node311);

	}

	public Node getRootNode() {
		return rootNode;
	}


}
