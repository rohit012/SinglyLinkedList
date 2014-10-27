package org.SinglyLinkedList.operations;

import org.SinglyLinkedListModel.model.NodeElement;

public class BasicOperations {

	// always keep track of header, no matter what
	public NodeElement<Integer> insertInFront(NodeElement<Integer> list,
			int data) {

		NodeElement<Integer> newNode = new NodeElement<Integer>(data);
		newNode.setNextElement(list);
		return newNode;

	}

	// traversing function, this function should check null return at client
	public NodeElement<Integer> find(NodeElement<Integer> head, int data) {

		NodeElement<Integer> element = head;

		while (element != null && element.getNodeData() != data) {
			element = element.getNextElement();
		}
		return element;

	}

	// delete specific linked list

	public NodeElement<Integer> removeFirstOne(NodeElement<Integer> head,
			int data) {

		NodeElement<Integer> element = head;
		
		if(head.getNodeData()==data){
			head=head.getNextElement();
			return head;
			
		}

		else 
		while (element != null) {
			if (element.getNextElement().getNodeData() == data) {
				element.setNextElement(element.getNextElement()
						.getNextElement());
				break;
			}
			element = element.getNextElement();

		}

		return head;

	}
	
	
	// show traversal
	
	public void showLinkedListTraversal(NodeElement<Integer> head){
		
		NodeElement<Integer> element=head;
		
		while(element!=null){
			System.out.println("node data"+element.getNodeData());
			element=element.getNextElement();
			
		}
		
	}
	
	
	public NodeElement<Integer> insertAfterSpecificField(NodeElement<Integer> head,
			int data,int position) {

		System.out.println("in insert "+head);
		head.setNodeData(9999);
		NodeElement<Integer> newNode = new NodeElement<Integer>(data);
		
		NodeElement<Integer> element = head;
		
		for(int i=0;i<position-1;i++){
			
			element=element.getNextElement();
			
		}

		newNode.setNextElement(element.getNextElement());
		element.setNextElement(newNode);
		
		return head;

	}
	

}
