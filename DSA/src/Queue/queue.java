package Queue;

public class queue {
	static final int Max_Size= 100;
	int front;
	int rear;
	//assigning MAX size of the queue
	int queue[] = new int[Max_Size];
	queue() {
		front = -1;
		rear = -1;
		}
	// check whether queue underflow or not
	public boolean isEmpty() {
		if (front == -1)
			return true;
		else
			return false;
		 }
	// check whether queue overflow or not
	public boolean isFull() {
		if (front == 0 && rear == Max_Size - 1) {
			return true;
			}
		return false;
		}
	//create a method to add new element        
	public void enQueue(int x) {
		if (isFull()) {
			System.out.println("Queue is Overflow");
			}
		else {
			if (front == -1)
				front = 0;
			rear++;
			queue[rear] = x;
			System.out.println("Inserted the element in queue "+" "+x);
			}
		}
	// create a method to delete element in queue
	public int deQueue() {
		int x;
		if (isEmpty()) {
			System.out.println("Queue is underflow");
			return (-1);
			}
		else {
			x= queue[front];
			if (front >= rear) {
				front = -1;
				rear = -1;
				}
			// if only one element,after deleting it and reset. */
			else {
				front++;
				}
			System.out.println("Deleted the element in queue " + x);
			return x;
			}
		}
	//create a method to get front element      
	public int frontElement() {
		if(rear == front) {
			System.out.println("Queue is underflow.");
			return 0;
			}
		else {
			return queue[front];
			}
		}
	//create a method to get rear element      
	public int rearElement() {
		if(rear == front) {
			System.out.println("Queue is underflow.");
			return 0;
			}
		else {
			return queue[rear];
			}
		}
	}

