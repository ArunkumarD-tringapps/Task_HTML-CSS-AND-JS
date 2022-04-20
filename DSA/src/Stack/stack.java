package Stack;

public class stack {
	static final int Max_size =25;
	int top;
	//assigning Max size of the stack
	int stack[] = new int[Max_size];
	stack() {
	top = -1;
	}
	//check whether the stack is empty or not  
	public void isempty() {
	   if(top == -1) {
	     System.out.println("Stack is Underflow.");
	   } else {
	     System.out.println("Stack is not empty.");
	   }
	 }
	//create a method to add new element      
	public void push(int x){
	   if(top == (Max_size - 1)){
	     System.out.println("Stack is Overflow");
	     return;
	   } else {
	     stack[++top] = x;
	     System.out.println( "Added into the stack"+" "+x);
	   }
	 }
	// create a method to delete the element
	public void pop(){
	   if(top < 0){
	     System.out.println("Stack is Underflow");
	     return ;
	   } else {
	     int x = stack[top--];
	     System.out.println("Deleted from the stack"+" "+x);
	   }
	 }
	  // create method to display stack elements
	public void display() {
	if(top==-1) {
	System.out.println("No elements to display !!");
	return;
	}
	for(int i=top;i>=0;i--) {
	System.out.print(stack[i]+" ");
	}
	}
 }


