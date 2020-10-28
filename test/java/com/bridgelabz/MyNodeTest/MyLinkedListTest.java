package com.bridgelabz.MyNodeTest;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	@Test
	public void givenThreeValues_WhenLinked_ShouldPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode =  new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && 
						 mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);	
	}
	@Test
	public void givenThreeValues_WhenLinked_ShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) &&
						 myLinkedList.head.getNext().equals(mySecondNode) &&
						 myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	@Test
	public void givenThreeValues_WhenLinked_ShouldBeAddedToLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.tail.equals(myThirdNode) &&
				 myLinkedList.head.getNext().equals(mySecondNode) &&
				 myLinkedList.head.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	@Test
	public void givenThreeValues_WhenInsertingInBetweenLinked_ShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode ,mySecondNode);
		myLinkedList.printNodes();
		boolean result = myLinkedList.tail.equals(myThirdNode) &&
				 myLinkedList.head.getNext().equals(mySecondNode) &&
				 myLinkedList.head.equals(myFirstNode);
		Assert.assertTrue(result);
	}
	@Test
	public void givenThreeValues_WhenFirstElementDeleted_ShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);	
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.delete();
		myLinkedList.printNodes();
		boolean result = myLinkedList.head.equals(mySecondNode);
		Assert.assertTrue(result);
	}
}
