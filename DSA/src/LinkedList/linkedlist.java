package LinkedList;

public class linkedlist {
	Node head;
	class Node{
	int data;
	Node next;
	// constructor for data initial
	Node(int val){
		data=val;
		next=null;
		}
	}
	linkedlist(){
		head=null;
		}
	public void insertAtBeginning(int val)
	{
		Node newNode=new Node(val);
		// when list empty
		if(head==null)
		{
			head=newNode;
			}
		// list is not empty
		else {
			newNode.next=head;
			head=newNode;
			}
		}
	// Display the element
	public void display() {
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
			}
		}
	public void insertAtEnd(int val) {
		Node newNode=new Node(val);
		if(head==null){
			head=newNode;	
			}
		else {
			Node temp = new Node(val);
			temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
	}
	//insert the element in particular position
	public void insertAtPos(int pos,int val)
	{
		if(pos==0)
		{
			insertAtBeginning(val);
			return;
			}
		Node newNode=new Node(val);
		Node temp=head;
		for(int i=0;i<pos-1;i++)
		{
			temp=temp.next;
			if(temp==null)
			{
				System.out.println("Invalid Position");
				return;
				}
			}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	public void deleteAtPos(int pos)
	{
		if(head==null)
		{
			System.out.println("Empty list");
			return;
			}
		if(pos==0)
		{
			head=head.next;
			return;
			}
		Node temp=head;
		Node prev=null;
		//move till node to be deleted
		for(int i=0;i<pos;i++)
		{
			//Keep trace of previous node
			prev=temp;
			//Move to next node
			temp=temp.next;
			}
		// Reassign
		prev.next=temp.next;
		}
}
