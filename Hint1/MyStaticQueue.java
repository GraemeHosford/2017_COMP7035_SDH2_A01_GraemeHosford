package hint1;

public class MyStaticQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	private int[] items;
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyStaticQueue(int m){
		this.items = new int[m];
		this.numItems = 0;
		this.maxItems = m;
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

			for(int i : this.items) {

				if(i != 0) {
					return i;
				}
			}
		}

		return 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){

		if(this.numItems < this.maxItems) {
			this.items[numItems] = element;
			this.numItems++;
		} else {
			System.out.println("ERROR - List is already full, cannot add " + element);
		}

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){

		if(!this.isEmpty()) {
			this.items[0] = 0;
			this.numItems--;
			System.out.println("Item removed successfully!");
		} else {
			System.out.println("ERROR - List is already empty");
		}

	}

}
