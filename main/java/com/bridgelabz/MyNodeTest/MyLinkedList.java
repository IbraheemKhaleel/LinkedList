package com.bridgelabz.MyNodeTest;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null ;
	}

	public void add(INode<K> newNode) {
		if(this.head == null )
			this.head = newNode;
		if(this.tail == null)
			this.tail = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
		
	}

	public void printNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes  ");
		INode tempNode = head ;
		while (tempNode.getNext()!= null ) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("  ->  ");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
		
	}

}
