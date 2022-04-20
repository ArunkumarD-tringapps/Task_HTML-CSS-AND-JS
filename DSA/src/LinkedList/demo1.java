package LinkedList;

public class demo1 {
	public static void main(String[] args)
	{
	linkedlist list=new linkedlist();
	// Adding to list at Beginning
	list.insertAtBeginning(5);
	list.insertAtBeginning(10);
	list.insertAtBeginning(15);
	list.display();
	//Adding to list at end
	System.out.println(" ");
	list.insertAtEnd(66);
	list.display();
	System.out.println(" ");
	// Adding to list specific position
	list.insertAtPos(3,22);
	list.display();
	System.out.println(" ");
	//Deleting at position
	list.deleteAtPos(2);
	list.display();
	}
}
