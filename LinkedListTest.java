
public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.addLast("Sathish");
		linkedList.addLast("Priya");
		linkedList.addLast("Rajesh");
		linkedList.addLast("Sudhar");
		linkedList.addLast("Keeban");
		linkedList.addLast("Xavier");
		linkedList.addLast("hungfg");
		linkedList.addLast("esfdsdfc");
		linkedList.addLast("qeweqer");
		linkedList.print();
		
		//linkedList.reverse();
		System.out.println("------------------");
		linkedList.findValueFromLast(9);
		//linkedList.print();
	}

}
