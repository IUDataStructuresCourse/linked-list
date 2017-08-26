package sequences;

import static org.junit.Assert.*;

public class LinkedListTest {
    @org.junit.Test
    public void begin() throws Exception {
        LinkedList<Integer> L = new LinkedList<Integer>();
        L.begin().equals(L.end());
    }

    @org.junit.Test
    public void insert_front() throws Exception {
        {
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
    }

    @org.junit.Test
    public void insert_after() throws Exception {
        LinkedList<Integer> L = new LinkedList<Integer>();
        L.insert_front(1);
        LinkedList<Integer>.ListIter i = L.begin();

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

}