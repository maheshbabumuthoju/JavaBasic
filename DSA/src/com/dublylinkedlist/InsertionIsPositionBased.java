package com.dublylinkedlist;

class Node2 {
    int data;
    Node2 prev, next;

    public Node2(int element) {
        data = element;
        prev = null;
        next = null;
    }
}

public class InsertionIsPositionBased {
    Node2 head, tail;

    public void insertAtPosition(int position, int element) {
        if (position < 1) {
            System.out.println("Position must be >= 1");
            return;
        }

        Node2 newNode = new Node2(element);

        if (position == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;

            if (tail == null) {
                tail = newNode; // If this is the first element in the list
            }

            return;
        }

        Node2 current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.prev = current;
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;//current.next==0x200 --> current.next.prev==(0x200.prev=newNode)
        }
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode; // Update tail if inserting at the end
        }
    }
    public void traverse()
    {
    	Node2 temp=head;
    	while(temp!=null)
    	{
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    }

    public static void main(String[] args) {
        InsertionIsPositionBased list = new InsertionIsPositionBased();
        list.insertAtPosition(1, 10);
        list.insertAtPosition(1, 20);
        list.insertAtPosition(3, 30);
        list.insertAtPosition(4, 100);
        list.insertAtPosition(2, 0);
        list.traverse();
    }
}
