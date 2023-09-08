package com.dublylinkedlist;
class Node3 {
    int data;
    Node3 prev, next;

    public Node3(int element) {
        data = element;
        prev = null;
        next = null;
    }
}
public class Deletion {
    Node3 head, tail;
    public void insertion(int element) {
        Node3 n = new Node3(element);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }
    public void traverse() {
        Node3 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void delete(int position) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (position == 1) { // Deleting the head node
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        Node3 current = head;
        int currentPosition = 1;
        while (current != null && currentPosition < position) {
            current = current.next;//this current is pointing to the exact deleted node
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }
        if (current == tail) { // Deleting the tail node
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
            return;
        }
        // Deleting a node in the middle
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }
    public static void main(String[] args) {
        Deletion d = new Deletion();
        d.insertion(10);
        d.insertion(20);
        d.insertion(30);
        System.out.println("Original list:");
        d.traverse();
        d.delete(1);
        System.out.println("List after deletion:");
        d.traverse();
    }
}
