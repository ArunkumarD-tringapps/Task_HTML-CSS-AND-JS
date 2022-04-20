package Queue;

public class demo3 {
	public static void main(String[]arg)
	{
		queue myqueue=new queue();
		myqueue.enQueue(10);
	    myqueue.enQueue(20);
	    myqueue.enQueue(30);
	    myqueue.enQueue(40);
	    myqueue.deQueue();
	    System.out.println( myqueue.frontElement());
	    System.out.println( myqueue.rearElement());
	}
}
