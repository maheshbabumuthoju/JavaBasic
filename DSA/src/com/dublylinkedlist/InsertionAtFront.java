package com.dublylinkedlist;
class Node1
{
	int data;
	Node1 next,prev,head,tail;
	public void insertAtFront(int element)
	{
		Node1 n= new Node1();
		n.data=element;
//		n.next=null;
//		n.prev=null;
		if(head==null)
		{
			head=tail=n;
		}
		else
		{
			head.prev=n;
			n.next=head;
			head=n;
		}
	}
	public void traverse()
	{
		Node1 temp= head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class InsertionAtFront {

	public static void main(String[] args) {
		Node1 obj= new Node1();
		obj.insertAtFront(10);
		obj.insertAtFront(20);
		obj.insertAtFront(30);
		obj.traverse();
		

	}

}
