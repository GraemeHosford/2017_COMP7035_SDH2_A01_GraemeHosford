package hint3;

public class MyDoubleDynamicQueue<T> implements MyQueue<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private MyDoubleLinkedNode<T> head;
	private MyDoubleLinkedNode<T> tail;
	private int numItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicQueue(){
		head = null;
		tail = null;
		numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){

		if(numItems == 0) {
			return true;
		}

		return false;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public T first(){

		if(!this.isEmpty()) {
			return this.head.getInfo();
		} else {
			System.out.println("ERROR - List is empty");
		}

		return null;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element) {

		MyDoubleLinkedNode<T> newNode = null;
		MyDoubleLinkedNode<T> currentHead = head;

		if(!this.isEmpty()) {
			newNode = new MyDoubleLinkedNode<T>(null, element, head);
			currentHead.setLeft(newNode);
			head = newNode;
		} else {
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head;
		}

		this.numItems++;

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst(){

		if(!this.isEmpty()) {
			head = head.getRight();
			this.numItems--;
			System.out.println("First item removed successfully!");
		} else {
			System.out.println("ERROR - List is already empty");
		}

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: last
	//-------------------------------------------------------------------
	public T last(){

		if(!this.isEmpty()) {
			return this.tail.getInfo();
		}else {
			System.out.println("Error - List is empty");
		}

		return null;

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element){

		MyDoubleLinkedNode<T> newNode = null;
		MyDoubleLinkedNode<T> currentTail = tail;

		if(!this.isEmpty()) {
			newNode = new MyDoubleLinkedNode<T>(tail, element, null);
			currentTail.setRight(newNode);
			tail = newNode;
		} else {
			tail = new MyDoubleLinkedNode<T>(null, element, null);
			head = tail;
		}

		this.numItems++;

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast(){

		if(!this.isEmpty()) {
			tail = tail.getLeft();
			this.numItems--;
			System.out.println("Last item removed successfully");
		} else {
			System.out.println("ERROR - List is already empty");
		}

	}

}