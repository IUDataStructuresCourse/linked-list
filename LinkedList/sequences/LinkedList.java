package sequences;
import java.lang.UnsupportedOperationException;

class Node<T> {
    Node(T d, Node<T> n) { data = d; next = n; }
    T data;
    Node<T> next;
}

public class LinkedList<T> implements Sequence<T> {
    private Node<T> front;
        
    // Create a linked list with no elements.
    public LinkedList() {
        throw new UnsupportedOperationException();
    }
        
    public ListIter begin() {
        throw new UnsupportedOperationException();          
    }
        
    public ListIter end() {
        throw new UnsupportedOperationException();
    }
        
    // Add element x to the front of the list.
    public void insert_front(T x) {
        throw new UnsupportedOperationException();
    }

    // Insert element x so that it appears one position after the position pos.
    // precondition: pos is the position of an element in the sequence.
    public void insert_after(ListIter pos, T x) {
        throw new UnsupportedOperationException();
    }

    public class ListIter implements Iter<T> {
        
        Node<T> node;

        ListIter(Node<T> p) {
            throw new UnsupportedOperationException();
        }
      
        public T get() {
            throw new UnsupportedOperationException();
        }

        public void advance() {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Iter<T> other) {
            throw new UnsupportedOperationException();
        }

        public ListIter clone() {
            throw new UnsupportedOperationException();
        }  
      
    }
}
