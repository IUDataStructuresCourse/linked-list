// Sequence and Iterator interfaces (abstract data types)


public interface Sequence<T> {
    Iter<T> begin();
    Iter<T> end();
}


