package org.SinglyLinkedListModel.model;

public class NodeElement<T> {

	public NodeElement(T nodeData) {
		super();
		this.nodeData = nodeData;
	}
	private NodeElement<T> nextElement;
	private T nodeData;
	
	public NodeElement<T> getNextElement() {
		return nextElement;
	}
	public void setNextElement(NodeElement<T> nextElement) {
		this.nextElement = nextElement;
	}
	public T getNodeData() {
		return nodeData;
	}
	public void setNodeData(T nodeData) {
		this.nodeData = nodeData;
	}
	
	
}
