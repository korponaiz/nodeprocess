package com.zolee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zolee.TestNodeObject;
import com.zolee.dto.Node;

@RestController
public class NodeController {

	private NodeProcessController nodeProcessController;
	private TestNodeObject testNodeObject;
	
	@Autowired
	public void setNodeProcessController(NodeProcessController nodeProcessController) {
		this.nodeProcessController = nodeProcessController;
	}

	@Autowired
	public void setTestNodeObject(TestNodeObject testNodeObject) {
		this.testNodeObject = testNodeObject;
	}

	@RequestMapping("/node/{node}")
	public int index2(@PathVariable(value="node") Node node) {
		nodeProcessController.doProcessNodeObject(node);
		return nodeProcessController.getResult();
	}

	@RequestMapping("/test")
	public int index() {
		nodeProcessController.doProcessNodeObject(testNodeObject.getRootNode());
		return nodeProcessController.getResult();
	}
	
}
