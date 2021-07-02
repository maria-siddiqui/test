package LinkedListTask01;

//import org.apache.log4j.Logger;

public class Node {
//	private static Logger log=Logger.getLogger(Node.class);
	int data;//node contains integer data
	Node next;//stores address of class type
	
	public Node(int data){//parameterized node constructor
		this.data=data;
		next=null;
	}
}