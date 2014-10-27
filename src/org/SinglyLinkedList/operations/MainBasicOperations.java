package org.SinglyLinkedList.operations;

import org.SinglyLinkedListModel.model.NodeElement;

public class MainBasicOperations {

	public static void main(String[] args) {

		BasicOperations basicOperations = new BasicOperations();

		NodeElement<Integer> myLinkedList = new NodeElement<Integer>(1);

		NodeElement<Integer> nodeFound = basicOperations.find(myLinkedList, 1);
		System.out.println("node found-->" + nodeFound.getNextElement());
		myLinkedList = basicOperations.insertInFront(myLinkedList, 2);
		myLinkedList = basicOperations.insertInFront(myLinkedList, 3);
		myLinkedList = basicOperations.insertInFront(myLinkedList, 4);
		myLinkedList = basicOperations.insertInFront(myLinkedList, 5);
		myLinkedList = basicOperations.insertInFront(myLinkedList, 6);
		
		basicOperations.showLinkedListTraversal(myLinkedList);
		
		myLinkedList = basicOperations.removeFirstOne(myLinkedList, 3);
		
		System.out.println("<<--------------remove called for 3----------->>");
		
		basicOperations.showLinkedListTraversal(myLinkedList);

/*
		myLinkedList = basicOperations.removeFirstOne(myLinkedList, 4);
		
		System.out.println("<<--------------remove called for 4, end ----------->>");
		
		basicOperations.showLinkedListTraversal(myLinkedList);
		System.out.println("next of first elemnt-->"+ myLinkedList.getNextElement());*/
		
		
		System.out.println("<----Inserting element after n nodes-->");
		System.out.println("in main"+myLinkedList);
		basicOperations.insertAfterSpecificField(myLinkedList, 10, 3);
		basicOperations.showLinkedListTraversal(myLinkedList);

	}
	
	
	

}
