package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private class Node {

		private final int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			value = i;
		}
		//brak wprowadzanych zmian ponieważ inne settry są używane w programie
		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	private static final int ERR_RET = -1;
	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return ERR_RET;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return ERR_RET;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
