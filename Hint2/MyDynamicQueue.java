package hint2;

public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyNode head;
	private int numItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------		
	public MyDynamicQueue(){
		this.head = null;
		this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){

		if(this.numItems == 0) {
			return true;
		}

		return false;

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first(){

		if(!this.isEmpty()) {

			return this.head.getInfo();

		}
		return 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){
		
		MyNode currentNode = head;
		MyNode newNode = null;

		if(this.isEmpty()) {
			//1. We declare a reference node to head
			currentNode = head;
			
			//2. We create the node 
			newNode = new MyNode(element, null);
			
			//3. We make newNode to be the first node of MyList 
			this.head = newNode;
			
			//4. We make the new node to point at current
			newNode.setNext(currentNode);
		} else {

			MyNode previousNode = null;
			int count = 0;

			while (count < numItems){
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				count++;
			}

			newNode = new MyNode(element, null);
			previousNode.setNext(newNode);
			newNode.setNext(currentNode);
		}
		
		this.numItems++;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove() {

		if(!this.isEmpty()) {
			head = head.getNext();
			this.numItems--;
			System.out.println("Item removed successfully!");
		} else {
			System.out.println("ERROR - List is already empty");
		}
	}
}