package week8;


public class Queue {
  private int[] elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 8;

  /** Construct a stack with the default capacity 8 */
  public Queue() {
    this(DEFAULT_CAPACITY);
  }

  /** Construct a stack with the specified capacity */
  public Queue(int capacity) {
    elements = new int[capacity];
  }

  /** Push a new integer into the top of the stack */
  public void enqueue(int value) {
    if (size >= elements.length) {
      int[] temp = new int[elements.length * 2];
      System.arraycopy(elements, 0, temp, 0, elements.length);
      elements = temp;
    }
    elements[size++] = value;
  }

  /** Return and remove the top element from the stack */
  public int dequeue() {
	int element = elements[0];
	size--;
	int[] temp = new int[elements.length];
	for(int i=0; i<size; i++) {
		temp[i]=elements[i+1];
	}
	elements = temp;
    return element;
  }

  /** Return the top element from the stack */
  public int peek() {
    return elements[size-1];
  }

  /** Test whether the stack is empty */
  public boolean empty() {
    return size == 0;
  }

  /** Return the number of elements in the stack */
  public int getSize() {
    return size;
  }
  
  public static void main(String[] args) {
	  Queue queue = new Queue();
	  for(int i=1; i <=20; i++) {
		  queue.enqueue(i);
	  }
	  
	  while(!queue.empty()) {
		  System.out.print(queue.dequeue()+ " ");
	  }
  }
}