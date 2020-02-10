
public class LinkedList {
	private Node head;

	private class Node{
		private String value;
		private Node next;
		public Node(String value) {
			super();
			this.value = value;
		}
	}

	public void addLast(String value) {
		Node newNode = new Node(value);
		if(null==head) head= newNode;
		else{
			Node node = head;

			while(true) {
				if(null==node.next) {
					node.next=newNode;
					break;
				}
				node = node.next;
			}
		}
	}

	public void print() {
		if(null!=head) {
			Node node = head;
			while(true) {
				System.out.println(node.value);
				if(node.next==null) break;
				else node = node.next;
			}
		}
	}

	public void reverse() {
		if(null!=head) {
			Node current = head;
			if(null!=head.next) {
				Node first = current.next;
				Node second = first.next;
				while(first!=null) {
					second = first.next;
					first.next = current;
					current = first;
					first = second;
				}
			}
			head.next=null;
			head = current;
		}
	}
	
	public void findValueFromLast(int n) {
		int startPoint = 0;
		int endPoint = n;
		Node startNode = head;
		Node endNode = head;
		Node previousStartNode = head;
		//int count = 0;
		while(endNode.next!=null) {
			for(int i=1; i<endPoint; i++) {
				if(endNode.next==null) break;
				endNode = endNode.next;
				startPoint=i;
			}
			if(endPoint-startPoint>1) {
				for(int j=0; j<endPoint-(endPoint-startPoint);j++) {
					previousStartNode = previousStartNode.next;
				}
				break;
			}
			System.out.println("Distance travelled is ---- >"+(endPoint-startPoint));
			System.out.println("Start Node --- > "+startNode.value);
			System.out.println("End Node --- > "+endNode.value);
			previousStartNode = startNode;
			System.out.println("Previous Start Node --- > "+previousStartNode.value);
			startNode = endNode;
		}	
		
		System.out.println("Nth Value is----->"+previousStartNode.value);
	}
}
