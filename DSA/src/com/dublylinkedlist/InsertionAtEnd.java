package com.dublylinkedlist;
class Node
{
	int data;
	Node next,prev,head,tail;//by default all reference are "null"
	public void insertionAtEnd(int element)
	{
		Node n= new Node();
		n.data=element;
		n.next=null;
		n.prev=null;
		if(head==null)
		{
			head=tail=n;
		}
		else
		{
			tail.next=n;
			n.prev=tail;
			tail=n;
		}
	}
	public void tracerse()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
}
public class InsertionAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n = new Node();
		n.insertionAtEnd(10);
		n.insertionAtEnd(20);
		n.tracerse();
		

	}

}
