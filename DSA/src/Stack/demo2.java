package Stack;

public class demo2 {
	public static void main(String[] args)
	{
		stack myStack=new stack();
		myStack.push(35);
		myStack.push(13);
		myStack.push(44);
		myStack.push(29);
		myStack.pop();
		myStack.isempty();
		System.out.println("After push and pop operation complete");
		myStack.display();  
	 }
}
