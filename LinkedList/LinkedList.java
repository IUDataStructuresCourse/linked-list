
class Node<T> {
	Node(T d, Node<T> n) { data = d; next = n; }
	T data;
	Node<T> next;
}

class ListIter<T> implements Iter<T> {
	
  Node<T> node;

  ListIter(Node<T> p) {
      throw NotImplementedException;
  }
  
  public T get() {
      throw NotImplementedException;
  }

  public void advance() {
      throw NotImplementedException;
  }

  public boolean equals(Iter<T> other) {
      throw NotImplementedException;
  }

  public ListIter<T> clone() {
      throw NotImplementedException;
  }  
  
}

public class LinkedList<T> implements Sequence<T> {
	private Node<T> front;
	
	public LinkedList() {
	    throw NotImplementedException;
	}
	
	public ListIter<T> begin() {
	    throw NotImplementedException;	    
	}
	
	public ListIter<T> end() {
	    throw NotImplementedException;
	}
	
	public void insert_front(T x) {
	    throw NotImplementedException;
	}
	
	// precondition: pos is a legit position in the sequence
	public void insert_after(ListIter<T> pos, T x) {

	}
	
	public static void main(String[] args) {
		{
			// Test begin, end, and Iter.equals for empty list
			LinkedList<Integer> L = new LinkedList<Integer>();
			L.begin().equals(L.end());
		}
		{
			// Test insert_front, begin, and get
			LinkedList<Integer> L = new LinkedList<Integer>();		
			L.insert_front(3);
			assert L.begin().get() == 3;
		}
		{
			// Test a sequence of insert_front's
			LinkedList<Integer> L = new LinkedList<Integer>();		
			L.insert_front(3); L.insert_front(2); L.insert_front(1);
			Integer A[] = {1,2,3};
			assert SeqAlgo.equals(L, new ArraySequence<Integer>(A));
		}
		{
			LinkedList<Integer> L = new LinkedList<Integer>();		
			L.insert_front(1);
			ListIter<Integer> i = L.begin();
			
			// Test insert_after on the first position
			L.insert_after(i, 2);
			
			// Test insert_after on the last position
			i = L.begin(); i.advance();
			L.insert_after(i, 4);
			Integer B[] = {1,2,4};
			assert SeqAlgo.equals(L, new ArraySequence<Integer>(B));
			
			// Test insert_after in the middle 
			i = L.begin(); i.advance();
			L.insert_after(i, 3);
			Integer C[] = {1,2,3,4};
			assert SeqAlgo.equals(L, new ArraySequence<Integer>(C));
		}
		System.out.println("tests passed");
	}

}