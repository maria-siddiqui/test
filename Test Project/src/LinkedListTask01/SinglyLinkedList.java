package LinkedListTask01;

//import org.apache.log4j.Logger;

public class SinglyLinkedList {
//	private static Logger log=Logger.getLogger(SinglyLinkedList.class);
	Node head; //creates head object of class node of linkedlist
	
	public void insertData(int data){ //function to add data in nodes of list
		Node node=new Node(data);//node object of node class
		if (head==null){ //checks if head is null or list is empty
			head=node; //creates head of given node
		}
		else{
			Node current=head; //if head is not null then current node is head
			while (current.next!=null){ //loop runs until the next of current node is null
				current=current.next; //moves from current node to the next node
			}
			current.next=node; //when next node is null puts given node in that null node
		}
	}
	
		public void printList(){ //function to print list from head to the second last node
			
			if (head==null){ //checks if list is empty
				System.out.println("Empty List"); // prints empty list
			}
			else{

	        Node current=head;
	        while (current.next!=null){
	            System.out.println(current.data);
	            current = current.next;
	        }
	        System.out.println(current.data); //prints the data of last node
			}
	    }

		public void delete(){ //function to delete entire list
			head=null;
		}
		
//Overriding toString method to print linkedlist using list object
		public String toString(){ //toString method 
			String str=" ";
			if (head==null){ //checks if list is empty
				return "Empty List"; // prints empty list
			}
			else{
			Node current=head;  //starts from head
			while (current.next!=null){ //ends to the second last node
				str=str+"\n"+current.data; //restores all nodes data in string
				current=current.next; //moves to the next node
			}
			str=str+ "\n" +current.data; //takes last node data in stored string
			return str; //returns all nodes' data in string format
			}
		}
	
}

