package LinkedListTask01;
//import org.apache.log4j.Logger;
public class Main {
//	private static Logger log=Logger.getLogger(Main.class);
	public static void main(String[] args){
		
		SinglyLinkedList list =new SinglyLinkedList(); //creates list object of SinglyLinkedList
		
		list.insertData(15); //inserting data in nodes of list
		list.insertData(9);
		list.insertData(20);
		list.insertData(38);
		list.insertData(7);
		list.insertData(41);
		
		list.printList(); //prints entire list
		list.delete(); //deletes entire list
	
//		log.debug(list);
		System.out.println(list); //calling toString method using list object name to print list data
			
	}

}
